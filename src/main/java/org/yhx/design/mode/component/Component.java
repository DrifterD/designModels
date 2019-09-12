/*
 * Copyright (C), 2017-2019 bigmoon
 * FileName: Component.java
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
public abstract class Component {

	private String post;
	private String name;
	private Component parent;
	private String code;






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



	/**
	 * @return the code
	 */
	public String getCode() {
		return code;
	}



	/**
	 * @param code the code to set
	 */
	public void setCode(String code) {
		this.code = code;
	}



	/**
	 * @return the name
	 */
	public String getPost() {
		return post;
	}



	/**
	 * @param name the name to set
	 */
	public void setPost(String post) {
		this.post = post;
	}


	public Component(String name,String code,String post){
		this.name=name;
		this.code=code;
		this.post=post;
	}




	/**
	 * @return the parent
	 */
	public Component getParent() {
		return parent;
	}


	/**
	 * @param parent the parent to set
	 */
	public void setParent(Component parent) {
		this.parent = parent;
	}


	public void doSomething(){
		System.out.println(this.name+","+this.code+","+this.post);
	}

	public abstract void add(Component com);

	public abstract void iterator();

	public abstract void findChilden(Component parent);

	public static void getChildenBychilden(Component childen){
		childen.getParent().iterator();
	}

	@Override
	public String toString(){
		return (this.name+","+this.code+","+this.post+",parent=["+this.parent+"]");
	}

}
