package com.paipai.api.test.evaluation;

import java.io.IOException;
import java.io.UnsupportedEncodingException;

import com.paipai.api.test.util.TestAPIBase;
import com.paipai.api.util.ApiParameter;


public class TestGetDealEvalList extends TestAPIBase {


	protected void setUp() throws Exception {
		super.setUp();
		this.charset = "gbk";
		this.pureData = 1;
		this.debug = true;
		this.keyFileName = "idc";
		this.IP_PORT="http://api.paipai.com";
	}
    
	public void testGetDealEvalListJson() throws UnsupportedEncodingException, IOException {
		ApiParameter parameter = new ApiParameter();
		parameter.addStringParam("sellerUin", getUin() );
		parameter.addStringParam("dealCode", "1005438533-20100518-334349743");
		testBase(parameter, "json", "evaluation", "getDealEvalList");
	}
	
	public void testGetDealEvalListXml() throws UnsupportedEncodingException, IOException {
		ApiParameter parameter = new ApiParameter();
		parameter.addStringParam("sellerUin", getUin() );
		parameter.addStringParam("dealCode", "1005438533-20100518-334349743");
		testBase(parameter, "xml", "evaluation", "getDealEvalList");
	}
	
}
