package com.paipai.api.test.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.util.Properties;

import junit.framework.TestCase;
import net.sf.json.JSONObject;

import org.w3c.dom.Document;

import com.paipai.api.util.ApiClient;
import com.paipai.api.util.ApiParameter;
import com.paipai.api.util.XmlUtil;


/**
 * 单元测试
 * 
	@Override
	protected void setUp() throws Exception {
		super.setUp();
		this.keyFileName="214689727_local";	//采用Token的方式测试用例
		this.sessionKey = "@F9h5ShyyP";		//采用SessionKey的方式测试用例
	}
	
	@Override
	protected void tearDown() throws Exception {
		super.tearDown();
	}
	
	public void testGetDealDetailJSON() throws UnsupportedEncodingException, IOException {
		ApiParameter parameter = new ApiParameter();
		parameter.addStringParam("dealCode", "214689727-20100322-5000111");
		parameter.addStringParam("sellerUin", getUin());
		parameter.addStringParam("listItem", "1");
		testBase(parameter, "json", ApiTestEnum.getDealDetail);
	}
	
 * @author ankerdiao
 * @date 2010-3-18
 */
public class TestAPIBase extends TestCase {
	
	
	private Properties properties;
	private ApiClient apiClient;
	
	protected String IP_PORT;
	/**
	 * 鉴权参数的配置文件，C:\\apitest\\"+keyFileName+".properties </br>
	 * 里面包含的参数有：</br>
	 * spid = 111111111111111111111111 </br>
	 * secretKey = 222222222222222222 </br>
	 * uin = 214689727 </br>
	 * token = 33333333333333333333 </br>
	 * IP_PORT = http://127.0.0.1:8080 </br>
	 */
	protected String keyFileName="apitestkey";
	protected boolean debug = true;
	
	protected String charset = "utf-8";
	protected byte pureData = 1;
	
	protected int uin = 0;
	/**
	 * 拍拍会话标志
	 */
	protected String sessionKey;

	private String token = "";
	private String spid = "";
	private String secretKey = "";
	private String business = "";

	

	@Override
	protected void setUp() throws Exception {
		System.out.println(">>>>>>>>>>>>>>>开始运行测试方法:" + getName()+">>>>>>>>>>>>>>");
	}
	
	@Override
	protected void runTest() throws Throwable {
		try {
			properties = new Properties();
			FileInputStream stream = new FileInputStream("C:\\"+keyFileName+".properties");
			properties.load(stream);
			token = properties.getProperty("token");
			spid = properties.getProperty("spid");
			secretKey = properties.getProperty("secretKey");
			business = properties.getProperty("business");
			if(business!=null && business.length()>0){
				business = new String(business.getBytes("iso8859-1"), "gbk");
			}else{
				business = "配置文件中未配置商家的昵称";
			}
			if(IP_PORT==null || IP_PORT.length()<=0){
				IP_PORT = properties.getProperty("IP_PORT");
			}
			if(uin<=10000){
				uin = Integer.parseInt(properties.getProperty("uin"));
			}
			stream.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			throw e;
		} catch (IOException e) {
			e.printStackTrace();
			throw e;
		}
		
		if(IP_PORT==null || IP_PORT.length()<=0){
			System.out.println("读不到IP_PORT设置，默认测试dev环境");
			IP_PORT = "http://10.6.206.48:9001";
		}
		
		super.runTest();
	}
	
	@Override
	protected void tearDown() throws Exception {
		apiClient = null;
		System.out.println("<<<<<<<<<<<<<<<测试方法:" + getName()+"运行完毕<<<<<<<<<<<<<<");
		System.out.println("\r\n\r\n");
	}
	

	/**
	 * 请参考方法：testBase(ApiParameter parameter, String format, ApiTestEnum api)
	 */
	//@Deprecated
	protected void testBase(ApiParameter parameter, String format, String modelName, String actionName) throws UnsupportedEncodingException, IOException {
		System.out.println("请求服务:" + IP_PORT+"/"+modelName+"/"+actionName+".xhtml");
		if(sessionKey!=null && sessionKey.length()==10){
			System.err.println("采用Skey["+sessionKey+"]值请求服务");
			apiClient = new ApiClient(uin, sessionKey);
		}else{
			apiClient = new ApiClient(spid, secretKey, uin, token);
		}
		
		apiClient.setDebug(debug);
		apiClient.setCharset(charset);
		apiClient.setPureData(pureData);
		apiClient.setFormat(format);
		boolean api = apiClient.invokeApi(IP_PORT+"/"+modelName+"/"+actionName+".xhtml", parameter);
		if(api){
			if(format.equals("xml")){
				isRightXML(actionName);
			}else if(format.equals("json")){
				isRightJson();
			}else{
				throw new RuntimeException("要求返回的格式参数format不正确:"+ format);
			}
		}else{
			throw new RuntimeException("调用失败:" + IP_PORT+"/"+modelName+"/"+actionName+".xhtml");
		}
	}

	private void isRightJson() {
		String content = new String(apiClient.getLastResponseContent(), Charset.forName(charset));
		printDebugContent(content);
		JSONObject json = JSONObject.fromObject(content);
		if(json == null) {
			throw new RuntimeException("JSONObject解析json后返回null");
		}
		Integer errorCode = (Integer) json.get("errorCode");
		Object errorMessage = json.get("errorMessage");
		if(errorCode != 0){
			throw new RuntimeException("返回失败errorCode["+errorCode+"] errorMessage["+errorMessage+"]");
		}
	}

	private void isRightXML(String actionName) {
		String content = new String(apiClient.getLastResponseContent(), Charset.forName(charset));
		printDebugContent(content);
		Document doc = XmlUtil.createDocument(apiClient.getLastResponseContent());
		if(doc == null) {
			throw new RuntimeException("解析XML后返回null");
		}
		String errorCode = XmlUtil.getElementValueByTagName(doc, actionName, "errorCode");
		String errorMessage = XmlUtil.getElementValueByTagName(doc, actionName, "errorMessage");
		if(Integer.parseInt(errorCode) != 0){
			throw new RuntimeException("返回失败errorCode["+errorCode+"] errorMessage["+errorMessage+"]");
		}
	}

	private void printDebugContent(String content) {
		if(debug) {
			System.out.println("----------- " + apiClient.getLastResponseContentType() + " -----------");
			System.out.println(content);
			System.out.println("----------- end -----------");
		}
	}

	/**
	 * 测试的基础方法,在单元测试中直接使用该方法就可以了
	 * @param parameter
	 * @param format
	 * @param api
	 * @throws UnsupportedEncodingException
	 * @throws IOException
	 */
	public void testBase(ApiParameter parameter, String format, ApiTestEnum api) throws UnsupportedEncodingException, IOException {
		System.out.println("商家【"+business+"】["+uin+"]测试API接口["+api.getFloder()+"]["+api.name()+"]【"+api.getShowInfo()+"】");
		testBase(parameter, format, api.getFloder(), api.name());
	}


	public int getUin() {
		return uin;
	}
	
}
