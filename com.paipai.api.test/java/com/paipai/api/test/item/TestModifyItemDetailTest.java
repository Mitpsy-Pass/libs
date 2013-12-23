package com.paipai.api.test.item;

import java.io.IOException;
import java.io.UnsupportedEncodingException;

import com.paipai.api.test.util.ApiTestEnum;
import com.paipai.api.test.util.TestAPIBase;
import com.paipai.api.util.ApiParameter;

/**
 * 测试修改商品详情页面数据
 * @author ankerdiao
 * @date 2010-5-14
 */
public class TestModifyItemDetailTest extends TestAPIBase {
	@Override
	protected void setUp() throws Exception {
		super.setUp();	
		super.keyFileName="214689727_local";
	}
	
	public void testModifyItemDetailJSON() throws UnsupportedEncodingException, IOException{
		ApiParameter parameter = new ApiParameter();
		parameter.addStringParam("itemLocalCode", "dev_anker_6023_10000_");
		parameter.addStringParam("detailInfo", "<b>更新商品详情说明字段</b>");
		testBase(parameter, "json", ApiTestEnum.modifyItemDetailInfo);
		
	}
	
	public void testModifyItemDetailXML() throws UnsupportedEncodingException, IOException{
		ApiParameter parameter = new ApiParameter();
		parameter.addStringParam("itemCode", "E75D423800000000006739470001B7C2");
		parameter.addStringParam("detailInfo", "<b>更新商品详情说明字段</b>");
		testBase(parameter, "xml", ApiTestEnum.modifyItemDetailInfo);
		
	}
}
