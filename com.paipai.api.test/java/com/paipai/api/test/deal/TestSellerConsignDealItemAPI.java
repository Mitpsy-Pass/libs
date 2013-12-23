package com.paipai.api.test.deal;

import java.io.IOException;
import java.io.UnsupportedEncodingException;

import com.paipai.api.test.util.ApiTestEnum;
import com.paipai.api.test.util.TestAPIBase;
import com.paipai.api.util.ApiParameter;

/**
 * ���ұ�Ƕ�������
 * @author ankerdiao
 * @date 2010-5-5
 */
public class TestSellerConsignDealItemAPI extends TestAPIBase{

	@Override
	protected void setUp() throws Exception {
		super.setUp();
		this.keyFileName="795019792_gamma";
	}
	

	public void testSellerConsignDealItemJson() throws UnsupportedEncodingException, IOException {
		ApiParameter parameter = new ApiParameter();
		parameter.addStringParam("dealCode", "795019792-20100812-8060427");
		parameter.addStringParam("sellerUin", getUin());
		parameter.addStringParam("logisticsName", "EMS");
		parameter.addStringParam("logisticsDesc", "���ѷ��������");
		parameter.addStringParam("logisticsCode", "EG907660696CS");
		parameter.addStringParam("arriveDays", "5");
		super.testBase(parameter, "json", ApiTestEnum.sellerConsignDealItem);
	}
	



	public void SellerConsignDealItemXML() throws UnsupportedEncodingException, IOException {
		ApiParameter parameter = new ApiParameter();
		parameter.addStringParam("dealCode", "214689727-20100330-5509632");
		parameter.addStringParam("sellerUin", getUin());
		parameter.addStringParam("logisticsName", "������˾������");
		parameter.addStringParam("logisticsDesc", "����������������");
		parameter.addStringParam("logisticsCode", "252122212421212451212");
		parameter.addStringParam("arriveTime", "2010-05-07 12:30:25");
		testBase(parameter, "xml", ApiTestEnum.sellerConsignDealItem);
	}
}
