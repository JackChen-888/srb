package com.atguigu.srb.core.service;

import com.atguigu.srb.core.pojo.dto.ExcelDictDTO;
import com.atguigu.srb.core.pojo.entity.Dict;
import com.baomidou.mybatisplus.extension.service.IService;

import java.io.InputStream;
import java.util.List;

/**
 * <p>
 * 数据字典 服务类
 * </p>
 *
 * @author Chen
 * @since 2021-05-21
 */
public interface DictService extends IService<Dict> {

    /**
     * 批量导入
     *
     * @param inputStream /
     */
    void importData(InputStream inputStream);

    /**
     * 批量导出
     *
     * @return /
     */
    List<ExcelDictDTO> listDictData();

    /**
     * 查询列表
     *
     * @param parentId /
     * @return /
     */
    List<Dict> listByParentId(Long parentId);

    /**
     * 根据dictCode获取下级节点
     *
     * @param dictCode /
     * @return /
     */
    List<Dict> findByDictCode(String dictCode);

    /**
     * 计算下拉列表选中内容
     *
     * @param education  /
     * @param education1 /
     * @return /
     */
    String getNameByParentDictCodeAndValue(String education, Integer education1);
}
