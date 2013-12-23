package com.paipai.api.test.promotion;

import java.io.IOException;
import java.io.UnsupportedEncodingException;

import com.paipai.api.test.util.TestAPIBase;
import com.paipai.api.util.ApiParameter;

/**
 * created on 2010-6-8обнГ02:48:27 
 * @author weisong
 */
public class TestSellerGetPaipaiPromotionItemList extends TestAPIBase{

	public void test() throws UnsupportedEncodingException, IOException{
		ApiParameter parameter = new ApiParameter();
		parameter.addStringParam("sellerUin", "943873511");
		parameter.addStringParam("itemName", "10");

	
		testBase(parameter, "json", "paipaiPromotion", "sellerGetPaipaiPromotionItemList");
	}
}
