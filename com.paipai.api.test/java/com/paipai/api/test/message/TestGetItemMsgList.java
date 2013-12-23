package com.paipai.api.test.message;

import java.io.IOException;
import java.io.UnsupportedEncodingException;

import com.paipai.api.test.util.TestAPIBase;
//import com.paipai.api.user.util.UserUtil;
import com.paipai.api.util.ApiParameter;
//import com.paipai.b2c.web.util.EscapeHelper;

/**
 * 商品留言查询 单元测试
 *  
 * @author weisong
 */
public class TestGetItemMsgList extends TestAPIBase {
//	@Override
//	protected void setUp() throws Exception {
//		super.setUp();
//		this.charset = "utf-8";
//		this.debug = true;
//	}
	
	public void testGetItemMsgList(){
		byte result = 0; // 0：未通过校验 1：已通过校验 -1：系统错误
		ApiParameter parameter = new ApiParameter();

		parameter.addStringParam("itemCode", "E75D423800000000006739510001B824");
		parameter.addStringParam("pageSize", "10");
		parameter.addStringParam("pageIndex", "1");
	    
		try {
			testBase(parameter, "json", "message", "getItemMsgList");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}

