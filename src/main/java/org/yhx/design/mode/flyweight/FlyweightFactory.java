/*
 * Copyright (C), 2017-2019 bigmoon
 * FileName: FlyweightFactory.java
 * Author:   bigmoon
 * Date:     19-5-6 上午9:32
 * Description: designModels
 */
package org.yhx.design.mode.flyweight;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 * 〈一句话功能简述〉<br>
 * 〈功能详细描述〉
 *
 * @author bigmoon
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
