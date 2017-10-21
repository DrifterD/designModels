package com.designModes.Singleton;

import java.util.Random;

//饿汉模式:一开始就加在。类初始化时，jvm会获取一个锁， 这个锁可以同步多个线程对同一个类的初始化
public class Singleton {

	private final static Singleton SINGLETON=new Singleton();	
	
	//私有构造，避免外界创建对象
	private Singleton(){
		
	}
	
	public Singleton getSingleton(){
		return SINGLETON;
	}

	
	public void doSomething(){
		Random radom=new Random(4);
		System.out.println("random="+radom.nextInt());
	}
}
