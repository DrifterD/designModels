/*
 * Copyright (C), 2014-2017, 运策物流
 * FileName: TestClient.java
 * Author:   yhx
 * Date:     2017年2月8日 上午11:07:55
 * Description: //模块目的、功能描述
 * History: //修改记录
 * <author>      <time>      <version>    <desc>
 * 修改人姓名             修改时间            版本号                  描述
 */
package com.designModes.prototype;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Proxy;

/**
 * 〈一句话功能简述〉<br>
 * 〈功能详细描述〉
 *
 * @author yanghanxiu
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
public class TestClient {

	/**
	 * 功能描述: <br>
	 * 〈功能详细描述〉
	 *
	 * @param args
	 * @throws SecurityException
	 * @throws NoSuchMethodException
	 * @throws InvocationTargetException
	 * @throws IllegalArgumentException
	 * @throws IllegalAccessException
	 * @throws InstantiationException
	 * @see [相关类/方法](可选)
	 * @since [产品/模块版本](可选)
	 */
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
		IGamePlay play=new GamePlayer();
		InvocationHandler iplayer=new GamePlayerIH(play);
		IGamePlay proxyPlayer =(IGamePlay)Proxy.newProxyInstance(play.getClass().getClassLoader(),play.getClass().getInterfaces(),iplayer);
		proxyPlayer.login("zhangsan", "1");
	}

}
