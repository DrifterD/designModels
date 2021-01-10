/*
 * Copyright (C), 2017-2019 bigmoon
 * FileName: Singleton.java
 * Author:   bigmoon
 * Date:     19-5-6 上午9:32
 * Description: designModels
 */

package org.yhx.design.mode.Singleton;

import java.util.Random;

/**
 *
 * 饿汉模式:一开始就加在。类初始化时，jvm会获取一个锁， 这个锁可以同步多个线程对同一个类的初始化
 * 线程安全
 * 适用场景：
 * 在一个系统中创建多个实例会造成错误影响；
 * 在一个系统中创建或者销毁一个对象消耗比较多的资源
 * 注意事项：
 * 单例模式的构造函数必须是private修饰符
 *
 *
 */
public class Singleton01 {

    private final static Singleton01 SINGLETON = new Singleton01();

    //通过静态块实现，效果一样
//    private final static Singleton01 SINGLETON;
//    static{
//        SINGLETON=new Singleton01();
//    }

    //私有构造，避免外界创建对象
    private Singleton01() {

    }

    public static Singleton01 getSingleton() {
        return SINGLETON;
    }

    public void doSomething() {
        Random radom = new Random(4);
        System.out.println("random=" + radom.nextInt());
    }
}
