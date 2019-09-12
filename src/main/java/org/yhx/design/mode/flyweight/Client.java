/*
 * Copyright (C), 2017-2019 bigmoon
 * FileName: Client.java
 * Author:   bigmoon
 * Date:     19-5-6 上午9:32
 * Description: designModels
 */
package org.yhx.design.mode.flyweight;

/**
 * 〈一句话功能简述〉<br>
 * 〈功能详细描述〉
 *
 * @author bigmoon
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
public class Client {

	/**
	 * 功能描述: <br>
	 * 〈功能详细描述〉
	 *
	 * @param args
	 * @see [相关类/方法](可选)
	 * @since [产品/模块版本](可选)
	 */
	public static void main(String[] args) {
		FlyweightFactory ff=FlyweightFactory.generatorFactory();
		Flyweight fa= ff.createFlyweight("a");
		fa.operation("test a");

		Flyweight fb= ff.createFlyweight("b");
		fa.operation("test b");

		Flyweight fa1= ff.createFlyweight("a");
		fa.operation("test a1");

		ff.checkFlyweight();

	}

}
