package com.wilder.power_supply.controller;

import com.wilder.power_supply.exception.MyException;
import com.wilder.power_supply.model.Meterial;
import com.wilder.power_supply.model.Project;
import com.wilder.power_supply.service.Impl.ProjectServiceImpl;
import com.wilder.power_supply.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;

/**
 * Created by K Lin
 * Date: 2018/4/24.
 * Time: 20:24
 * Remember to sow in the spring.
 * Description : power_supply
 */
@Controller
public class CreateExcelController {
    @Autowired
    private ProjectService projectService;

    @PostMapping(value = "/createExcel")
    public String createExcel(@RequestBody Map<String,List<Map<String,Object>>> projects, HttpServletRequest request)throws MyException{
        System.out.println(projects);
        projects.containsKey("projects");
        System.out.println(projects);
        String filePath = request.getServletContext().getRealPath("/static/" + "禅城电网.xls");
        return filePath;
    }
}
