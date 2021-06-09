package com.atguigu.srb.sms.service;

import java.util.Map;

/**
 * @author Chen
 */
public interface SmsService {
    /**
     * @param mobile       /
     * @param templateCode /
     * @param param        /
     */
    void send(String mobile, String templateCode, Map<String, Object> param);
}