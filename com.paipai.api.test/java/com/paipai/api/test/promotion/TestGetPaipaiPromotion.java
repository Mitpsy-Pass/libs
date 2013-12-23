package com.paipai.api.test.promotion;

import java.io.IOException;
import java.io.UnsupportedEncodingException;

import com.paipai.api.test.util.TestAPIBase;
import com.paipai.api.util.ApiParameter;

/**
 * ���Բ�ѯ�����Ƽ�λ
 * created on 2010-7-5����03:05:00 
 * @author weisong
 */
public class TestGetPaipaiPromotion extends TestAPIBase{
	
	public void testGetPaipaiPromotion() throws UnsupportedEncodingException, IOException{
		ApiParameter parameter = new ApiParameter();
		parameter.addStringParam("sellerUin", "943873511");
		parameter.addStringParam("ruleType", "0");
		testBase(parameter, "json", "paipaiPromotion", "getPaipaiPromotion");
	}
}
