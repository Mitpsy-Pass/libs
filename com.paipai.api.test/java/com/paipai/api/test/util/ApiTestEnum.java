package com.paipai.api.test.util;

/**
 * Api单元测试协助
 * @author ankerdiao
 * @date 2010-5-5
 */
public enum ApiTestEnum {

	/**
	 * 添加订单的备注
	 */
	modifySellerNote(ApiTestEnum.DEAL, "添加订单的备注"),
	
	/**
	 * 卖家延长订单收货时间
	 */
	sellerDelayConsignmentTime(ApiTestEnum.DEAL,"卖家延长订单收货时间"),
	
	/**
	 * 卖家标记订单缺货
	 */
	sellerSignDealOutOfStock(ApiTestEnum.DEAL,"卖家标记订单缺货"),
	
	/**
	 * 卖家标记订单配货中
	 */
	sellerSignDealPreparing(ApiTestEnum.DEAL,"卖家标记订单配货中"),
	
	/**
	 * 卖家标记订单发货
	 */
	sellerConsignDealItem(ApiTestEnum.DEAL, "卖家标记订单发货"),
	
	/**
	 * 卖家查询订单列表
	 */
	sellerSearchDealList(ApiTestEnum.DEAL, "卖家查询订单列表"),
	
	/**
	 * 查询订单详情
	 */
	getDealDetail(ApiTestEnum.DEAL, "查询订单详情"),
	
	/**
	 * 卖家取消订单
	 */
	sellerCancelDeal(ApiTestEnum.DEAL, "卖家取消订单"),
	
	/**
	 * 买家取消订单
	 */
	buyerCancelDeal(ApiTestEnum.DEAL, "买家取消订单"),
	
	/**
	 * 买家查询订单列表（内部使用）
	 */
	buyerSearchDealList(ApiTestEnum.DEAL, "买家查询订单列表（内部使用）"),
	
	/**
	 * 查询商品详情
	 */
	getItem(ApiTestEnum.ITEM, "查询商品详情"),
	
	/**
	 * 修改商品详情页面
	 */
	modifyItemDetailInfo(ApiTestEnum.ITEM, "修改商品详情页面"),
	
	/**
	 * 修改商品的图片
	 */
	modifyItemPic(ApiTestEnum.ITEM, "修改商品的图片"),
	
	/**
	 * 修改商品信息信息
	 */
	modifyItem(ApiTestEnum.ITEM, "修改商品信息信息"),
	
	/**
	 * 修改商品的状态：上架、下架、预删除
	 */
	modifyItemState(ApiTestEnum.ITEM, "修改商品的状态： 上架、下架、预删除"), 
	
	/**
	 * 修改商品的库存
	 */
	modifyItemStock(ApiTestEnum.ITEM, "修改商品的库存"),
	
	/**
	 * 发布商品
	 */
	addItem(ApiTestEnum.ITEM, "发布商品"),
	
	/**
	 * 买家查询订单列表
	 */
	buyerSearchItemList(ApiTestEnum.ITEM, "买家查询订单列表"), 
	
	/**
	 * 查询商品详细信息页面数据
	 */
	getItemDetailInfo(ApiTestEnum.ITEM, "查询商品详细信息页面数据"), 
	
	/**
	 * 测试查询店铺推荐商品列表
	 */
	getShopRecommendList(ApiTestEnum.ITEM, "测试查询店铺推荐商品列表"), 
	
	/**
	 * 卖家查询商品列表
	 */
	sellerSearchItemList(ApiTestEnum.ITEM, "卖家查询商品列表"),  
	
	/**
	 * 一口价下单接口
	 */
	orderDeal(ApiTestEnum.DEAL, "一口价下单接口"),
	
	;
	
	private static final String DEAL="deal";
	private static final String ITEM="item";
	
	private final String floder;
	private final String showInfo;
	
	private ApiTestEnum(String floder, String showInfo) {
		this.floder = floder;
		this.showInfo = showInfo;
	}

	public String getShowInfo() {
		return showInfo;
	}

	public String getFloder() {
		return floder;
	}
}
