package com.paipai.api.test.item;

import java.io.IOException;
import java.io.UnsupportedEncodingException;

import com.paipai.api.test.util.ApiTestEnum;
import com.paipai.api.test.util.TestAPIBase;
import com.paipai.api.util.ApiParameter;


/**
 * 测试买家查询商品列表
 * @author ankerdiao
 * @date 2010-5-14
 */
public class TestBuyerSearchItemListAPI extends TestAPIBase{

	@Override
	protected void setUp() throws Exception {
		super.setUp();
		this.keyFileName="214689727_local";
	}
	
	public void testBuyerSearchItemListJSON() throws UnsupportedEncodingException, IOException{
		ApiParameter parameter = new ApiParameter();
		
		parameter.addStringParam("sellerUin", super.uin);
		
		testBase(parameter, "json", ApiTestEnum.buyerSearchItemList);
	}
	
	public void testBuyerSearchItemListXML() throws UnsupportedEncodingException, IOException{
		ApiParameter parameter = new ApiParameter();
		
		parameter.addStringParam("sellerUin", super.uin);
		
		testBase(parameter, "xml", ApiTestEnum.buyerSearchItemList);
	}

	
}
