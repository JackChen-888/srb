package com.atguigu.srb.core.hfb;

import com.alibaba.fastjson.JSONObject;
import com.atguigu.common.util.HttpUtils;
import com.atguigu.common.util.Md5;
import lombok.extern.slf4j.Slf4j;

import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * @author Chen
 */
@Slf4j
public class RequestHelper {
    private final static String SIGN = "sign";

    /**
     * 请求数据获取签名
     *
     * @param paramMap /
     * @return /
     */
    public static String getSign(Map<String, Object> paramMap) {
        paramMap.remove(SIGN);
        TreeMap<String, Object> sorted = new TreeMap<>(paramMap);
        StringBuilder str = new StringBuilder();
        for (Map.Entry<String, Object> param : sorted.entrySet()) {
            str.append(param.getValue()).append("|");
        }
        str.append(HfbConst.SIGN_KEY);
        log.info("加密前：" + str);
        String md5Str = Md5.encrypt(str.toString());
        log.info("加密后：" + md5Str);
        return md5Str;
    }

    /**
     * Map转换
     *
     * @param paramMap /
     * @return /
     */
    public static Map<String, Object> switchMap(Map<String, String[]> paramMap) {
        Map<String, Object> resultMap = new HashMap<>(16);
        for (Map.Entry<String, String[]> param : paramMap.entrySet()) {
            resultMap.put(param.getKey(), param.getValue()[0]);
        }
        return resultMap;
    }

    /**
     * 签名校验
     *
     * @param paramMap /
     * @return /
     */
    public static boolean isSignEquals(Map<String, Object> paramMap) {
        String sign = (String) paramMap.get("sign");
        String md5Str = getSign(paramMap);
        return sign.equals(md5Str);
    }

    /**
     * 获取时间戳
     *
     * @return /
     */
    public static long getTimestamp() {
        return System.currentTimeMillis();
    }

    /**
     * 封装同步请求
     *
     * @param paramMap /
     * @param url /
     * @return /
     */
    public static JSONObject sendRequest(Map<String, Object> paramMap, String url) {
        String result = "";
        try {
            //封装post参数
            StringBuilder postdata = new StringBuilder();
            for (Map.Entry<String, Object> param : paramMap.entrySet()) {
                postdata.append(param.getKey()).append("=")
                        .append(param.getValue()).append("&");
            }
            log.info(String.format("--> 发送请求到汇付宝：post data %1s", postdata));
            byte[] reqData = postdata.toString().getBytes(StandardCharsets.UTF_8);
            byte[] respdata = HttpUtils.doPost(url, reqData);
            result = new String(respdata);
            log.info(String.format("--> 汇付宝应答结果：result data %1s", result));
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return JSONObject.parseObject(result);
    }
}
