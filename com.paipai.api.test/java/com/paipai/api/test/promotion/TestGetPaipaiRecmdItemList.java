package com.paipai.api.test.promotion;

import java.io.IOException;
import java.io.UnsupportedEncodingException;

import org.junit.Test;

import com.paipai.api.test.util.TestAPIBase;
import com.paipai.api.util.ApiParameter;




/**
 * test case
 * created on 2010-5-26ÉÏÎç10:32:08 
 * @author weisong
 */
public class TestGetPaipaiRecmdItemList extends TestAPIBase{

	@Test
	public void test() throws UnsupportedEncodingException, IOException
	{
		ApiParameter parameter = new ApiParameter();
		parameter.addStringParam("pageId", "201");
		parameter.addStringParam("domainId", "101");
		//parameter.addStringParam("pureData", "1");
		
		testBase(parameter, "json", "promotion", "getPaipaiRecmdItemList");
	}
}
