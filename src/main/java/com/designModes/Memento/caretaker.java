/*
 * Copyright (C), 2014-2017, 运策物流
 * FileName: caretaker.java
 * Author:   yhx
 * Date:     2017年2月18日 下午3:56:03
 * Description: //模块目的、功能描述
 * History: //修改记录
 * <author>      <time>      <version>    <desc>
 * 修改人姓名             修改时间            版本号                  描述
 */
package com.designModes.Memento;

/**
 * 〈一句话功能简述〉<br>
 * 〈功能详细描述〉
 *
 * @author yanghanxiu
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
public class caretaker {

	private IMementoIF mement;

	public IMementoIF retaiveMement(){
		return this.mement;
	}

	public void saveMement(IMementoIF me){
		this.mement=me;
	}
}
