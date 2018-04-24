package com.wilder.power_supply.service;

import com.wilder.power_supply.model.Project;

import java.util.List;

/**
 * Created by K Lin
 * Date: 2018/4/24.
 * Time: 22:22
 * Remember to sow in the spring.
 * Description : power_supply
 */
public interface ProjectService {
    /**
     * 利用前端传来的数据生成excel文档并给出链接
     * @param list
     * @throws Exception
     */
    String createExcelHandler(String filePath,List<Project> list)throws Exception;
}
