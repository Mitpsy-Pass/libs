package com.paipai.api.test.deal;

import java.io.IOException;
import java.io.UnsupportedEncodingException;

import com.paipai.api.test.util.ApiTestEnum;
import com.paipai.api.test.util.TestAPIBase;
import com.paipai.api.util.ApiParameter;

/**
 * 测试卖家标记订单缺货的接口
 * @author ankerdiao
 * @date 2010-5-12
 */
public class TestSellerSignDealOutOfStockAPI extends TestAPIBase{

	@Override
	protected void setUp() throws Exception {
		super.setUp();
		this.keyFileName = "843072074_idc";
	}
	

	public void testSellerSignDealOutOfStockJson() throws UnsupportedEncodingException, IOException {
		ApiParameter parameter = new ApiParameter();
		parameter.addStringParam("dealCode", "843072074-20100618-3456036321111");
		parameter.addStringParam("sellerUin", getUin());
		testBase(parameter, "json", ApiTestEnum.sellerSignDealOutOfStock);
	}
	
	public void testSellerSignDealOutOfStockXML() throws UnsupportedEncodingException, IOException {
		ApiParameter parameter = new ApiParameter();
		parameter.addStringParam("dealCode", "214689727-20100505-5080173");
		parameter.addStringParam("sellerUin", getUin());
		testBase(parameter, "xml", ApiTestEnum.sellerSignDealOutOfStock);
	}
}
