/*
 * Copyright (C), 2017-2019 bigmoon
 * FileName: ConcreteColleague1.java
 * Author:   bigmoon
 * Date:     19-5-6 上午9:32
 * Description: designModels
 */

package org.yhx.design.mode.mediator;

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
