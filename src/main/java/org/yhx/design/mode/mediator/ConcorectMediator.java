/*
 * Copyright (C), 2017-2019 bigmoon
 * FileName: ConcorectMediator.java
 * Author:   bigmoon
 * Date:     19-5-6 上午9:32
 * Description: designModels
 */

package org.yhx.design.mode.mediator;

public class ConcorectMediator  extends  Mediator {


    public void doSomeThing1() {
        super.getConcreteColleague1().selfMethod();
        super.getConcreteColleague2().selfMethod();
    }

    public void doSomeThing2() {

    }
}
