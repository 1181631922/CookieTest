package com.example.util;public class URLContainer {	// 服务器地址	private static final String YOUKU_WIRELESS_DOMAIN = "http://api.3g.youku.com/openapi-wireless/";	//	private static final String statString = "pid=634021447f7a2fec&guid=09df3ae73328f8e24dc83a750091d700&ver=1.4.2&network=WIFI";	/**	 * 获取登录地址	 * @param userName	 * @param password	 * @param sessionId	 * @return	 */	public static String getLoginUrl(String userName, String password) {		String url = YOUKU_WIRELESS_DOMAIN + "user/login?" + statString + "&uname=" + userName + "&pwd=" + Util.md5(password);		return url;	}		/**	 * 获得当前用户的云端播放历史	 * 当前用户必须先登录，服务端要取客户端cookie。	 * 在Request Headers Cookies需要包含下列值（调用登录接口时写入到Cookie中的）：	 * u=XXX;	 * k=XXX;	 * v=XXX;	 * YOUKUSESSID=XXX;	 * @param userid	 * @return 	 */	public static String getPlayHistoryInCloud() {		String url = YOUKU_WIRELESS_DOMAIN + "user/history?" + statString;		return url;	}}	