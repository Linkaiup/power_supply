package com.wilder.power_supply.controller;

import com.wilder.power_supply.exception.PowerException;
import com.wilder.power_supply.model.Project;
import com.wilder.power_supply.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
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
    public String createExcel(@RequestBody Map<String,List<Map<String,Object>>> map, HttpServletRequest request)throws PowerException {
        System.out.println(map);
        String name = "projects";
        if(!map.containsKey(name) || map.get(name) == null){
            throw  new PowerException("所传参数为空");
        }
        List<Map<String,Object>> projects = map.get(name);
        List<Project> list = new ArrayList<>();
        for (Map<String,Object> project : projects){
            Project project1 = new Project();
            if (!project.containsKey("id") || project.get("id") == null){
                project1.setId(0);
            }else {
                project1.setId((Integer) project.get("id"));
            }
            if (!project.containsKey("office") || project.get("office") == null){
                project1.setOffice("");
            }else {
                project1.setOffice((String) project.get("office"));
            }
            list.add(project1);
        }
        System.out.println(list);
        String filePath = request.getServletContext().getRealPath("/static/" + "禅城电网.xls");
        System.out.println(filePath);
//        try {
//            projectService.createExcelHandler(filePath,list);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
        return "OK";
    }
}
