package com.wilder.power_supply;

import com.wilder.power_supply.model.Meterial;
import com.wilder.power_supply.service.Impl.MeterialServiceImpl;
import com.wilder.power_supply.service.MeterialService;
import com.wilder.power_supply.utils.ExcelUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PowerSupplyApplicationTests {

	@Autowired
	private MeterialService meterialService;

	@Test
	public void contextLoads() throws Exception {
		List<Meterial> meterials = new ArrayList<>();
		ExcelUtil.getMeterialFromExcel("F:\\QG工作\\外包项目\\佛山电网\\业扩材料表（分类）20180410.xls", meterials);
		System.out.println(meterialService.creatExcelHandler("禅城电网项目",meterials));
	}

}
