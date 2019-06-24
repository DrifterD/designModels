/*
 * Copyright (C), 2017-2019 bigmoon
 * FileName: CarModel.java
 * Author:   bigmoon
 * Date:     19-5-6 上午9:32
 * Description: designModels
 */
package org.yhx.design.mode.builders;

import java.util.ArrayList;
import java.util.List;

/**
 * 〈一句话功能简述〉<br>
 * 〈功能详细描述〉
 *
 * @author yanghanxiu
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
public abstract class CarModel {

	private String logo;

	private List<String> sequence=new ArrayList<String>();


	/**
	 * @return the logo
	 */
	public String getLogo() {
		return logo;
	}

	/**
	 * @param logo the logo to set
	 */
	public void setLogo(String logo) {
		this.logo = logo;
	}

	/**
	 * @return the sequence
	 */
	public List<String> getSequence() {
		return sequence;
	}

	/**
	 * @param sequence the sequence to set
	 */
	public void setSequence(List<String> sequence) {
		this.sequence = sequence;
	}

	public abstract void start();

	public abstract void stop();

	public abstract void enginBoom();


	public void run(){

		for(String tmp:this.sequence){

			if(tmp.equals("start")){
				this.start();
			}else if(tmp.equals("stop")){
				this.stop();
			}else if(tmp.equals("enginBoom")){
				enginBoom();
			}
		}
	}
}
