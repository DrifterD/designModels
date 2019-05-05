/*
 * Copyright (c) 2019 designModes
 * module: designModes
 * file       : ConcorectMediator.java
 * author  :bigmoon
 * date     :19-4-10 上午5:43
 */

package com.designModes.mediator;

public class ConcorectMediator  extends  Mediator {


    public void doSomeThing1() {
        super.getConcreteColleague1().selfMethod();
        super.getConcreteColleague2().selfMethod();
    }

    public void doSomeThing2() {

    }
}
