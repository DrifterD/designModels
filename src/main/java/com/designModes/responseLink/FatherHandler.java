/*
 * Copyright (C), 2014-2017, 运策物流
 * FileName: FatherHandler.java
 * Author:   yhx
 * Date:     2017年2月16日 上午8:46:50
 * Description: //模块目的、功能描述
 * History: //修改记录
 * <author>      <time>      <version>    <desc>
 * 修改人姓名             修改时间            版本号                  描述
 */
package com.designModes.responseLink;

/**
 * 〈一句话功能简述〉<br>
 * 〈功能详细描述〉
 *
 * @author yanghanxiu
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
public class FatherHandler extends Handler {

	public FatherHandler(){
		super(Handler.F_LEVEL);
	}

	@Override
	protected void handlerRequest(IRequest request) {
		System.out.println("处理到这里Father,。。。。。。。。。。");
		System.out.println("请求："+		request.request());
	}

}
