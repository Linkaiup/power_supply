package com.wilder.power_supply.model;

import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.metadata.BaseRowModel;
import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * Created by K Lin
 * Date: 2018/4/24.
 * Time: 22:17
 * Remember to sow in the spring.
 * Description : power_supply
 */
@AllArgsConstructor
@Data
public class Demand extends BaseRowModel{
    @ExcelProperty(value = "序号",index = 0)
    private int id;

    @ExcelProperty(value = "项目编号",index = 4)
    private String serialNumber;

    @ExcelProperty(value = "物资编码",index = 6)
    private String materialCode;

    @ExcelProperty(value = "需求数量",index = 11)
    private int number;
}
