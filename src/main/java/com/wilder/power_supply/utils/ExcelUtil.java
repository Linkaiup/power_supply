package com.wilder.power_supply.utils;


import com.alibaba.excel.ExcelReader;
import com.alibaba.excel.ExcelWriter;
import com.alibaba.excel.metadata.Sheet;
import com.alibaba.excel.support.ExcelTypeEnum;
import com.wilder.power_supply.model.Meterial;
import com.wilder.power_supply.model.Project;

import java.io.*;
import java.util.List;

/**
 * @author:Wilder Gao
 * @time:2018/4/14
 * @Discription：操作excel表格工具类
 */
public class ExcelUtil {

    public static void getMeterialFromExcel(String excelPath, List<Meterial> list){
            InputStream inputStream = null;
        try {
            inputStream = new FileInputStream(new File(excelPath));
            ExcelListener listener = new ExcelListener();
            listener.setDatas(list);

            ExcelReader reader = new ExcelReader(inputStream, ExcelTypeEnum.XLS, null, listener);

            reader.read(new Sheet(2, 2, Meterial.class));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }finally {
            try {
                inputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void setProjectToExcel(String excelPath,List<Project> list){
        OutputStream outputStream = null;
        try {
            outputStream = new FileOutputStream(excelPath);
            ExcelWriter writer = new ExcelWriter(outputStream, ExcelTypeEnum.XLSX,false);
            //写第一个sheet, sheet1  数据 List<String> 有模型映射关系
            Sheet sheet1 = new Sheet(1, 1,Project.class);
            sheet1.setSheetName("材料汇总表");
            writer.write(list, sheet1);
            writer.finish();
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            try {
                outputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
