package com.paipai.api.test.item;

import java.io.IOException;
import java.io.UnsupportedEncodingException;

import com.paipai.api.test.util.ApiTestEnum;
import com.paipai.api.test.util.TestAPIBase;
import com.paipai.api.util.ApiParameter;


/**
 * 测试修改商品信息
 * @author ankerdiao
 * @date 2010-5-14
 */
public class TestModifyItemAPI extends TestAPIBase {

	@Override
	protected void setUp() throws Exception {
		super.setUp();
		super.keyFileName="1506213786_idc";
	}

	

	public void testModifyItemJSON() throws UnsupportedEncodingException, IOException{
		ApiParameter parameter = new ApiParameter();
		parameter.addStringParam("itemCode", "9AFFC65900000000001A39BE0692253E");
//		parameter.addStringParam("itemLocalCode", "anker_anki_1000");
//		parameter.addStringParam("cityId", "504");
//		parameter.addStringParam("provinceId", "5");
//		parameter.addStringParam("countryId", "0");
		parameter.addStringParam("itemName", "我叫王鹏，来自北京，我爱下棋");
		parameter.addStringParam("stockInfo", "32400,777");
//		parameter.addStringParam("attr", "31:4001|30:800|2ed2:3|2ed0:2|517:2|516:3|573:4|33:12|2ee0:2|37:59|35:1|34:5|305c:7|39:1|38:2^3d1b:P100622000133");
		testBase(parameter, "json", ApiTestEnum.modifyItem);
	}
	
	public void ModifyItemXML() throws UnsupportedEncodingException, IOException{
		ApiParameter parameter = new ApiParameter();
		parameter.addStringParam("itemLocalCode", "dev_anker_6023_10000");
		parameter.addStringParam("itemName", "dev测试商品");
		parameter.addStringParam("cityId", "40000");
		parameter.addStringParam("provinceId", "0");
		parameter.addStringParam("countryId", "0");
		testBase(parameter, "xml", ApiTestEnum.modifyItem);
	}
}
