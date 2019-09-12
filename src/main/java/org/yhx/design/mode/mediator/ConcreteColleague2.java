/*
 * Copyright (C), 2017-2019 bigmoon
 * FileName: ConcreteColleague2.java
 * Author:   bigmoon
 * Date:     19-5-6 上午9:32
 * Description: designModels
 */

package org.yhx.design.mode.mediator;

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
