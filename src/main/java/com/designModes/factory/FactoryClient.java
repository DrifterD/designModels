/*
 * Copyright (c) 2019 designModels
 * module: designModels
 * file       : FactoryClient.java
 * author  :bigmoon
 * date     :19-3-6 下午11:02
 */

package com.designModes.factory;

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
