package com.iyooc.core.account.model.util;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Properties;

/**
 * @ClassName: CoreUtil  
 * @Description: 系统基本工具类
 * @author JOJIN
 * @date 2016年4月8日 上午10:53:05  
 * @version V2.0
 */
public class CoreUtil {
	/**
	 * @Title: getPropertie  
	 * @Description: 获取config.properties配置文件信息
	 * @param @param key
	 * @param @return 
	 * @return String 
	 * @throws
	 */
	public static String getPropertie(String key){
		Properties prop = new Properties();
		try {
			 InputStream is=CoreUtil.class.getClassLoader().getResourceAsStream("config.properties");  
			 BufferedReader fis= new BufferedReader(new InputStreamReader(is));  
			 prop.load(fis);
		} catch (Exception e) {
			 return null;
		}
		return prop.getProperty(key);
	}

	/**
	 * @Title: getPropertie  
	 * @Description: 根据配置文件名称，获取配置信息。
	 * @param @param propName
	 * @param @param key
	 * @param @return 
	 * @return String 
	 * @throws
	 */
	public static String getPropertie(String propName,String key){
		Properties prop = new Properties();
		try {
			 InputStream is=CoreUtil.class.getClassLoader().getResourceAsStream(propName+".properties");  
			 BufferedReader fis= new BufferedReader(new InputStreamReader(is));  
			 prop.load(fis);
		} catch (Exception e) {
			 return null;
		}
		return prop.getProperty(key);
	}
}
