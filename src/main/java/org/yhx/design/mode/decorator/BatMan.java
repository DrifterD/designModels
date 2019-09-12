/*
 * Copyright (C), 2017-2019 bigmoon
 * FileName: BatMan.java
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
public class BatMan extends BaseDecorator{

	public BatMan(Person person){
		super(person);
	}

	private void self(){
		System.out.println("带上头盔，还有一辆蝙蝠车");
	}

	@Override
	public void wearClose() {
		super.wearClose();
		self();
	}



}
