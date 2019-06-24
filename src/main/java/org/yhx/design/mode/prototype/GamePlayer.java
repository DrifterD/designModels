/*
 * Copyright (C), 2017-2019 bigmoon
 * FileName: GamePlayer.java
 * Author:   bigmoon
 * Date:     19-5-6 上午9:32
 * Description: designModels
 */
package org.yhx.design.mode.prototype;

import java.util.Date;

/**
 * 〈一句话功能简述〉<br>
 * 〈功能详细描述〉
 *
 * @author yanghanxiu
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
public class GamePlayer implements IGamePlay {

	public void login(String name, String password) {
		System.out.print(name+" has login:"+new Date());
	}

	public void kissBoss() {
		System.out.print("kiss boss");

	}

	public void upgrade() {
		System.out.print("upgrade");
	}
}
