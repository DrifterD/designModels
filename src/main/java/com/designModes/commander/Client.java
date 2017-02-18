/*
 * Copyright (C), 2014-2017, 运策物流
 * FileName: Client.java
 * Author:   yhx
 * Date:     2017年2月17日 下午4:04:06
 * Description: //模块目的、功能描述
 * History: //修改记录
 * <author>      <time>      <version>    <desc>
 * 修改人姓名             修改时间            版本号                  描述
 */
package com.designModes.commander;

/**
 * 〈一句话功能简述〉<br>
 * 〈功能详细描述〉
 *
 * @author yanghanxiu
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
public class Client {

	/**
	 * 功能描述: <br>
	 * 〈功能详细描述〉
	 *
	 * @param args
	 * @see [相关类/方法](可选)
	 * @since [产品/模块版本](可选)
	 */
	public static void main(String[] args) {


		IReceiver receiver=new ConcreteReceiver();
		ICommander commander=new ConcreteCommander(receiver);
		Invoker invoker=new Invoker(commander);
		invoker.doIt();
	}

}
