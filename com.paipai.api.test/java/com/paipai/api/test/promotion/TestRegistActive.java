package com.paipai.api.test.promotion;

import java.io.IOException;
import java.io.UnsupportedEncodingException;

import com.paipai.api.test.util.TestAPIBase;
import com.paipai.api.util.ApiParameter;

/**
 * created on 2010-6-8下午02:48:27 
 * @author weisong
 */
public class TestRegistActive extends TestAPIBase{

	public void testRegistActive() throws UnsupportedEncodingException, IOException{
		ApiParameter parameter = new ApiParameter();
		parameter.addStringParam("itemCode", "E75D423800000000006739470001B7C2");
		parameter.addStringParam("timeDesired", "10");
		parameter.addStringParam("resItemCount", "1000");
		parameter.addStringParam("itemCount", "1001");
		parameter.addStringParam("pageid", "1");
		parameter.addStringParam("uploadTime", System.currentTimeMillis()/1000);
		parameter.addStringParam("duration", "10");
		parameter.addStringParam("adwords", "adwords特价促销");
		parameter.addStringParam("regReason", "regReason促销");
		parameter.addStringParam("discount", "90");
		
		testBase(parameter, "json", "active", "registActive");
	}
}
