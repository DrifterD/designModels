/*
 * Copyright (C), 2017-2019 bigmoon
 * FileName: TestClient.java
 * Author:   bigmoon
 * Date:     19-5-6 上午9:32
 * Description: designModels
 */
package org.yhx.design.mode.prototype;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Proxy;

/**
 * 〈一句话功能简述〉<br>
 * 〈功能详细描述〉
 *
 * @author bigmoon
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
