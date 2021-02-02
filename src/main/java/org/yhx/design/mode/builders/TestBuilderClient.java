/*
 * Copyright (C), 2017-2019 bigmoon
 * FileName: TestBuilderClient.java
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
 * @author bigmoon
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
public class TestBuilderClient {

	/**
	 * 功能描述: <br>
	 * 〈功能详细描述〉
	 *
	 * @param args
	 * @see [相关类/方法](可选)
	 * @since [产品/模块版本](可选)
	 */
	public static void main(String[] args) {

		List<String> sequence=new ArrayList<String>();
		sequence.add("start");
		sequence.add("stop");

		MBWBuilder builder=new MBWBuilder();
		builder.setSequence(sequence);
		CarModel car=builder.getCarModel();
		car.run();
	}

}
