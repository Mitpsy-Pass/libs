package com.paipai.api.test.item;

import java.io.IOException;
import java.io.UnsupportedEncodingException;

import com.paipai.api.test.util.ApiTestEnum;
import com.paipai.api.test.util.TestAPIBase;
import com.paipai.api.util.ApiParameter;

/**
 * 测试修改商品的库存
 * @author ankerdiao
 * @date 2010-5-14
 */
public class TestModifyItemStateAPI extends TestAPIBase{

	@Override
	protected void setUp() throws Exception {
		super.setUp();
		this.keyFileName = "214689727_local";
	}
	
	public void testModifyItemStateJSON() throws UnsupportedEncodingException, IOException {
		ApiParameter parameter = new ApiParameter();
		parameter.addStringParam("itemCode", "7733A42D0000000000773995064F68AC");
//		parameter.addStringParam("itemLocalCode", "1081377");
		parameter.addStringParam("itemState", "IS_FOR_SALE");
		testBase(parameter, "json", ApiTestEnum.modifyItemState);
	}
	
}
