/*
 * Copyright (c) 2019 designModes
 * module: designModes
 * file       : MainClient.java
 * author  :bigmoon
 * date     :19-4-10 上午6:42
 */

package com.designModes.mediator;

/**
 * 中介模式 mediator模式
 *
 * 该设计模式更倾向于功能模块的结构整理：避免复杂的网状结构，更倾向于星型结构
 */
public class MainClient {

    public static void main(String[] args){

        Mediator mediator=new ConcorectMediator();
        ConcreteColleague1 concreteColleague1=new ConcreteColleague1(mediator);
        ConcreteColleague2 concreteColleague2=new ConcreteColleague2(mediator);
        concreteColleague1.dependMethod();
        concreteColleague2.dependMethod();
    }
}
