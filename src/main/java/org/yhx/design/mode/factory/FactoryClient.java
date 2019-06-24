/*
 * Copyright (C), 2017-2019 bigmoon
 * FileName: FactoryClient.java
 * Author:   bigmoon
 * Date:     19-5-6 上午9:32
 * Description: designModels
 */

package org.yhx.design.mode.factory;

/**
 * 工厂方法模式：
 * 优点：代码扩展性比较强，利于扩展
 * 对于客户端隐蔽具体类的实现过程，降低客户端和具体实现类的高耦合
 *
 * 适用场景：
 * 1.为了降低系统模块的耦合度
 */
public class FactoryClient {

    public static void main(String[] args){
        Creator concreteCreator=new ConcreteCreator();
        Product concreteProduct=concreteCreator.createProduct("com.designModes.factory.ConcreteProduct");
        concreteProduct.showInfo();
    }
}
