/*
 * Copyright (C), 2017-2019 bigmoon
 * FileName: MainClient.java
 * Author:   bigmoon
 * Date:     19-5-6 上午9:32
 * Description: designModels
 */

package org.yhx.design.mode.mediator;

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
