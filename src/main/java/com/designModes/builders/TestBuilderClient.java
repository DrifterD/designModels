/*
 * Copyright (C), 2014-2017, 运策物流
 * FileName: TestBuilderClient.java
 * Author:   yhx
 * Date:     2017年2月7日 下午2:12:31
 * Description: //模块目的、功能描述
 * History: //修改记录
 * <author>      <time>      <version>    <desc>
 * 修改人姓名             修改时间            版本号                  描述
 */
package com.designModes.builders;

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
		sequence.add("stop");
		sequence.add("start");

		MBWBuilder builder=new MBWBuilder();
		builder.setSequence(sequence);
		CarModel car=builder.getCarModel();
		car.run();
	}

}
