/*
 * Copyright (C), 2017-2019 bigmoon
 * FileName: Thing.java
 * Author:   bigmoon
 * Date:     19-5-6 上午9:32
 * Description: designModels
 */
package org.yhx.design.mode.prototype;

import java.util.ArrayList;
import java.util.List;

/**
 * 〈一句话功能简述〉<br>
 * 〈功能详细描述〉
 *
 * @author bigmoon
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
public class Thing implements Cloneable {

	private String name;
	private List<String> ids;



	/**
	 * @return the ids
	 */
	public List<String> getIds() {
		return ids;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	public Thing(){
		System.out.println("create thing obj");
		this.ids=new ArrayList<String>();
	}


	@Override
	protected Thing clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		Thing t= (Thing)super.clone();
		t.ids=new ArrayList<String>();
		for(String tmp:this.ids){
			t.add(tmp);
		}

		return t;
	}

	public String test(){
		return "test";
	}

	public void add(String item){
		this.ids.add(item);
	}

	public void remove(String item){
		this.ids.remove(item);
	}


	@Override
	public String toString() {
		return "thing;name="+this.name+", ids="+this.ids;
	}


	public static void main(String[] args) throws CloneNotSupportedException{

		Thing t=new Thing();
		t.setName("protype");
		t.add("1");
		t.add("2");
		System.out.println("t="+t);
		Thing tcopy=t.clone();
		tcopy.setName("copy");
		tcopy.add("a");
		System.out.println("t="+t+", copy="+tcopy);
		//操作原型list
		t.remove("1");



		System.out.println("t="+t+", copy="+tcopy);

	}


}
