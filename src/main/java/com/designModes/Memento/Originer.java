/*
 * Copyright (C), 2014-2017, 运策物流
 * FileName: Originer.java
 * Author:   yhx
 * Date:     2017年2月18日 下午2:14:20
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
public class Originer {

	private String status;

	private int code;

	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * @param status the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}

	private class Memento implements IMementoIF{

		private String status;

		/**
		 * @return the status
		 */
		private String getStatus() {

			return status;
		}

		/**
		 * @param status the status to set
		 */
		private void setStatus(String status) {
			this.status = status;
		}

		public Memento(String status){
			this.status = status;
		}
	}

	public Memento createMemto(){
		return new Memento(this.status);
	}

	public void retraive(IMementoIF me){
		Memento m=(Memento)me;
		this.status=m.status;
	}
}
