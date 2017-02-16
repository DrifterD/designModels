/*
 * Copyright (C), 2014-2017, 运策物流
 * FileName: WifeRequest.java
 * Author:   yhx
 * Date:     2017年2月16日 上午8:42:18
 * Description: //模块目的、功能描述
 * History: //修改记录
 * <author>      <time>      <version>    <desc>
 * 修改人姓名             修改时间            版本号                  描述
 */
package com.designModes.responseLink;

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
