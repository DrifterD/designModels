/*
 * Copyright (C), 2017-2019 bigmoon
 * FileName: SuperMan.java
 * Author:   bigmoon
 * Date:     19-5-6 上午9:32
 * Description: designModels
 */
package org.yhx.design.mode.decorator;

/**
 * 〈一句话功能简述〉<br>
 * 〈功能详细描述〉
 *
 * @author bigmoon
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
public class SuperMan extends BaseDecorator{

	public SuperMan(Person person){
		super(person);
	}

	private void self(){
		System.out.println("穿上内裤，不用车直接飞");
	}

	@Override
	public void wearClose() {
		super.wearClose();
		self();
	}



}
