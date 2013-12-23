package com.paipai.api.test.user;

import java.io.IOException;
import java.io.UnsupportedEncodingException;

import com.paipai.api.test.util.TestAPIBase;
import com.paipai.api.util.ApiParameter;

/**
 * ȡ�û���Ϣ
 * created on 2010-5-18����02:37:26 
 * @author weisong
 */
public class TestDeleteReceiverAddress extends TestAPIBase{

	public void testTestDeleteReceiverAddress() {
		ApiParameter parameter = new ApiParameter();
		parameter.addStringParam("buyerUin", "943873511");

		parameter.addStringParam("addressId", "7678");

		try {
			testBase(parameter, "json", "user", "deleteReceiverAddress");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
