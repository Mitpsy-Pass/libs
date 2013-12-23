package com.paipai.api.test.deal;

import java.io.IOException;
import java.io.UnsupportedEncodingException;

import com.paipai.api.test.util.ApiTestEnum;
import com.paipai.api.test.util.TestAPIBase;
import com.paipai.api.util.ApiParameter;


/**
 * 取消订单接口的测试
 * @author ankerdiao
 * @date 2010-3-22
 */
public class TestOrderDealAPI extends TestAPIBase{

	@Override
	protected void setUp() throws Exception {
		super.setUp();
		this.keyFileName = "214689727_idc";
	}
	
	
	public void testOrderDeal() throws UnsupportedEncodingException, IOException {
		ApiParameter parameter = new ApiParameter();
		parameter.addStringParam("sellerUin", "9438735112");
		parameter.addStringParam("itemCode", "E75D423800000000006739470001B7C2");
		parameter.addStringParam("visitkey", "20713498965183002");
		parameter.addStringParam("itemStockAttr", "颜色:白色|尺码:L");
		parameter.addStringParam("buyerNote", "显现API下单购买实物一口价");
		parameter.addStringParam("receiveAddress", "深圳飞亚达");
		parameter.addStringParam("receiveMobile", "0755");
		parameter.addStringParam("receiveName", "拍拍QGG");
		parameter.addStringParam("receivePhone", "138222222555");
		parameter.addStringParam("receivePost", "584111");
//		parameter.addStringParam("reserveIn", "1");
		testBase(parameter, "xml", ApiTestEnum.orderDeal);
//		parameter.addStringParam("regionId", "23");
	}

}
