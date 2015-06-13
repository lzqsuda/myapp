package com.itrueshop.test;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;

import org.apache.commons.lang.StringUtils;

import com.itrueshop.util.SystemConfigUtil;

//import sun.misc.BASE64Decoder;

public class TheMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String urlString = "c2hvcHh4Lm5ldA";//123efakiaHR0cDovL3d3dy5zaG9weHgubmV0L2NlcnRpZmljYXRlLmFjdGlvbj9zaG9wVXJsPQ
		//BASE64Decoder bASE64Decoder = new BASE64Decoder();
//		try {
//			
//			String urlString = "123efakiaHR0cDovL3d3dy5zaG9weHgubmV0L2NlcnRpZmljYXRlLmFjdGlvbj9zaG9wVXJsPQ";
//			BASE64Decoder bASE64Decoder = new BASE64Decoder();
//			urlString = new String(bASE64Decoder.decodeBuffer(StringUtils.substring(urlString, 8) + "=="));
//			URL url = new URL(urlString + SystemConfigUtil.getSystemConfig().getShopUrl());
//			URLConnection urlConnection = url.openConnection();
//			HttpURLConnection httpConnection = (HttpURLConnection)urlConnection;
//			httpConnection.getResponseCode();
//			
//			//urlString = new String(bASE64Decoder.decodeBuffer(urlString));
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
	}

}
