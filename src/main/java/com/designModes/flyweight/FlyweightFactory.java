/*
 * Copyright (C), 2014-2017, 运策物流
 * FileName: FlyweightFactory.java
 * Author:   yhx
 * Date:     2017年2月21日 上午9:16:00
 * Description: //模块目的、功能描述
 * History: //修改记录
 * <author>      <time>      <version>    <desc>
 * 修改人姓名             修改时间            版本号                  描述
 */
package com.designModes.flyweight;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 * 〈一句话功能简述〉<br>
 * 〈功能详细描述〉
 *
 * @author yanghanxiu
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
public class FlyweightFactory {

	private Map<String,Flyweight> map=new HashMap<String,Flyweight>();
	private static FlyweightFactory ff=null;

	private FlyweightFactory(){}

	public static FlyweightFactory generatorFactory(){

		if(ff==null){
			ff=new FlyweightFactory();
		}
		return ff;
	}

	public Flyweight createFlyweight(String status){

		if(map.containsKey(status)){

			return map.get(status);
		}else{

			Flyweight fly=new ConcreteFlyweight(status);
			map.put(status, fly);
			return fly;
		}
	}

	public void checkFlyweight(){

		Set<Entry<String,Flyweight>> setg=map.entrySet();

		for(Entry<String,Flyweight> entry:setg){
			System.out.println("inner status="+entry.getKey()+",value="+entry.getValue());
		}

	}
}
