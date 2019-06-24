/*
 * Copyright (C), 2017-2019 bigmoon
 * FileName: Adapter.java
 * Author:   bigmoon
 * Date:     19-5-6 上午9:32
 * Description: designModels
 */
package org.yhx.design.mode.adapter;

/**
 * 〈一句话功能简述〉<br>
 * 〈功能详细描述〉
 *
 * @author yanghanxiu
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
public class Adapter extends Adaptee1 implements ITarget{

	public void sayPutonghua() {

		System.out.println("东北人说普通话");
		super.dongbeiqiang();
	}


}
