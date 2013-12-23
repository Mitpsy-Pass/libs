package com.paipai.api.test.item;

import java.io.IOException;
import java.io.UnsupportedEncodingException;

import com.paipai.api.test.util.ApiTestEnum;
import com.paipai.api.test.util.TestAPIBase;
import com.paipai.api.util.ApiParameter;

/**
 * 测试卖家发布商品
 * @author ankerdiao
 * @date 2010-5-14
 */
public class TestAddItemAPI extends TestAPIBase{

	@Override
	protected void setUp() throws Exception {
		super.setUp();
		this.keyFileName="855008931_idc";
//		this.keyFileName="214689727_local";
	}
	
	public void testAddItem_idc() throws UnsupportedEncodingException, IOException{
		ApiParameter parameter = new ApiParameter();
		
        parameter.addStringParam("sellerUin", "855008931");
        parameter.addStringParam("itemName", "Nike360耐克 AF1女子复古鞋 2010年 情人节礼盒 限定特别款");
        parameter.addStringParam("attr", "e9:78|3f9e:1004408|737:2|736:1|6928:11|6929:1|72d:8|827:a|72b:7|82f:1^3cdf:315186-600|4d1c:315186-600");
        parameter.addStringParam("classId", "27040");
        parameter.addStringParam("theme", "THEME_DEFAULT");
        parameter.addStringParam("validDuration","1209600");
        parameter.addStringParam("autoReload", "0");
        parameter.addStringParam("itemState", "IS_IN_STORE");
        parameter.addStringParam("buyLimit", "0");
        parameter.addStringParam("detailInfo", "Nike360耐克 AF1女子复古鞋 2010年 情人节礼盒 限定特别款");
        parameter.addStringParam("sellerPayFreight", "1");
        parameter.addStringParam("windowItem", "0");
        parameter.addStringParam("itemLocalCode", "729918832");
        parameter.addStringParam("secondHandItem", "0");
        parameter.addStringParam("warrantyItem", "0");
        parameter.addStringParam("invoiceItem", "0");
        parameter.addStringParam("guaranteeCompensation", "0");
        parameter.addStringParam("guarantee7Days", "1");
        parameter.addStringParam("guarantee14Days", "0");
        parameter.addStringParam("stockInfo", "53900,50");
        parameter.addStringParam("marketPrice", "79800");
		
		testBase(parameter, "xml", ApiTestEnum.addItem);
	}
	
	
	public void AddItem_855000188_idc() throws UnsupportedEncodingException, IOException{
		ApiParameter parameter = new ApiParameter();
		
//        parameter.addStringParam("sellerUin", getUin());
//        parameter.addStringParam("itemName", "===============test 单库存多库存================");
//        parameter.addStringParam("sellType", "ST_FIXED");
//        parameter.addStringParam("cityId", "40000");
//        parameter.addStringParam("provinceId", "0");
//        parameter.addStringParam("countryId", "");
//        parameter.addStringParam("attr", "740:1c|3f9e:8|735:a|731:1|730:3|733:1|732:4^5b18:A12345");
//        parameter.addStringParam("categoryId", "");
//        parameter.addStringParam("classId", "22539");
//        parameter.addStringParam("theme", "THEME_DEFAULT");
//        parameter.addStringParam("validDuration", "1209600");
//        parameter.addStringParam("autoReload", "0");
//        parameter.addStringParam("itemState", "IS_IN_STORE");
//        parameter.addStringParam("saleTime", "");
//        parameter.addStringParam("buyLimit", "0");
//        parameter.addStringParam("detailInfo", "-----------------------------ddddddddddd--------------------------");
//        parameter.addStringParam("sellerPayFreight", "0");
//        parameter.addStringParam("freightId", "10");
//        parameter.addStringParam("productCode", "");
//        parameter.addStringParam("itemLocalCode", "wwwwwww----");
//        parameter.addStringParam("secondHandItem", "0");
//        parameter.addStringParam("warrantyItem", "0");
//        parameter.addStringParam("invoiceItem", "1");
//        parameter.addStringParam("guaranteeCompensation", "1");
//        parameter.addStringParam("guarantee7Days", "1");
//        parameter.addStringParam("guarantee14Days", "1");
//        parameter.addStringParam("stockInfo", "5700,5");
//        parameter.addStringParam("marketPrice", "68000");
		
		testBase(parameter, "xml", ApiTestEnum.addItem);
	}
	
	
	
	public void AddItem843072074_idc() throws UnsupportedEncodingException, IOException{
		ApiParameter parameter = new ApiParameter();
		
        parameter.addStringParam("sellerUin", "843072074");
        parameter.addStringParam("sellType", "ST_FIXED");
        parameter.addStringParam("attr", "6ea:2|3070:2|30ed:1|30e8:3|30eb:18|30c3:1|30c0:4|30c1:5|30d4:3|30bc:1|30be:10");
        parameter.addStringParam("cityId", "200");
        parameter.addStringParam("provinceId", "2");
        parameter.addStringParam("classId", "203360");
        parameter.addStringParam("theme", "THEME_DEFAULT");
        parameter.addStringParam("validDuration", "1209600");
        parameter.addStringParam("autoReload", "1");
        parameter.addStringParam("itemState", "IS_FOR_SALE");
        parameter.addStringParam("buyLimit", "0");
        parameter.addStringParam("itemState", "IS_FOR_SALE");
        parameter.addStringParam("sellerPayFreight", "1");
        parameter.addStringParam("freightId", "0");
        parameter.addStringParam("mailPrice", "500");
        parameter.addStringParam("expressPrice", "500");
        parameter.addStringParam("emsPrice", "500");
        parameter.addStringParam("itemLocalCode", "77236_test_1001");
        parameter.addStringParam("secondHandItem", "0");
        parameter.addStringParam("warrantyItem", "1");
        parameter.addStringParam("invoiceItem", "1");
        parameter.addStringParam("guaranteeCompensation", "1");
        parameter.addStringParam("guarantee7Days", "1");
        parameter.addStringParam("guarantee14Days", "1");
        parameter.addStringParam("marketPrice","4550");
        parameter.addStringParam("windowItem", "0");
        parameter.addStringParam("stockInfo", "4500,5");            
        parameter.addStringParam("itemName", "测试商品名称");
        parameter.addStringParam("detailInfo", "商品内容");
		
		testBase(parameter, "xml", ApiTestEnum.addItem);
	}
	
	public void AddItemJSON() throws UnsupportedEncodingException, IOException{
		ApiParameter parameter = new ApiParameter();
		
		String sequence = "203360_2014";
		addItem(parameter, sequence);
		
		testBase(parameter, "json", ApiTestEnum.addItem);
	}
	
	public void AddItemXML() throws UnsupportedEncodingException, IOException{
		ApiParameter parameter = new ApiParameter();
		
		String sequence = "30166_1006";
		addBookItem(parameter, sequence);
		
		testBase(parameter, "xml", ApiTestEnum.addItem);
	}

	private void addBookItem(ApiParameter parameter, String sequence) {
		parameter.addStringParam("itemLocalCode", "ankerdiao_"+sequence);
		parameter.addStringParam("classId", "30166");
		parameter.addStringParam("attr", "");
		parameter.addStringParam("customAttr", "颜色:白色&黑色|尺码:S&M&L&XL&XXL");
		parameter.addStringParam("stockInfo", "46601,11,颜色:白色,1_"+sequence);
		parameter.addStringParam("stockInfo", "46602,12,颜色:黑色,2_"+sequence);
		parameter.addStringParam("itemName", "拍拍员工商店 测试书类目商品请勿购买_"+sequence);
		parameter.addStringParam("detailInfo", "<h2>---拍拍员工商店 测试商品请勿购买["+sequence+"]---</h2>");
		parameter.addStringParam("autoReload", "0");
		parameter.addStringParam("buyLimit", "0");
		parameter.addStringParam("categoryId", "");
		parameter.addStringParam("cityId", "01");
		parameter.addStringParam("countryId", "");
		parameter.addStringParam("sellerPayFreight", "0");
		parameter.addStringParam("freightId", "0");
		parameter.addStringParam("mailPrice", "1000");
		parameter.addStringParam("emsPrice", "2500");
		parameter.addStringParam("expressPrice", "1500");
		parameter.addStringParam("marketPrice", "4500");
		parameter.addStringParam("sellerUin", getUin());
		parameter.addStringParam("guarantee14Days", "1");
		parameter.addStringParam("guarantee7Days", "1");
		parameter.addStringParam("guaranteeCompensation", "1");
		parameter.addStringParam("invoiceItem", "1");
		parameter.addStringParam("itemState", "IS_IN_STORE");
		parameter.addStringParam("productCode", "");
		parameter.addStringParam("provinceId", "01");
		parameter.addStringParam("saleTime", "");
		parameter.addStringParam("secondHandItem", "0");
		parameter.addStringParam("sellType", "ST_FIXED");
		parameter.addStringParam("theme", "THEME_DEFAULT");
		parameter.addStringParam("validDuration", "1209600");
		parameter.addStringParam("warrantyItem", "0");
		parameter.addStringParam("windowItem", "0");
	}
	
	private void addItem(ApiParameter parameter, String sequence) {
		parameter.addStringParam("itemLocalCode", "ankerdiao_"+sequence);
		parameter.addStringParam("classId", "203360");
		parameter.addStringParam("attr", "404c:1|404d:1|404e:4|404f:2|4051:1|4074:4|6e7:c|6ea:5|6e9:2|3070:4|30ec:1|30ed:1|30e8:2|30e9:2|30eb:13|30c4:4|30c3:1|30c0:5|30c1:8|30d5:f|30d4:3|30bd:4|30bc:1|30be:6^63ec:11111111111");
//		parameter.addStringParam("customAttr", "6235:白色&黑色|63c5:S&M&L&XL&XXL");
//		parameter.addStringParam("stockInfo", "46601,11,配送:耳塞,1_"+sequence);
		parameter.addStringParam("stockInfo", "46602,12");
		parameter.addStringParam("itemName", "拍拍员工商店 测试商品请勿购买_"+sequence);
		parameter.addStringParam("detailInfo", "<h2>---拍拍员工商店 测试商品请勿购买["+sequence+"]---</h2>");
		parameter.addStringParam("autoReload", "0");
		parameter.addStringParam("buyLimit", "0");
		parameter.addStringParam("categoryId", "");
		parameter.addStringParam("cityId", "01");
		parameter.addStringParam("countryId", "");
		parameter.addStringParam("sellerPayFreight", "0");
		parameter.addStringParam("freightId", "0");
		parameter.addStringParam("mailPrice", "1000");
		parameter.addStringParam("emsPrice", "2500");
		parameter.addStringParam("expressPrice", "1500");
		parameter.addStringParam("marketPrice", "46600");
		parameter.addStringParam("sellerUin", getUin());
		parameter.addStringParam("guarantee14Days", "1");
		parameter.addStringParam("guarantee7Days", "1");
		parameter.addStringParam("guaranteeCompensation", "1");
		parameter.addStringParam("invoiceItem", "1");
		parameter.addStringParam("itemState", "IS_IN_STORE");
		parameter.addStringParam("productCode", "");
		parameter.addStringParam("provinceId", "01");
		parameter.addStringParam("saleTime", "");
		parameter.addStringParam("secondHandItem", "0");
		parameter.addStringParam("sellType", "ST_FIXED");
		parameter.addStringParam("theme", "THEME_DEFAULT");
		parameter.addStringParam("validDuration", "1209600");
		parameter.addStringParam("warrantyItem", "0");
		parameter.addStringParam("windowItem", "0");
	}

	
}
