package com.paipai.api.test.deal;

import java.io.IOException;
import java.io.UnsupportedEncodingException;

import com.paipai.api.test.util.ApiTestEnum;
import com.paipai.api.test.util.TestAPIBase;
import com.paipai.api.util.ApiParameter;

/**
 * 测试备注订单信息
 * @author ankerdiao
 * @date 2010-5-20
 */
public class TestModifySellerNoteAPI extends TestAPIBase{

	@Override
	protected void setUp() throws Exception {
		super.setUp();
		this.keyFileName = "214689727_dev";
	}
	

	public void testModifySellerNoteJson() throws UnsupportedEncodingException, IOException {
		ApiParameter parameter = new ApiParameter();
		parameter.addStringParam("dealCode", "214689727-20100511-333968502");
		parameter.addStringParam("sellerUin", getUin());
		parameter.addStringParam("dealNote", "这里添加订单的备注信息");
		testBase(parameter, "json", ApiTestEnum.modifySellerNote);
	}
	
	public void testModifySellerNoteXML() throws UnsupportedEncodingException, IOException {
		ApiParameter parameter = new ApiParameter();
		parameter.addStringParam("dealCode", "214689727-20100505-5080173");
		parameter.addStringParam("sellerUin", getUin());
		parameter.addStringParam("dealNote", "这里添加订单的备注信息");
		testBase(parameter, "xml", ApiTestEnum.modifySellerNote);
	}
}
