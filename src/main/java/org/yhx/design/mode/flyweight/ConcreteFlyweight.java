/*
 * Copyright (C), 2017-2019 bigmoon
 * FileName: ConcreteFlyweight.java
 * Author:   bigmoon
 * Date:     19-5-6 上午9:32
 * Description: designModels
 */
package org.yhx.design.mode.flyweight;

/**
 * 〈一句话功能简述〉<br>
 * 〈功能详细描述〉
 *
 * @author bigmoon
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
public class ConcreteFlyweight extends Flyweight{

	private final String outStatus;	
	
	public String getOutStatus() {
		return outStatus;
	}

	public ConcreteFlyweight(String outStatus){		
		this.outStatus=outStatus; 		
	}

	@Override
	public void operation(String outStatus) {
		System.out.println("inner status="+this.getInnerStatus()+", out status="+outStatus);
	}

}
