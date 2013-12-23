package com.paipai.api.test.deal;

import java.io.IOException;
import java.io.UnsupportedEncodingException;

import com.paipai.api.test.util.ApiTestEnum;
import com.paipai.api.test.util.TestAPIBase;
import com.paipai.api.util.ApiParameter;

/**
 * ���Բ�ѯ��������ӿ�
 * @author ankerdiao
 * @date 2010-5-5
 */
public class TestGetDealDetailAPI extends TestAPIBase{

	@Override
	protected void setUp() throws Exception {
		super.setUp();
		this.keyFileName="795019792_gamma";	//����Token�ķ�ʽ��������
//		this.sessionKey = "@F9h5ShyyP";		//����SessionKey�ķ�ʽ��������
	}
	
	@Override
	protected void tearDown() throws Exception {
		super.tearDown();
	}
	
	public void testGetDealDetailJSON() throws UnsupportedEncodingException, IOException {
		ApiParameter parameter = new ApiParameter();
		parameter.addStringParam("dealCode", "795019792-20100812-8060427");
		parameter.addStringParam("sellerUin", getUin());
		parameter.addStringParam("listItem", "1");
		testBase(parameter, "xml", ApiTestEnum.getDealDetail);
	}
	
	public void GetDealDetailXML() throws UnsupportedEncodingException, IOException {
		ApiParameter parameter = new ApiParameter();
		parameter.addStringParam("dealCode", "855002000-20100724-354835354");
		parameter.addStringParam("sellerUin", getUin());
		parameter.addStringParam("listItem", "1");
		testBase(parameter, "json", ApiTestEnum.getDealDetail);
		
	}
	
	
}
