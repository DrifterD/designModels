/*
 * Copyright (C), 2017-2019 bigmoon
 * FileName: MBWBuilder.java
 * Author:   bigmoon
 * Date:     19-5-6 上午9:32
 * Description: designModels
 */
package org.yhx.design.mode.builders;

import java.util.List;

/**
 * 〈一句话功能简述〉<br>
 * 〈功能详细描述〉
 *
 * @author bigmoon
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
public class MBWBuilder {

	private List<String> sequence;



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



	public CarModel getCarModel(){
		BMWCar car=new BMWCar();
		car.setSequence(this.sequence);
		return car;
	}
}
