package com.paipai.api.test.user;

import java.io.IOException;
import java.io.UnsupportedEncodingException;

import com.paipai.api.test.util.TestAPIBase;
import com.paipai.api.util.ApiParameter;

/**
 * created on 2010-5-18ÏÂÎç02:40:22 
 * @author weisong
 */
public class TestGetReceiverAddressList extends TestAPIBase{

	public void testgetReceiverAddressList() {
		ApiParameter parameter = new ApiParameter();
		parameter.addStringParam("buyerUin", "943873511");
		try {
			testBase(parameter, "json", "user", "getReceiverAddressList");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
