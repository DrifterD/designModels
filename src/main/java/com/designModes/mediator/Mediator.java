/*
 * Copyright (c) 2019 designModes
 * module: designModes
 * file       : Mediator.java
 * author  :bigmoon
 * date     :19-4-10 上午5:39
 */

package com.designModes.mediator;

public abstract class Mediator {

    private ConcreteColleague2 concreteColleague2;
    private ConcreteColleague1 concreteColleague1;

    public ConcreteColleague2 getConcreteColleague2() {
        return concreteColleague2;
    }

    public ConcreteColleague1 getConcreteColleague1() {
        return concreteColleague1;
    }

    public void setConcreteColleague2(ConcreteColleague2 concreteColleague2) {
        this.concreteColleague2 = concreteColleague2;
    }

    public void setConcreteColleague1(ConcreteColleague1 concreteColleague1) {
        this.concreteColleague1 = concreteColleague1;
    }

    public abstract void doSomeThing1();
    public abstract void doSomeThing2();
}
