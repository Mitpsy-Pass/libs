package com.paipai.api.test.deal;

import java.io.IOException;
import java.io.UnsupportedEncodingException;

import com.paipai.api.test.util.ApiTestEnum;
import com.paipai.api.test.util.TestAPIBase;
import com.paipai.api.util.ApiParameter;

/**
 * 卖家延长订单收货时间
 * @author ankerdiao
 * @date 2010-5-17
 */
public class TestSellerDelayConsignmentTimeAPI extends TestAPIBase{

	@Override
	protected void setUp() throws Exception {
		super.setUp();
		this.keyFileName="214689727_idc";
		this.sessionKey="@cYRoiMcyU";
	}
	

	public void testSellerDelayConsignmentTimeJson() throws UnsupportedEncodingException, IOException {
		ApiParameter parameter = new ApiParameter();
		parameter.addStringParam("dealCode", "214689727-20100517-5100173");
		parameter.addStringParam("sellerUin", getUin());
		parameter.addStringParam("days", "5");
		super.testBase(parameter, "json", ApiTestEnum.sellerDelayConsignmentTime);
	}
	



	public void testSellerDelayConsignmentTimeXML() throws UnsupportedEncodingException, IOException {
		ApiParameter parameter = new ApiParameter();
		parameter.addStringParam("dealCode", "214689727-20100330-5509632");
		parameter.addStringParam("sellerUin", getUin());
		parameter.addStringParam("days", "8");
		super.testBase(parameter, "xml", ApiTestEnum.sellerDelayConsignmentTime);
	}
}
