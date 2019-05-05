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
 * 命令模式：主要是实现高内聚，扩展性。将客户端请求封装成对象和参数化，具有可扩展性。
 * 对请求排队或者对请求日志，可以实现撤回和恢复功能（不知如何实现？A:实现撤回必须是每个Receiver自己实现rollback功能，
 * 通过日志实现回滚机制）
 * 角色:
 * Receiver:具体实现逻辑功能模块
 * command 命令角色，请求的封装
 * Invoker:命令调用者
 *
 * 命令模式优点：
 * 1.类间解耦
 * 2.可扩展性。command 可以扩展无限个命令，但是这也是个缺点，导致冗余类
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
		ICommander commander=new ConcreteCommander();
		Invoker invoker=new Invoker(commander);
		invoker.doIt();
	}

}
