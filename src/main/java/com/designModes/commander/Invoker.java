/*
 * Copyright (C), 2014-2017, 运策物流
 * FileName: Invoker.java
 * Author:   yhx
 * Date:     2017年2月17日 下午3:56:01
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
