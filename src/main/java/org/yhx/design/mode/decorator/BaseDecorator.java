/*
 * Copyright (C), 2017-2019 bigmoon
 * FileName: BaseDecorator.java
 * Author:   bigmoon
 * Date:     19-5-6 上午9:32
 * Description: designModels
 */
package org.yhx.design.mode.decorator;

/**
 * 〈一句话功能简述〉<br>
 * 〈功能详细描述〉
 *
 * @author yanghanxiu
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
public class BaseDecorator implements Person {

	Person person=null;

	public BaseDecorator(Person person){
		this.person=person;
	}

	public void wearClose() {
		//this.person.wearClose();
	}
}
