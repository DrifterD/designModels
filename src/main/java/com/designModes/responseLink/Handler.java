/*
 * Copyright (C), 2014-2017, 运策物流
 * FileName: IHandler.java
 * Author:   yhx
 * Date:     2017年2月15日 上午9:03:17
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
public abstract class Handler {

	public final static String F_LEVEL="1";

	public final static String S_LEVEL="2";

	private Handler next;

	private String level;


	/**
	 * @return the level
	 */
	public String getLevel() {
		return level;
	}



	/**
	 * @param level the level to set
	 */
	public void setLevel(String level) {
		this.level = level;
	}



	/**
	 * @return the next
	 */
	public Handler getNext() {
		return next;
	}



	/**
	 * @param next the next to set
	 */
	public void setNext(Handler next) {
		this.next = next;
	}

	public Handler(String level){
		this.level=level;
	}



	public void response(IRequest request){

		if(request.getLevel().equals(this.level)){
			this.handlerRequest(request);
		}else if(this.next!=null){
			this.next.handlerRequest(request);
		}
	}

	protected abstract void handlerRequest(IRequest request);
}
