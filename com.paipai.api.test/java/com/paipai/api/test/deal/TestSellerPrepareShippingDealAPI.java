package com.paipai.api.test.deal;

import java.io.IOException;
import java.io.UnsupportedEncodingException;

import com.paipai.api.test.util.ApiTestEnum;
import com.paipai.api.test.util.TestAPIBase;
import com.paipai.api.util.ApiParameter;


/**
 * 卖家标记订单配货中
 * @author ankerdiao
 * @date 2010-5-10
 */
public class TestSellerPrepareShippingDealAPI extends TestAPIBase{

	@Override
	protected void setUp() throws Exception {
		super.setUp();
		this.keyFileName = "855000188_idc";
	}
	

	public void testSellerSignDealPreparingJson() throws UnsupportedEncodingException, IOException {
		ApiParameter parameter = new ApiParameter();
		parameter.addStringParam("dealCode", "843072074-20100618-342260573");
		parameter.addStringParam("sellerUin", getUin());
		super.testBase(parameter, "json", ApiTestEnum.sellerSignDealPreparing);
	}
	



	public void testSellerSignDealPreparingXML() throws UnsupportedEncodingException, IOException {
		ApiParameter parameter = new ApiParameter();
		parameter.addStringParam("dealCode", "214689727-20100330-5509632");
		parameter.addStringParam("sellerUin", getUin());
		testBase(parameter, "xml", ApiTestEnum.sellerSignDealPreparing);
	}
}
