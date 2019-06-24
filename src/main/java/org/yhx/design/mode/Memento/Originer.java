/*
 * Copyright (C), 2017-2019 bigmoon
 * FileName: Originer.java
 * Author:   bigmoon
 * Date:     19-5-6 上午9:32
 * Description: designModels
 */
package org.yhx.design.mode.Memento;

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
