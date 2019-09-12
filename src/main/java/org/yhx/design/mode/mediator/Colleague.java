/*
 * Copyright (C), 2017-2019 bigmoon
 * FileName: Colleague.java
 * Author:   bigmoon
 * Date:     19-5-6 上午9:32
 * Description: designModels
 */

package org.yhx.design.mode.mediator;

public abstract class Colleague {

    protected Mediator mediator;

    public Colleague(Mediator mediator){
        this.mediator=mediator;
    }


}
