package com.paipai.api.test.message;

import java.io.IOException;
import java.io.UnsupportedEncodingException;

import com.paipai.api.test.util.TestAPIBase;
//import com.paipai.api.user.util.UserUtil;
import com.paipai.api.util.ApiParameter;
//import com.paipai.b2c.web.util.EscapeHelper;

/**
 * 添加商品留言 单元测试
 *  
 * @author kevenzhou
 */
public class TestAddItemMsgAPI extends TestAPIBase {
	@Override
	protected void setUp() throws Exception {
//		super.setUp();
//		this.charset = "utf-8";
//		this.debug = true;
//		this.keyFileName="msg\\16089668";
////		this.keyFileName="msg\\284869113";
////		this.keyFileName="214689727_dev";
////		this.IP_PORT = "http://127.0.0.1:8080";
////		System.setProperty("logPath", "c://");
//		this.IP_PORT = "http://api.paipai.com";
////		this.IP_PORT = "http://172.25.34.84:9001"; //gamma
////		this.IP_PORT = "http://172.25.34.81:9001"; //dev
//		// this.token = this.token_product;
	}
	
	public void testAddItemMsg(){
		byte result = 0; // 0：未通过校验 1：已通过校验 -1：系统错误
		ApiParameter parameter = new ApiParameter();
		parameter.addStringParam("itemCode", "A31FC116000000000023377203BADAE0");
		parameter.addStringParam("msgIspublic", "0");
		parameter.addStringParam("sellerUin", "951092149");
//		parameter.addStringParam("sellerName", "anker");
		parameter.addStringParam("itemName", "【6.5折】李宁官方正品 男运动鞋 足球鞋|ASTD027-2");
	    parameter.addStringParam("msgContent", "老板，买多少能包邮??");
	    
//		parameter.addStringParam("itemCode", "4482F500000000000044398F000005B8");
//		parameter.addStringParam("msgIspublic", "0");
//		parameter.addStringParam("sellerUin", "1005438533");
////		parameter.addStringParam("sellerName", "anker");
//		parameter.addStringParam("itemName", "itemName!");
//	    parameter.addStringParam("msgContent", "keven's leaving message, goods is good!!!!!好！很好！");
	    
		try {
			testBase(parameter, "json", "message", "addItemMsg");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
//	public void testModifyItemDetailByLocalCode(){
//		byte result = 0; // 0：未通过校验 1：已通过校验 -1：系统错误
//		ApiParameter parameter = new ApiParameter();
//		parameter.addStringParam("itemLocalCode", "AFC0021");
//		parameter.addStringParam("detailInfo", "<b>通过本地编码！！更新商品详情说明字段,</b>");
//		try {
//			testBase(parameter, "xml", "item", "modifyItemDetailInfo");
//		} catch (UnsupportedEncodingException e) {
//			e.printStackTrace();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//	}
	
}

