/*
 * Copyright (C), 2017-2019 bigmoon
 * FileName: BZCar.java
 * Author:   bigmoon
 * Date:     19-5-6 上午9:32
 * Description: designModels
 */
package org.yhx.design.mode.builders;

/**
 * 〈一句话功能简述〉<br>
 * 〈功能详细描述〉
 *
 * @author bigmoon
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
public class BZCar extends CarModel {

	@Override
	public void start() {
		System.out.println("奔驰启动........");

	}

	@Override
	public void stop() {
		System.out.println("奔驰停止........");

	}

	@Override
	public void enginBoom() {
		System.out.println("奔驰发动引擎........");

	}



}
