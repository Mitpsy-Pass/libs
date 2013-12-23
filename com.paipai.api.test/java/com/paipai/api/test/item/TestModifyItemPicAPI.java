package com.paipai.api.test.item;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.URL;

import javax.activation.URLDataSource;

import com.paipai.api.test.util.ApiTestEnum;
import com.paipai.api.test.util.TestAPIBase;
import com.paipai.api.util.ApiParameter;

/**
 * 测试修改商品的图片
 * @author ankerdiao
 * @date 2010-5-14
 */
public class TestModifyItemPicAPI extends TestAPIBase{

	@Override
	protected void setUp() throws Exception {
		super.setUp();
		this.keyFileName = "855008931_idc";
	}
	
	public void testModifyItemPic() throws UnsupportedEncodingException, IOException {
		ApiParameter parameter = new ApiParameter();
		parameter.addStringParam("itemLocalCode", "");
		parameter.addStringParam("itemCode", "A366F63200000000002339E9069E79AD");
		parameter.addStringParam("index", "0");
		parameter.addFileParam("pic", "./item_image/33.jpg");
		testBase(parameter, "xml", ApiTestEnum.modifyItemPic);
	}
	
}
