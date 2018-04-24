package com.wilder.power_supply.controller;

import com.wilder.power_supply.model.Meterial;
import com.wilder.power_supply.model.Project;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * Created by K Lin
 * Date: 2018/4/24.
 * Time: 20:24
 * Remember to sow in the spring.
 * Description : power_supply
 */
@Controller
public class CreateExcelController {
    @PostMapping(value = "/creatExcel")
    public String createExcel(@RequestBody Project project){

        return null;
    }
}
