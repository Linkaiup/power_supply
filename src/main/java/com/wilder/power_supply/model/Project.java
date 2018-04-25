package com.wilder.power_supply.model;

import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.metadata.BaseRowModel;
import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * Created by K Lin
 * Date: 2018/4/24.
 * Time: 21:42
 * Remember to sow in the spring.
 * Description : power_supply
 */
@AllArgsConstructor
@Data
public class Project extends BaseRowModel {
    @ExcelProperty(value = "序号",index = 0)
    private int id;

    @ExcelProperty(value = "区局",index = 1)
    private String office;

//    @ExcelProperty(value = "批次",index = 2)
//    private String batch;
//
//    @ExcelProperty(value = "供电所",index = 3)
//    private String administration;
//
//    @ExcelProperty(value = "项目编号",index = 4)
//    private String serialNumber;
//
//    @ExcelProperty(value = "工程名称",index = 5)
//    private String projectName;
//
//    @ExcelProperty(value = "物资编码",index = 6)
//    private String materialCode;
//
//    @ExcelProperty(value = "物资名称",index = 7)
//    private String materialName;
//
//    @ExcelProperty(value = "规格型号及备注（线缆分盘长度）",index = 8)
//    private String specification;
//
//    @ExcelProperty(value = "概算单价",index = 9)
//    private String countUnit;
//
//    @ExcelProperty(value = "计量单位",index = 10)
//    private double unitPrice;
//
//    @ExcelProperty(value = "需求数量",index = 11)
//    private int number;
//
//    @ExcelProperty(value = "分段长度",index = 12)
//    private String length;
//
//    @ExcelProperty(value = "物资供应方式",index = 13)
//    private String supplyWay;
}
