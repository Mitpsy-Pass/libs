package com.paipai.api.test.deal;

import java.io.IOException;
import java.io.UnsupportedEncodingException;

import com.paipai.api.test.util.ApiTestEnum;
import com.paipai.api.test.util.TestAPIBase;
import com.paipai.api.util.ApiParameter;

/**
 * ��Ԫ�������Ҳ�ѯ�����б�ӿ�
 * @author ankerdiao
 * @date 2010-5-5
 */
public class TestSellerSearchDealListAPI extends TestAPIBase{

	@Override
	protected void setUp() throws Exception {
		super.setUp();
		//this.keyFileName="855000188_idc";
		super.charset="utf-8";
//		super.debug = false;
	}
	
	public void testSellerSearchDealListJSON() throws UnsupportedEncodingException, IOException {
		ApiParameter parameter = new ApiParameter();
//		parameter.addStringParam("dealCode", "855000188-20100809-363110208");
//		parameter.addStringParam("itemCode", "9C66F63200000000001C39E8068FB41D����ū��");
		parameter.addStringParam("sellerUin", getUin());
		parameter.addStringParam("listItem", "1");
//		parameter.addStringParam("dealState", "DS_WAIT_SELLER_DELIVERY");
//		parameter.addStringParam("orderField", "CREATE_TIME");
//		parameter.addStringParam("orderDesc", "0");
//		parameter.addStringParam("timeType", "CREATE");
//		parameter.addStringParam("timeBegin", "2010-07-20 00:00:00");
//		parameter.addStringParam("timeEnd", "2010-08-20 23:59:30");
//		parameter.addStringParam("orderDesc", "1");
//		parameter.addStringParam("listItem", "1");
		for (int i = 0; i < 1; i++) {
			testBase(parameter, "xml", ApiTestEnum.sellerSearchDealList);
		}
	}
	
	public void SellerSearchDealListXML() throws UnsupportedEncodingException, IOException {
		ApiParameter parameter = new ApiParameter();
//		parameter.addStringParam("dealCode", "214689727-20100422-5040273");
		parameter.addStringParam("sellerUin", getUin());
		parameter.addStringParam("listItem", "1");
//		parameter.addStringParam("pageIndex", "2");
//		parameter.addStringParam("pageSize", "2");
//		parameter.addStringParam("dealState", "DS_WAIT_SELLER_DELIVERY");
		testBase(parameter, "xml", ApiTestEnum.sellerSearchDealList);
	}
	
	
}
