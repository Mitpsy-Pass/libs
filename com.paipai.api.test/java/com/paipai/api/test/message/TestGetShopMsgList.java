package com.paipai.api.test.message;

import java.io.IOException;
import java.io.UnsupportedEncodingException;

import com.paipai.api.test.util.TestAPIBase;
//import com.paipai.api.user.util.UserUtil;
import com.paipai.api.util.ApiParameter;
//import com.paipai.b2c.web.util.EscapeHelper;

/**
 * �������Բ�ѯ ��Ԫ����
 *  
 * @author weisong
 */
public class TestGetShopMsgList extends TestAPIBase {
//	@Override
//	protected void setUp() throws Exception {
//		super.setUp();
//		this.charset = "utf-8";
//		this.debug = true;
//	}
	
	public void testGetShopMsgList(){
		byte result = 0; // 0��δͨ��У�� 1����ͨ��У�� -1��ϵͳ����
		ApiParameter parameter = new ApiParameter();

		parameter.addStringParam("sellerUin", "19878334");
		parameter.addStringParam("pageSize", "10");
		parameter.addStringParam("pageIndex", "1");
	    
		try {
			testBase(parameter, "json", "message", "getShopMsgList");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
//	public void testModifyItemDetailByLocalCode(){
//		byte result = 0; // 0��δͨ��У�� 1����ͨ��У�� -1��ϵͳ����
//		ApiParameter parameter = new ApiParameter();
//		parameter.addStringParam("itemLocalCode", "AFC0021");
//		parameter.addStringParam("detailInfo", "<b>ͨ�����ر��룡��������Ʒ����˵���ֶ�,</b>");
//		try {
//			testBase(parameter, "xml", "item", "modifyItemDetailInfo");
//		} catch (UnsupportedEncodingException e) {
//			e.printStackTrace();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//	}
	
}

