package com.iyooc.core.account.model.util;

import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @ClassName: StringUtil  
 * @Description: String 工具类
 * @author JOJIN
 * @date 2016年4月8日 上午10:52:24  
 * @version V2.0
 */
public class StringUtil {
	public static final String EMPTY_STRING = "";
	
	//判断不为null 并且不为空
	public static boolean isNotNullEmptyStr(String str) {
		return !StringUtil.isNullOrEmptyStr(str);
	}

	//判断为null 或者 为空
	public static boolean isNullOrEmptyStr(String str) {
		return str == null || StringUtil.EMPTY_STRING.equals(str);
	}
	
	//将null转换为空字符串,如果是非空字符串则返回原字符串    注：如果有特殊字符“"№"” 将替换为“”。
	public static String nullToEmpty(Object object){
		if (object == null||"".equals(object.toString().trim()) ||"№".equals(object.toString().trim())) {
			return "";
		}
		return object.toString(); 
	}
	
	//将 null 转换为 double
	public static Double nullToDouble(Object object){
		if (object == null||"".equals(object.toString().trim()) ||"№".equals(object.toString().trim())) {
			return 0.00;
		}     
		DecimalFormat df = new DecimalFormat("########0.00");     
		return Double.valueOf(df.format(Double.valueOf(object.toString())));  
	}   
	
	//将null 转换为 int
	public static int nullEmptyToInt(Object object){
		if (object == null||"".equals(object.toString().trim()) ||"№".equals(object.toString().trim())) {
			return 0;
		}  
		return Integer.parseInt(object.toString());   
	}
	
	//将null 转换为 long
	public static long nullEmptyToLong(Object object){
		if (object == null||"".equals(object.toString().trim()) ||"№".equals(object.toString().trim())) {
			return 0;
		}  
		return Long.parseLong(object.toString());   
	}
	
	//将null 转换为Date
	public static Date nullToDate(Object object,String type){
		if(type.equals("")||type==null){
			type="yyyy-MM-dd HH:mm:ss";   
		}
		SimpleDateFormat sdf = new SimpleDateFormat(type); 
		if (object == null||"".equals(object.toString().trim()) ||"№".equals(object.toString().trim())) {
			object=new Date();
		}  
		Date date=new Date();  
		try {
			date = sdf.parse(object.toString());
		} catch (ParseException e) {
			e.printStackTrace();
		} 
		return date;     
	} 

	/**
	 * 格式化字符串
	 * 
	 * 例：formateString("xxx{0}bbb",1) = xxx1bbb
	 * 
	 * @param str
	 * @param params
	 * @return
	 */
	public static String formateString(String str, String... params) {
		for (int i = 0; i < params.length; i++) {
			str = str.replace("{" + i + "}", params[i] == null ? StringUtil.EMPTY_STRING : params[i]);
		}
		return str;
	}
	
	/**
     * <pre>
     * 检查给出的字符串是否有长度.
     * 
     * 如果给出的字符串为null 或 "", 则返回false.
     * 例如: 
     * StringUtil.hasLength(null)   == false;
     * StringUtil.hasLength("")     == false;
     * StringUtil.hasLength(" ")    == true;
     * StringUtil.hasLength("　")   == true;
     * StringUtil.hasLength("abc")  == true;
     * StringUtil.hasLength("abc ") == true;
     * StringUtil.hasLength(" abc") == true;
     * </pre>
     * 
     * @param cs 给出的字符串.
     * @return boolean 是否有长度.
     */
    public static boolean hasLength(CharSequence cs) {
        // 主要判断字符串对象不为null, 同时其字符长度大于等于 1, 则返回true
        return (null != cs && 1 <= cs.length());
    }
    
    /**
     * <pre>
     * 检查给出的字符串是否至少拥有一个非空格（包括中文空格）字符.
     * 
     * 如果给出的字符串为null 或 "", 则返回false.
     * 例如: 
     * StringUtil.hasText(null)    == false;
     * StringUtil.hasText("")      == false;
     * StringUtil.hasText(" ")     == false;
     * StringUtil.hasText("　")    == false;
     * StringUtil.hasText("abc")   == true;
     * StringUtil.hasText("abc")   == true;
     * StringUtil.hasText(" abc ") == true;
     * </pre>
     * 
     * @param str 给出的字符串.
     * @return boolean 是否至少拥有一个非空格（包括中文空格）字符.
     * @see java.lang.Character#isWhitespace
     */
    public static boolean hasText(CharSequence str) {
        int len = 0;
        if (null == str || 0 == (len = str.length())) {
            return false;
        }

        // 依次判断每个字符是否为空格（中文）, 如果为空格则返回false.
        for (int i = 0; i < len; i++) {
            if (!Character.isWhitespace(str.charAt(i))) {
                return true;
            }
        }
        return false;
    }
}
