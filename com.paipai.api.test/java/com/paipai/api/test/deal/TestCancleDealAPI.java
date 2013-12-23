package com.paipai.api.test.deal;

import java.io.IOException;
import java.io.UnsupportedEncodingException;

import com.paipai.api.test.util.ApiTestEnum;
import com.paipai.api.test.util.TestAPIBase;
import com.paipai.api.util.ApiParameter;


/**
 * 取消订单接口的测试
 * @author ankerdiao
 * @date 2010-3-22
 */
public class TestCancleDealAPI extends TestAPIBase{

	@Override
	protected void setUp() throws Exception {
		super.setUp();
		this.keyFileName = "214689727_local";
//		super.sessionKey = "@NeOKobGhA";
	}
	

	public void CancleDealJson() throws UnsupportedEncodingException, IOException {
		ApiParameter parameter = new ApiParameter();
		parameter.addStringParam("dealCode", "1074000107-20100623-8081217");
		parameter.addStringParam("sellerUin", getUin());
		parameter.addStringParam("closeReason", "2");
		testBase(parameter, "json", ApiTestEnum.sellerCancelDeal);
	}
	
	public void testCancleDealXML() throws UnsupportedEncodingException, IOException {
		ApiParameter parameter = new ApiParameter();
		parameter.addStringParam("dealCode", "214689727-20100505-5080173");
		parameter.addStringParam("buyerUin", getUin());
		parameter.addStringParam("closeReason", "3");
		testBase(parameter, "json", ApiTestEnum.buyerCancelDeal);
	}
}
