/*
 * Copyright (C), 2014-2017, 运策物流
 * FileName: ConcreteCommander.java
 * Author:   yhx
 * Date:     2017年2月17日 下午4:01:12
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
public class ConcreteCommander implements ICommander {

	private IReceiver receiver;

	public ConcreteCommander(IReceiver receiver){
		this.receiver=receiver;
	}

	public void execute() {
		System.out.println("command 被执行咯");
		this.receiver.action();
	}
}
