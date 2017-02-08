/*
 * Copyright (C), 2014-2017, 运策物流
 * FileName: BatMan.java
 * Author:   yhx
 * Date:     2017年2月8日 下午4:12:54
 * Description: //模块目的、功能描述
 * History: //修改记录
 * <author>      <time>      <version>    <desc>
 * 修改人姓名             修改时间            版本号                  描述
 */
package com.designModes.decorator;

/**
 * 〈一句话功能简述〉<br>
 * 〈功能详细描述〉
 *
 * @author yanghanxiu
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
