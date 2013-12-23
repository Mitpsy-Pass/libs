package com.paipai.api.test.item;

import java.io.IOException;
import java.io.UnsupportedEncodingException;

import com.paipai.api.test.util.ApiTestEnum;
import com.paipai.api.test.util.TestAPIBase;
import com.paipai.api.util.ApiParameter;

/**
 * 测试查询商品详情接口
 * @author ankerdiao
 * @date 2010-5-14
 */
public class TestGetItemAPI extends TestAPIBase{

	@Override
	protected void setUp() throws Exception {
		super.setUp();
		this.keyFileName="214689727_local";
	}
	
	/**
	 * 测试查询商品详细信息 JSON
	 * @throws UnsupportedEncodingException
	 * @throws IOException
	 */
	public void testGetItemJson() throws UnsupportedEncodingException, IOException {
		ApiParameter parameter = new ApiParameter();
		parameter.addStringParam("itemCode", "BFE7CB0C00000000003F39800001B98B");
//		parameter.addStringParam("itemLocalCode", "6022_1005");
//		parameter.addStringParam("needParseAttr", "1");
//		parameter.addStringParam("needDetailInfo", "1");
//		parameter.addStringParam("needExtendInfo", "1");
		testBase(parameter, "json", ApiTestEnum.getItem);
	}
	
	
}
