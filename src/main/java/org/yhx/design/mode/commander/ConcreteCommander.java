/*
 * Copyright (C), 2017-2019 bigmoon
 * FileName: ConcreteCommander.java
 * Author:   bigmoon
 * Date:     19-5-6 上午9:32
 * Description: designModels
 */
package org.yhx.design.mode.commander;

/**
 * 〈一句话功能简述〉<br>
 * 〈功能详细描述〉
 *
 * @author bigmoon
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
public class ConcreteCommander implements ICommander {

	private IReceiver receiver;

	public ConcreteCommander(){
		this.receiver=new ConcreteReceiver();
	}

	public void execute() {
		System.out.println("command 被执行咯");
		this.receiver.action();
	}
}
