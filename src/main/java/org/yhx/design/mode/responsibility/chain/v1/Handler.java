/*
 * Copyright (c) 2004- 2019 All Rights Reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 * FileName: Handler.java
 * Author:   bigmoon
 * Date:     19-9-12 下午4:50
 * Description: designModels
 */
package org.yhx.design.mode.responsibility.chain.v1;

/**
 * 〈一句话功能简述〉<br>
 * 〈功能详细描述〉
 *
 * @author bigmoon
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
