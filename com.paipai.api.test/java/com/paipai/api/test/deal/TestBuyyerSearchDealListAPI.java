package com.paipai.api.test.deal;

import java.io.IOException;
import java.io.UnsupportedEncodingException;

import com.paipai.api.test.util.ApiTestEnum;
import com.paipai.api.test.util.TestAPIBase;
import com.paipai.api.util.ApiParameter;

/**
 * 测试买家查询订单列表接口（内部使用）
 * @author ankerdiao
 * @date 2010-5-5
 */
public class TestBuyyerSearchDealListAPI extends TestAPIBase{

	@Override
	protected void setUp() throws Exception {
		super.setUp();
		this.keyFileName="214689727_local";
		this.IP_PORT = "http://172.30.25.135:8080";
	}
	
	public void testBuyyerSearchDealListJSON() throws UnsupportedEncodingException, IOException {
		ApiParameter parameter = new ApiParameter();
//		parameter.addStringParam("dealCode", "214689727-20100322-5000111");
//		parameter.addStringParam("sellerUin", uin);
		parameter.addStringParam("buyerUin", getUin());
		parameter.addStringParam("listItem", "1");
//		parameter.addStringParam("itemType", "IT_CARD");
		testBase(parameter, "json", ApiTestEnum.buyerSearchDealList);
	}
	
	public void testBuyyerSearchDealListXML() throws UnsupportedEncodingException, IOException {
		ApiParameter parameter = new ApiParameter();
		parameter.addStringParam("buyerUin", getUin());
		parameter.addStringParam("listItem", "1");
		testBase(parameter, "xml", ApiTestEnum.buyerSearchDealList);
	}
	
	
}
