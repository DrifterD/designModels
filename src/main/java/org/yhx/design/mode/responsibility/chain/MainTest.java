/*
 * Copyright (c) 2004- 2019 All Rights Reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 * FileName: MainTest.java
 * Author:   bigmoon
 * Date:     19-9-12 下午4:50
 * Description: designModels
 */
package org.yhx.design.mode.responsibility.chain;

/**
 *  责任链设计模式：
 *
 * @author bigmoon
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
public class MainTest {

	/**
	 * 功能描述: <br>
	 * 〈功能详细描述〉
	 *
	 * @param args
	 * @see [相关类/方法](可选)
	 * @since [产品/模块版本](可选)
	 */
	public static void main(String[] args) {
		WifeRequest request=new WifeRequest();
		request.setLevel(Handler.F_LEVEL);

		Handler f=new FatherHandler();
		Handler s=new HusbandHandler();
		f.setNext(s);
		f.response(request);



	}

}
