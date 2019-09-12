/*
 * Copyright (C), 2017-2019 bigmoon
 * FileName: ComponentClient.java
 * Author:   bigmoon
 * Date:     19-5-6 上午9:32
 * Description: designModels
 */
package org.yhx.design.mode.component;

/**
 * 〈一句话功能简述〉<br>
 * 〈功能详细描述〉
 *
 * @author bigmoon
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
public class ComponentClient {

	/**
	 * 功能描述: <br>
	 * 〈功能详细描述〉
	 *
	 * @param args
	 * @see [相关类/方法](可选)
	 * @since [产品/模块版本](可选)
	 */
	public static void main(String[] args) {
		Component com1=new Composite("王有朝","ceo","总经理");
		Component com2=new Composite("庄海泉","ddm","研发经理");
		Component com3=new Composite("田刚","sdm","销售经理");
		Component com4=new Composite("关节","fdm","财务经理");
		Component com5=new Composite("张赞聪","k","总经理秘书");

		Component com6=new Composite("sale1","a","销售员工A");
		Component com7=new Composite("会计","b","财务员工B");

		Component com8=new Composite("总理","Da","开发员工a");
		Component com9=new Composite("杨哈希","Db","开发员工B");

		com1.add(com2);
		System.out.println(com2);
		/*com1.add(com3);
		com1.add(com4);
		com1.add(com5);
		com2.add(com8);
		com2.add(com9);
		com3.add(com6);
		com4.add(com7);
*/
		String value="java";
		test(value);
		System.out.println(value);

	}

	public static void test(String value){
		value+="11";
		System.out.println(value);
	}
}
