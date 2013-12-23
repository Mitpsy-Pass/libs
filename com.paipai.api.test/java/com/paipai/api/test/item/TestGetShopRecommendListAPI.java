package com.paipai.api.test.item;

import java.io.IOException;
import java.io.UnsupportedEncodingException;

import com.paipai.api.test.util.ApiTestEnum;
import com.paipai.api.test.util.TestAPIBase;
import com.paipai.api.util.ApiParameter;

/**
 * 测试查询店铺推荐商品列表
 * @author ankerdiao
 * @date 2010-5-14
 */
public class TestGetShopRecommendListAPI extends TestAPIBase{

	@Override
	protected void setUp() throws Exception {
//		super.setUp();
//		this.keyFileName="214689727_idc";
	}
	

	public void testGetShopRecommendListJson() throws UnsupportedEncodingException, IOException {
		ApiParameter parameter = new ApiParameter();
		parameter.addStringParam("sellerUin", super.uin);
		testBase(parameter, "json", ApiTestEnum.getShopRecommendList);
	}
	
	public void testGetShopRecommendListXML() throws UnsupportedEncodingException, IOException {
		ApiParameter parameter = new ApiParameter();
		parameter.addStringParam("sellerUin", super.uin);
		testBase(parameter, "xml", ApiTestEnum.getShopRecommendList);
	}
}
