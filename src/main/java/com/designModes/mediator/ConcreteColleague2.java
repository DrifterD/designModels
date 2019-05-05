/*
 * Copyright (c) 2019 designModes
 * module: designModes
 * file       : ConcreteColleague2.java
 * author  :bigmoon
 * date     :19-4-10 上午5:51
 */

package com.designModes.mediator;

public class ConcreteColleague2 extends  Colleague {
    public ConcreteColleague2(Mediator mediator){
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
