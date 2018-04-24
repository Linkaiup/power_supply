package com.wilder.power_supply.service.Impl;

import com.wilder.power_supply.model.Project;
import com.wilder.power_supply.service.ProjectService;
import com.wilder.power_supply.utils.ExcelUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by K Lin
 * Date: 2018/4/24.
 * Time: 22:22
 * Remember to sow in the spring.
 * Description : power_supply
 */
@Service
@Slf4j
@Transactional(rollbackFor = Exception.class)
public class ProjectServiceImpl implements ProjectService {
    @Override
    public String createExcelHandler(String filePath,List<Project> list)throws Exception{
        if (list.size() == 0){
            throw new Exception("数据项中没有数据");
        }
        ExcelUtil.setProjectToExcel(filePath,list);
        return filePath;
    }
}
