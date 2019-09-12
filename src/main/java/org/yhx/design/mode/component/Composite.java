/*
 * Copyright (C), 2017-2019 bigmoon
 * FileName: Composite.java
 * Author:   bigmoon
 * Date:     19-5-6 上午9:32
 * Description: designModels
 */
package org.yhx.design.mode.component;

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
