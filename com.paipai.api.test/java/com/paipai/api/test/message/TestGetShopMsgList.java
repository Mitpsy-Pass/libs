package com.paipai.api.test.message;

import java.io.IOException;
import java.io.UnsupportedEncodingException;

import com.paipai.api.test.util.TestAPIBase;
//import com.paipai.api.user.util.UserUtil;
import com.paipai.api.util.ApiParameter;
//import com.paipai.b2c.web.util.EscapeHelper;

/**
 * 店铺留言查询 单元测试
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
		byte result = 0; // 0：未通过校验 1：已通过校验 -1：系统错误
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

