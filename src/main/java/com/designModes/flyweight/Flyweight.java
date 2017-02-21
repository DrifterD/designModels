/*
 * Copyright (C), 2014-2017, 运策物流
 * FileName: IFlyweight.java
 * Author:   yhx
 * Date:     2017年2月21日 上午9:12:25
 * Description: //模块目的、功能描述
 * History: //修改记录
 * <author>      <time>      <version>    <desc>
 * 修改人姓名             修改时间            版本号                  描述
 */
package com.designModes.flyweight;

/**
 * 〈一句话功能简述〉<br>
 * 〈功能详细描述〉
 *
 * @author yanghanxiu
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
public abstract class Flyweight {

	private String innerStatus;

	/**
	 * @return the innerStatus
	 */
	public String getInnerStatus() {
		return innerStatus;
	}

	public Flyweight(String innerStatus){
		this.innerStatus=innerStatus;
	}


	public abstract void operation(String outStatus);
}
