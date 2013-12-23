package com.paipai.api.test.item;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.paipai.api.test.util.TestAPIBase;
import com.paipai.api.util.ApiParameter;

/**
 * 商品相关的接口单元测试类
 * @author ankerdiao
 * @date 2010-3-18
 */
public class TestItemAPI extends TestAPIBase{

	@Override
	protected void setUp() throws Exception {
		super.setUp();
		this.charset = "utf-8";
		this.debug = true;
		this.keyFileName="214689727_dev";
//		this.IP_PORT = "http://api.paipai.com";
//		this.IP_PORT = this.local;
//		this.token = this.token_product;
	}
	
	/**
	 * 测试查询商品详细信息 JSON
	 * @throws UnsupportedEncodingException
	 * @throws IOException
	 */
	public void testGetItemJson() throws UnsupportedEncodingException, IOException {
		ApiParameter parameter = new ApiParameter();
		parameter.addStringParam("itemCode", "BFE7CB0C00000000003F39800001B98B");
//		parameter.addStringParam("itemLocalCode", "ankerdiao_10000");
		testBase(parameter, "xml", "item", "getItem");
	}
	
	
	/**
	 * 测试查询商品详细信息 XML
	 * @throws UnsupportedEncodingException
	 * @throws IOException
	 */
	public void testGetItemXML() throws UnsupportedEncodingException, IOException {
		ApiParameter parameter = new ApiParameter();
		parameter.addStringParam("itemCode", "BFE7CB0C00000000003F39790001B95E");
		testBase(parameter, "xml", "item", "getItem");
	}
	
	/**测试修改商品图片
	 * @throws UnsupportedEncodingException
	 * @throws IOException
	 */
	public void ModifyItemPicJson() throws UnsupportedEncodingException, IOException {
		ApiParameter parameter = new ApiParameter();
		parameter.addStringParam("itemCode", "BFE7CB0C00000000003F39800001B98B");
		parameter.addStringParam("index", "4");
		parameter.addFileParam("pic", "./item_image/1-1111.jpg");
		testBase(parameter, "json", "item", "modifyItemPic");
	}
	
	/**
	 * 测试批量修改商品状态
	 * @throws UnsupportedEncodingException
	 * @throws IOException
	 */
	public void ModifyItemState() throws UnsupportedEncodingException, IOException {
		ApiParameter parameter = new ApiParameter();
//		parameter.addStringParam("itemCode", "BFE7CB0C00000000003F395D0001B8BE");
		parameter.addStringParam("itemLocalCode", "ankerdiao_10000");
		parameter.addStringParam("itemState", "IS_FOR_SALE");
		testBase(parameter, "xml", "item", "modifyItemState");
	}
	
	/**
	 * 修改商品的库存
	 * @throws UnsupportedEncodingException
	 * @throws IOException
	 */
	public void ModifyItemStock() throws UnsupportedEncodingException, IOException {
		ApiParameter parameter = new ApiParameter();
		parameter.addStringParam("itemCode", "BFE7CB0C00000000003F39780001B954");
//		parameter.addStringParam("itemLocalCode", "ankerdiao_10001");
//		parameter.addStringParam("stockPrice", "28630");
		parameter.addStringParam("stockCount", "15");
		parameter.addStringParam("stockLocalCode", "anker_xie_1002");
//		parameter.addStringParam("stockAttr", "鞋码:40|颜色:白色");
		testBase(parameter, "json", "item", "modifyItemStock");
	}
	
	/**
	 * 修改商品
	 * @throws UnsupportedEncodingException
	 * @throws IOException
	 */
	public void testModifyItem() throws UnsupportedEncodingException, IOException {
		ApiParameter parameter = new ApiParameter();
		parameter.addStringParam("itemCode", "BFE7CB0C00000000003F39880001BCC7");
//		parameter.addStringParam("itemLocalCode", "anker_xie_1001");
//		parameter.addStringParam("qqVipDiscount", "1000");
		parameter.addStringParam("emsPrice", "4400");
		parameter.addStringParam("marketPrice", "335500");
		parameter.addStringParam("expressPrice", "6600");
//		parameter.addStringParam("mailPrice", "2200");
		parameter.addStringParam("sellerPayFreight", "0");
		parameter.addStringParam("freightId", "0");
		testBase(parameter, "xml", "item", "modifyItem");
	}
	
	
	/**
	 * 发布商品
	 * @throws UnsupportedEncodingException
	 * @throws IOException
	 */
	public void AddItemH() throws UnsupportedEncodingException, IOException{
		ApiParameter parameter = new ApiParameter();
		String itemName="ankerdiao_"+new SimpleDateFormat("MMdd_HHmm").format(new Date());
		parameter.addStringParam("sellerUin", getUin());
		parameter.addStringParam("itemName",itemName );
		parameter.addStringParam("itemPrice", "11155");
		parameter.addStringParam("itemAmount", "101");
		parameter.addStringParam("sellType", "ST_FIXED");
		parameter.addStringParam("cityId", "40000");
		parameter.addStringParam("provinceId", "0");
		parameter.addStringParam("countryId", "0");
		parameter.addStringParam("attr", "6a0:2|6a3:2|6af:3|6b1:17|6b2:1|6ca:2|6cb:1");
		parameter.addStringParam("customAttr", "样式:样式1&样式2|款式:款式1");
//		parameter.addStringParam("shopClassId", "1,2,4");
		parameter.addStringParam("classId", "6019");
		parameter.addStringParam("theme", "THEME_DEFAULT");
		parameter.addStringParam("validDuration", "604800");
		parameter.addStringParam("autoReload", "0");
		parameter.addStringParam("supportPayAgency", "0");
		parameter.addStringParam("itemState", "IS_IN_STORE");
		parameter.addStringParam("saleTime", "");
		parameter.addStringParam("buyLimit", "0");
		parameter.addStringParam("sellerPayFreight", "0");
		
//		parameter.addStringParam("freightId", "10");
		parameter.addStringParam("mailPrice", "1230");
		parameter.addStringParam("expressPrice", "3110");
		parameter.addStringParam("emsPrice", "4110");
		
		parameter.addStringParam("productCode", "");
		parameter.addStringParam("itemLocalCode", itemName);
		parameter.addStringParam("secondHandItem", "0");
		parameter.addStringParam("warrantyItem", "0");
		parameter.addStringParam("invoiceItem", "0");
		parameter.addStringParam("guaranteeTripleCompensation", "0");
		parameter.addStringParam("guaranteeSevenDayReturn", "0");
		parameter.addStringParam("guaranteeFourteenDayPay", "0");
		parameter.addStringParam("guaranteeSevenDayReturn", "0");
		parameter.addStringParam("codItem", "0");
		parameter.addStringParam("windowItem", "0");
		parameter.addStringParam("stockInfo", "1200,20,样式:样式1|款式:款式1,stock1");
		parameter.addStringParam("stockInfo", "1200,20,样式:样式2|款式:款式1,stock2");
		parameter.addStringParam("detailInfo", "我的商品详情");
		parameter.addStringParam("qqVipDiscount", "6600");
		parameter.addStringParam("marketPrice", "564600");
		testBase(parameter, "json", "item", "addItem");
	}
	
	
	
	
	
	public void AddItem() throws UnsupportedEncodingException, IOException{
		ApiParameter parameter = new ApiParameter();

		 parameter.addStringParam("attr","");
		 parameter.addStringParam("autoReload","1");
		 parameter.addStringParam("buyLimit","0");
		 parameter.addStringParam("categoryId","");//
		 parameter.addStringParam("cityId","01");
		 parameter.addStringParam("classId","22549");
		 parameter.addStringParam("countryId","");//
		 parameter.addStringParam("customAttr","颜色:白色&黑色|尺码:S&M&L&XL&XXL");
		 parameter.addStringParam("sellerPayFreight","0");
		 parameter.addStringParam("detailInfo","黑孩子黑聪明嘿嘿1111da");
		 parameter.addStringParam("itemName","黑孩子黑聪明测试商品发布接口商品dasdf");
		 parameter.addStringParam("itemLocalCode","100000811sddfs");
		 parameter.addStringParam("stockInfo","179001,1001,颜色:白色|尺码:L,AFC00211dsf");
		 parameter.addStringParam("expressPrice","1500");
		 parameter.addStringParam("mailPrice","1000");
		 parameter.addStringParam("emsPrice", "2500");
		 parameter.addStringParam("freightId","10");
		 parameter.addStringParam("guarantee14Days","1");
		 parameter.addStringParam("guarantee7Days","1");
		 parameter.addStringParam("guaranteeCompensation","1");
		 parameter.addStringParam("invoiceItem","1");
		 parameter.addStringParam("itemState","IS_FOR_SALE");
		 parameter.addStringParam("productCode","");
		 parameter.addStringParam("provinceId","01");
		 parameter.addStringParam("saleTime","");
		 parameter.addStringParam("secondHandItem","0");
		 parameter.addStringParam("sellerUin",getUin());
		 parameter.addStringParam("sellType","ST_FIXED");
		 parameter.addStringParam("theme","THEME_DEFAULT");
		 parameter.addStringParam("validDuration","1209600");
		 parameter.addStringParam("warrantyItem","0");
		 parameter.addStringParam("windowItem","0");
		
		testBase(parameter, "json", "item", "addItem");
	}
	
}
