/*
 * Copyright (C), 2017-2019 bigmoon
 * FileName: TestClient.java
 * Author:   bigmoon
 * Date:     19-5-6 上午9:32
 * Description: designModels
 */
package org.yhx.design.mode.decorator;

import java.io.*;

/**
 * 〈一句话功能简述〉<br>
 * 〈功能详细描述〉
 *
 * @author bigmoon
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
public class TestClient {

	/**
	 * 功能描述: <br>
	 * 〈功能详细描述〉
	 *
	 * @param args
	 * @see [相关类/方法](可选)
	 * @since [产品/模块版本](可选)
	 */
	public static void main(String[] args) throws IOException {
		Person p=new Man();
		p=new BatMan(p);
		p=new SuperMan(p);
		p.wearClose();

//		File f = new File("c:/work/test.data");
//		FileOutputStream fos = new FileOutputStream(f);
//		BufferedOutputStream bw=new BufferedOutputStream(fos);
//		bw.write("a112222222222".getBytes());
//		bw.flush();
//		bw.close();

	}

}
