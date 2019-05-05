/*
 * Copyright (c) 2019 designModes
 * module: designModes
 * file       : ConcreteColleague1.java
 * author  :bigmoon
 * date     :19-4-10 上午5:50
 */

package com.designModes.mediator;

public class ConcreteColleague1 extends Colleague {

    public ConcreteColleague1(Mediator mediator){
        super(mediator);
    }

    public void selfMethod(){
        System.out.println(this.getClass().toString());
    }

    public void dependMethod(){
        System.out.println("depend Method "+this.getClass().toString());
        super.mediator.doSomeThing2();
    }
}
