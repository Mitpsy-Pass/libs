package com.paipai.api.test.message;

import java.io.IOException;
import java.io.UnsupportedEncodingException;

import com.paipai.api.test.util.TestAPIBase;
//import com.paipai.api.user.util.UserUtil;
import com.paipai.api.util.ApiParameter;
//import com.paipai.b2c.web.util.EscapeHelper;

/**
 * ��ӵ������� ��Ԫ����
 *  
 * @author kevenzhou
 */
public class TestAddShopMsgAPI extends TestAPIBase {
	@Override
	protected void setUp() throws Exception {
		super.setUp();
		this.charset = "utf-8";
		this.debug = true;
	}
	
	public void testAddShopMsg(){
		byte result = 0; // 0��δͨ��У�� 1����ͨ��У�� -1��ϵͳ����
		ApiParameter parameter = new ApiParameter();
		parameter.addStringParam("msgIspublic", "0");
		parameter.addStringParam("sellerUin", "19878334");
//		parameter.addStringParam("sellerName", "anker");
//		parameter.addStringParam("sRelateSubjectName", "shop name is 1005438533!");
	    parameter.addStringParam("msgContent", "keven's leaving message, shop is good!!!!");
	    
		try {
			testBase(parameter, "json", "message", "addShopMsg");
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

