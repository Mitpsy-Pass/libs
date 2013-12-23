package com.paipai.api.test.item;

import java.io.IOException;
import java.io.UnsupportedEncodingException;

import com.paipai.api.test.util.ApiTestEnum;
import com.paipai.api.test.util.TestAPIBase;
import com.paipai.api.util.ApiParameter;

/**
 * 测试修改商品的状态：上架、下架、预删除
 * @author ankerdiao
 * @date 2010-5-14
 */
public class TestModifyItemStockAPI extends TestAPIBase{

	@Override
	protected void setUp() throws Exception {
		super.setUp();
		this.keyFileName = "855000188_idc";
		charset = "utf-8";
	}
	
	public void testModifyItemStockJSON() throws UnsupportedEncodingException, IOException {
		ApiParameter parameter = new ApiParameter();
		parameter.addStringParam("itemCode", "7C44F63200000000007C39A9064A181E");
//		parameter.addStringParam("itemLocalCode", "5028127");
//		parameter.addStringParam("stockPrice", "884500");
		parameter.addStringParam("stockCount", "0");
//		parameter.addStringParam("stockLocalCode", "5028127-4-M");
//		parameter.addStringParam("stockAttr", "男装尺码:M|颜色:红色");
		testBase(parameter, "json", ApiTestEnum.modifyItemStock);
	}
	
}
