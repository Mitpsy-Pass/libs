package com.paipai.api.test.util;

/**
 * Api��Ԫ����Э��
 * @author ankerdiao
 * @date 2010-5-5
 */
public enum ApiTestEnum {

	/**
	 * ��Ӷ����ı�ע
	 */
	modifySellerNote(ApiTestEnum.DEAL, "��Ӷ����ı�ע"),
	
	/**
	 * �����ӳ������ջ�ʱ��
	 */
	sellerDelayConsignmentTime(ApiTestEnum.DEAL,"�����ӳ������ջ�ʱ��"),
	
	/**
	 * ���ұ�Ƕ���ȱ��
	 */
	sellerSignDealOutOfStock(ApiTestEnum.DEAL,"���ұ�Ƕ���ȱ��"),
	
	/**
	 * ���ұ�Ƕ��������
	 */
	sellerSignDealPreparing(ApiTestEnum.DEAL,"���ұ�Ƕ��������"),
	
	/**
	 * ���ұ�Ƕ�������
	 */
	sellerConsignDealItem(ApiTestEnum.DEAL, "���ұ�Ƕ�������"),
	
	/**
	 * ���Ҳ�ѯ�����б�
	 */
	sellerSearchDealList(ApiTestEnum.DEAL, "���Ҳ�ѯ�����б�"),
	
	/**
	 * ��ѯ��������
	 */
	getDealDetail(ApiTestEnum.DEAL, "��ѯ��������"),
	
	/**
	 * ����ȡ������
	 */
	sellerCancelDeal(ApiTestEnum.DEAL, "����ȡ������"),
	
	/**
	 * ���ȡ������
	 */
	buyerCancelDeal(ApiTestEnum.DEAL, "���ȡ������"),
	
	/**
	 * ��Ҳ�ѯ�����б��ڲ�ʹ�ã�
	 */
	buyerSearchDealList(ApiTestEnum.DEAL, "��Ҳ�ѯ�����б��ڲ�ʹ�ã�"),
	
	/**
	 * ��ѯ��Ʒ����
	 */
	getItem(ApiTestEnum.ITEM, "��ѯ��Ʒ����"),
	
	/**
	 * �޸���Ʒ����ҳ��
	 */
	modifyItemDetailInfo(ApiTestEnum.ITEM, "�޸���Ʒ����ҳ��"),
	
	/**
	 * �޸���Ʒ��ͼƬ
	 */
	modifyItemPic(ApiTestEnum.ITEM, "�޸���Ʒ��ͼƬ"),
	
	/**
	 * �޸���Ʒ��Ϣ��Ϣ
	 */
	modifyItem(ApiTestEnum.ITEM, "�޸���Ʒ��Ϣ��Ϣ"),
	
	/**
	 * �޸���Ʒ��״̬���ϼܡ��¼ܡ�Ԥɾ��
	 */
	modifyItemState(ApiTestEnum.ITEM, "�޸���Ʒ��״̬�� �ϼܡ��¼ܡ�Ԥɾ��"), 
	
	/**
	 * �޸���Ʒ�Ŀ��
	 */
	modifyItemStock(ApiTestEnum.ITEM, "�޸���Ʒ�Ŀ��"),
	
	/**
	 * ������Ʒ
	 */
	addItem(ApiTestEnum.ITEM, "������Ʒ"),
	
	/**
	 * ��Ҳ�ѯ�����б�
	 */
	buyerSearchItemList(ApiTestEnum.ITEM, "��Ҳ�ѯ�����б�"), 
	
	/**
	 * ��ѯ��Ʒ��ϸ��Ϣҳ������
	 */
	getItemDetailInfo(ApiTestEnum.ITEM, "��ѯ��Ʒ��ϸ��Ϣҳ������"), 
	
	/**
	 * ���Բ�ѯ�����Ƽ���Ʒ�б�
	 */
	getShopRecommendList(ApiTestEnum.ITEM, "���Բ�ѯ�����Ƽ���Ʒ�б�"), 
	
	/**
	 * ���Ҳ�ѯ��Ʒ�б�
	 */
	sellerSearchItemList(ApiTestEnum.ITEM, "���Ҳ�ѯ��Ʒ�б�"),  
	
	/**
	 * һ�ڼ��µ��ӿ�
	 */
	orderDeal(ApiTestEnum.DEAL, "һ�ڼ��µ��ӿ�"),
	
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
