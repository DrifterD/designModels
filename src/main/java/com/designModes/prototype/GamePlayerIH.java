/*
 * Copyright (C), 2014-2017, 运策物流
 * FileName: GamePlayerIH.java
 * Author:   yhx
 * Date:     2017年2月8日 下午2:47:47
 * Description: //模块目的、功能描述
 * History: //修改记录
 * <author>      <time>      <version>    <desc>
 * 修改人姓名             修改时间            版本号                  描述
 */
package com.designModes.prototype;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 〈一句话功能简述〉<br>
 * 〈功能详细描述〉
 *
 * @author yanghanxiu
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
public class GamePlayerIH implements InvocationHandler {

	private Class subjectClass=null;

	private Object realSub=null;

	public GamePlayerIH(IGamePlay player){
		this.realSub=player;
	}

	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {

		System.out.println("before invoke");
		return method.invoke(realSub, args);
	}
}
