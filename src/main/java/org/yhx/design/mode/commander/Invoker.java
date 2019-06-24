/*
 * Copyright (C), 2017-2019 bigmoon
 * FileName: Invoker.java
 * Author:   bigmoon
 * Date:     19-5-6 上午9:32
 * Description: designModels
 */
package org.yhx.design.mode.commander;

/**
 * 〈一句话功能简述〉<br>
 * 〈功能详细描述〉
 *
 * @author yanghanxiu
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
public class Invoker {

	private ICommander commander;

	public Invoker(ICommander commander){
		this.commander = commander;
	}

	/**
	 * @return the commander
	 */
	public ICommander getCommander() {
		return commander;
	}

	/**
	 * @param commander the commander to set
	 */
	public void setCommander(ICommander commander) {
		this.commander = commander;
	}

	public void doIt(){
		System.out.println("invoker 开始执行命令");
		commander.execute();
	}

}
