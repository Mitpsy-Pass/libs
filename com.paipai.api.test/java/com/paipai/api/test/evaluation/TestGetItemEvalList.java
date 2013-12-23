package com.paipai.api.test.evaluation;

import java.io.IOException;
import java.io.UnsupportedEncodingException;

import com.paipai.api.test.util.TestAPIBase;
import com.paipai.api.util.ApiParameter;


public class TestGetItemEvalList extends TestAPIBase {


	protected void setUp() throws Exception {
		super.setUp();
		this.charset = "gbk";
		this.pureData = 1;
		this.debug = true;
		this.keyFileName = "idc";
		this.IP_PORT="http://api.paipai.com";
	}
    
	public void testGetItemEvalListJson() throws UnsupportedEncodingException, IOException {
		ApiParameter parameter = new ApiParameter();
		parameter.addStringParam("sellerUin", getUin() );
		parameter.addStringParam("itemCode", "45C6ED3B000000000045399B0631B050");
		testBase(parameter, "json", "evaluation", "getItemEvalList");
	}
	
	public void testGetItemEvalListXml() throws UnsupportedEncodingException, IOException {
		ApiParameter parameter = new ApiParameter();
		parameter.addStringParam("sellerUin", getUin() );
		parameter.addStringParam("itemCode", "45C6ED3B000000000045399B0631B050");
		testBase(parameter, "xml", "evaluation", "getItemEvalList");
	}
	
	
}
