/*
 * Copyright (C), 2014-2017, 运策物流
 * FileName: Composite.java
 * Author:   yhx
 * Date:     2017年2月9日 上午11:18:25
 * Description: //模块目的、功能描述
 * History: //修改记录
 * <author>      <time>      <version>    <desc>
 * 修改人姓名             修改时间            版本号                  描述
 */
package com.designModes.component;

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
public class Composite  extends Component{

	List<Component> components=new ArrayList<Component>();

	public Composite(String name,String code,String post){
		super(name,code,post);
	}

	@Override
	public void add(Component com){
		com.setParent(this);
		components.add(com);
		System.out.println(com);
	}

	@Override
	public void iterator(){
		for(Component tmp:components){
			tmp.doSomething();
		}
	}

	@Override
	public void findChilden(Component parent) {

		for(Component tmp:components){
			if(tmp.getCode().equals(parent.getCode())){
				tmp.iterator();
			}
		}
	}
}
