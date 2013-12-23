package com.paipai.api.test.shop;

import java.io.IOException;
import java.io.UnsupportedEncodingException;

import com.paipai.api.test.util.TestAPIBase;
//import com.paipai.api.user.util.UserUtil;
import com.paipai.api.util.ApiParameter;
//import com.paipai.b2c.web.util.EscapeHelper;

/**
 * 单元测试--取店铺分类列表列表 
 *  
 * @author kevenzhou
 */
public class TestGetShopCategoryListAPI extends TestAPIBase {
	@Override
	protected void setUp() throws Exception {
		super.setUp();
		this.charset = "utf-8";
		this.debug = true;
		this.keyFileName="msg\\16089668";
//		this.keyFileName="214689727_dev";
		this.IP_PORT = "http://127.0.0.1:8080";
//		System.setProperty("logPath", "c://");
		// this.IP_PORT = "http://api.paipai.com";
//		 this.IP_PORT = "http://172.25.34.81:9001";
		// this.token = this.token_product;
	}
	
	public void testGetShopPromotionList(){
		byte result = 0; // 0：未通过校验 1：已通过校验 -1：系统错误
		ApiParameter parameter = new ApiParameter();
		parameter.addStringParam("sellerUin", "16089668");

		try {
			testBase(parameter, "json", "shop", "getShopCategoryList");
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

