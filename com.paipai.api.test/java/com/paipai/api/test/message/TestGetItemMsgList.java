package com.paipai.api.test.message;

import java.io.IOException;
import java.io.UnsupportedEncodingException;

import com.paipai.api.test.util.TestAPIBase;
//import com.paipai.api.user.util.UserUtil;
import com.paipai.api.util.ApiParameter;
//import com.paipai.b2c.web.util.EscapeHelper;

/**
 * ��Ʒ���Բ�ѯ ��Ԫ����
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
		byte result = 0; // 0��δͨ��У�� 1����ͨ��У�� -1��ϵͳ����
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

