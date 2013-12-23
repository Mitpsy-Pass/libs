package com.paipai.api.test.item;

import java.io.IOException;
import java.io.UnsupportedEncodingException;

import com.paipai.api.test.util.ApiTestEnum;
import com.paipai.api.test.util.TestAPIBase;
import com.paipai.api.util.ApiParameter;

/**
 * �������Ҳ�ѯ��Ʒ�б�
 * @author ankerdiao
 * @date 2010-5-14
 */
public class TestSellerSearchItemListAPI extends TestAPIBase{

	@Override
	protected void setUp() throws Exception {
		super.setUp();
//		this.keyFileName = "214689727_dev";
	}
	
//	public void testSellerSearchItemListJSON() throws UnsupportedEncodingException, IOException {
//		ApiParameter parameter = new ApiParameter();
//		parameter.addStringParam("sellerUin", "50681622");
//		testBase(parameter, "json", ApiTestEnum.sellerSearchItemList);
//	}
	
	public void testSellerSearchItemListXML() throws UnsupportedEncodingException, IOException {
		ApiParameter parameter = new ApiParameter();
		parameter.addStringParam("sellerUin", "50681622");
		testBase(parameter, "xml", ApiTestEnum.sellerSearchItemList);
	}
}
