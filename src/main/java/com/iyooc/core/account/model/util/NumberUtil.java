package com.iyooc.core.account.model.util;

import java.util.Random;
import java.util.UUID;

/**
 * @ClassName: UUIDUtil
 * @Description: 系统编号生成类
 * @author JOJIN
 * @date 2015年11月11日 下午4:20:45
 * @version V2.0
 */
public class NumberUtil {

	// 渠道编号
	public static String CHANNEL = CoreUtil.getPropertie("common.channel");
	// 负载编号
	public static String LOADBP = CoreUtil.getPropertie("common.loadBalancePref");

	/**
	 * @Title: getUUID32bit @Description: <br> 获取32位UUID @param @return @return
	 * String @throws
	 */
	public synchronized static String getUUID32bit() {
		String baseUUID = UUID.randomUUID().toString().replace("-", "");
		return baseUUID;
	}

	/**
	 * @Title: getUUID36bit @Description: <br>
	 * 获取全系统唯一36位标识 @param @return @return String @throws
	 */
	public synchronized static String getUUID36bit() {
		String baseUUID = CHANNEL + LOADBP + UUID.randomUUID().toString().replace("-", "");
		return baseUUID;
	}

	/**
	 * @Title: getUUID64bit @Description: <br>
	 * 获取全系统唯一64位标识 @param @return @return String @throws
	 */
	public synchronized static String getUUID64bit() {
		String baseUUID = getUUID36bit() + UUID.randomUUID().toString().replace("-", "").substring(0, 28);
		return baseUUID;
	}

	/**
	 * @Title: getRandomCode @Description: <br> 生成10位以内固定单位的随机数 <br>
	 * 1、可用于生成电话号码、邮箱验证码。 <br> 2、 可用于生成1到10之间的任何随机数。 @param @param
	 * len @param @return @return Long @throws
	 */
	public synchronized static Long getRandomCode(int len) {
		if (10 < len || len < 1)
			throw new IllegalArgumentException("传入的参数必须在1-10之间");
		double a = 10, b = len;
		int radix1 = (int) Math.pow(a, b);
		int radix2 = (int) Math.pow(a, b - 1);
		return (long) (new Random().nextInt(radix1 - radix2) + radix2);
	}
	static int SYSTEM_AUTO_MEMBER_INDEX = 0;
	static long CURRENT_TIME_MILLIS = 1467030558205l;

	public synchronized static String getRightCode() {
		String num = "0";
		if (99 < ++SYSTEM_AUTO_MEMBER_INDEX) {
			SYSTEM_AUTO_MEMBER_INDEX = 0;
		}
		int inx = String.valueOf(SYSTEM_AUTO_MEMBER_INDEX).length();
		int len = 2;
		for (int i = len - inx; 0 < i; i--) {
			num += "0";
		}
		num += SYSTEM_AUTO_MEMBER_INDEX;
		num = LOADBP + (DateUtil.get_Long$currentTimeMillis() - CURRENT_TIME_MILLIS) + num;
		return num;
	}

	public static void main(String[] args) {
		for (int i = 0; i < 30; i++) {
			System.out.println(getRightCode());
		}
	}
}
