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
public class TestModifyReceiverAddress extends TestAPIBase{

	public void testModifyReceiverAddress() {
		ApiParameter parameter = new ApiParameter();
		parameter.addStringParam("buyerUin", "943873511");

		parameter.addStringParam("addressId", "7678");
		parameter.addStringParam("regionId", "59");
		parameter.addStringParam("name", "深圳-修改地址接口");
		parameter.addStringParam("address", "飞亚达999楼999999号9999999房间");
		parameter.addStringParam("mobile", "13333333333");
		parameter.addStringParam("phone", "0713-88888888");
		parameter.addStringParam("postcode", "518000");
		try {
			testBase(parameter, "json", "user", "modifyReceiverAddress");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
