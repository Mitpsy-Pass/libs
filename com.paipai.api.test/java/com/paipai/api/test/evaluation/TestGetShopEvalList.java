package com.paipai.api.test.evaluation;

import java.io.IOException;
import java.io.UnsupportedEncodingException;

import com.paipai.api.test.util.TestAPIBase;
import com.paipai.api.util.ApiParameter;


public class TestGetShopEvalList extends TestAPIBase {


	protected void setUp() throws Exception {
		super.setUp();
		this.charset = "gbk";
		this.pureData = 1;
		this.debug = true;
		this.keyFileName = "idc";
		this.IP_PORT="http://api.paipai.com";
	}
    
	public void testGetShopEvalListJson() throws UnsupportedEncodingException, IOException {
		ApiParameter parameter = new ApiParameter();
		parameter.addStringParam("sellerUin", getUin() );
		testBase(parameter, "json", "evaluation", "getShopEvalList");
	}

	public void testGetShopEvalListXml() throws UnsupportedEncodingException, IOException {
		ApiParameter parameter = new ApiParameter();
		parameter.addStringParam("sellerUin", getUin() );
		testBase(parameter, "xml", "evaluation", "getShopEvalList");
	}
	
}
