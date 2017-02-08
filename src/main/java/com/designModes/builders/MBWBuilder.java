/*
 * Copyright (C), 2014-2017, 运策物流
 * FileName: ABuilder.java
 * Author:   yhx
 * Date:     2017年2月7日 下午2:37:05
 * Description: //模块目的、功能描述
 * History: //修改记录
 * <author>      <time>      <version>    <desc>
 * 修改人姓名             修改时间            版本号                  描述
 */
package com.designModes.builders;

import java.util.List;

/**
 * 〈一句话功能简述〉<br>
 * 〈功能详细描述〉
 *
 * @author yanghanxiu
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
