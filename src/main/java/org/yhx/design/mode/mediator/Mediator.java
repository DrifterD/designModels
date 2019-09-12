/*
 * Copyright (C), 2017-2019 bigmoon
 * FileName: Mediator.java
 * Author:   bigmoon
 * Date:     19-5-6 上午9:32
 * Description: designModels
 */

package org.yhx.design.mode.mediator;

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
