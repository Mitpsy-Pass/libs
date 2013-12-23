package com.paipai.api.test.user;

import java.io.IOException;
import java.io.UnsupportedEncodingException;

import com.paipai.api.test.util.TestAPIBase;
import com.paipai.api.util.ApiParameter;

/**
 * 取用户信息
 * created on 2010-5-18下午02:37:26 
 * @author weisong
 */
public class TestGetUserInfo extends TestAPIBase{

	public void testgetUserInfo() {
		ApiParameter parameter = new ApiParameter();
		parameter.addStringParam("userUin", "4062760670");

		try {
			testBase(parameter, "json", "user", "getUserInfo");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
