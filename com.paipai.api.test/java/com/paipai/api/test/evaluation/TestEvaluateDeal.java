package com.paipai.api.test.evaluation;

import java.io.IOException;
import java.io.UnsupportedEncodingException;

import com.paipai.api.test.util.TestAPIBase;
import com.paipai.api.util.ApiParameter;


public class TestEvaluateDeal extends TestAPIBase {


	protected void setUp() throws Exception {
		super.setUp();
		this.charset = "gbk";
		this.pureData = 1;
		this.debug = true;
		this.keyFileName = "idc";
		this.IP_PORT="http://api.paipai.com";
	}
    
	public void testEvaluateDealJson() throws UnsupportedEncodingException, IOException {
		ApiParameter parameter = new ApiParameter();
		parameter.addStringParam("sellerUin", "1005438533");
		parameter.addStringParam("evalLevel", "2");
		parameter.addStringParam("evalContent", "ÖÐÆÀ");
		parameter.addStringParam("dealList", "1005438533-20100518-334349743,1005438533-20100518-334331243");
		testBase(parameter, "json", "evaluation", "evaluateDeal");
	}

	public void testEvaluateDealXml() throws UnsupportedEncodingException, IOException {
		ApiParameter parameter = new ApiParameter();
		parameter.addStringParam("sellerUin", "1005438533");
		parameter.addStringParam("evalLevel", "2");
		parameter.addStringParam("evalContent", "ÖÐÆÀ");
		parameter.addStringParam("dealList", "1005438533-20100518-334349743,1005438533-20100518-334331243");
		testBase(parameter, "xml", "evaluation", "evaluateDeal");
	}
	
}
