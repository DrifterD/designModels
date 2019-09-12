/*
 * Copyright (C), 2017-2019 bigmoon
 * FileName: Client.java
 * Author:   bigmoon
 * Date:     19-5-6 上午9:32
 * Description: designModels
 */
package org.yhx.design.mode.Memento;

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

		caretaker ct=new caretaker();
		Originer or=new Originer();
		or.setStatus("off");
		ct.saveMement(or.createMemto());

		or.setStatus("on");
		System.out.println("status has chaneged status:"+or.getStatus());
		System.out.println("starting retraive");
		or.retraive(ct.retaiveMement());
		System.out.println("status has retraive status:"+or.getStatus());
	}

}
