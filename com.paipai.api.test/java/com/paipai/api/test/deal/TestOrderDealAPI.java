package com.paipai.api.test.deal;

import java.io.IOException;
import java.io.UnsupportedEncodingException;

import com.paipai.api.test.util.ApiTestEnum;
import com.paipai.api.test.util.TestAPIBase;
import com.paipai.api.util.ApiParameter;


/**
 * ȡ�������ӿڵĲ���
 * @author ankerdiao
 * @date 2010-3-22
 */
public class TestOrderDealAPI extends TestAPIBase{

	@Override
	protected void setUp() throws Exception {
		super.setUp();
		this.keyFileName = "214689727_idc";
	}
	
	
	public void testOrderDeal() throws UnsupportedEncodingException, IOException {
		ApiParameter parameter = new ApiParameter();
		parameter.addStringParam("sellerUin", "9438735112");
		parameter.addStringParam("itemCode", "E75D423800000000006739470001B7C2");
		parameter.addStringParam("visitkey", "20713498965183002");
		parameter.addStringParam("itemStockAttr", "��ɫ:��ɫ|����:L");
		parameter.addStringParam("buyerNote", "����API�µ�����ʵ��һ�ڼ�");
		parameter.addStringParam("receiveAddress", "���ڷ��Ǵ�");
		parameter.addStringParam("receiveMobile", "0755");
		parameter.addStringParam("receiveName", "����QGG");
		parameter.addStringParam("receivePhone", "138222222555");
		parameter.addStringParam("receivePost", "584111");
//		parameter.addStringParam("reserveIn", "1");
		testBase(parameter, "xml", ApiTestEnum.orderDeal);
//		parameter.addStringParam("regionId", "23");
	}

}
