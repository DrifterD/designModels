/*
 * Copyright (C), 2014-2017, 运策物流
 * FileName: BZCar.java
 * Author:   yhx
 * Date:     2017年2月7日 下午2:22:17
 * Description: //模块目的、功能描述
 * History: //修改记录
 * <author>      <time>      <version>    <desc>
 * 修改人姓名             修改时间            版本号                  描述
 */
package com.designModes.builders;

/**
 * 〈一句话功能简述〉<br>
 * 〈功能详细描述〉
 *
 * @author yanghanxiu
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
public class BMWCar extends CarModel {

	@Override
	public void start() {
		System.out.println("宝马启动........");

	}

	@Override
	public void stop() {
		System.out.println("宝马停止........");

	}

	@Override
	public void enginBoom() {
		System.out.println("宝马发动引擎........");

	}


}
