/*
 * Copyright (C), 2017-2019 bigmoon
 * FileName: WifeRequest.java
 * Author:   bigmoon
 * Date:     19-5-6 上午9:32
 * Description: designModels
 */
package org.yhx.design.mode.responseLink;

/**
 * 〈一句话功能简述〉<br>
 * 〈功能详细描述〉
 *
 * @author yanghanxiu
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
public class WifeRequest implements IRequest {

	private String level;

	public WifeRequest(){

	}

	/**
	 * @param level the level to set
	 */
	public void setLevel(String level) {
		this.level = level;
	}



	public String getLevel() {
		// TODO Auto-generated method stub
		return this.level;
	}

	public String request() {
		System.out.println("请求下");
		return "";
	}

}
