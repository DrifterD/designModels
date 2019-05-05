/*
 * Copyright (c) 2019 designModes
 * module: designModes
 * file       : Colleague.java
 * author  :bigmoon
 * date     :19-4-10 上午5:40
 */

package com.designModes.mediator;

public abstract class Colleague {

    protected Mediator mediator;

    public Colleague(Mediator mediator){
        this.mediator=mediator;
    }


}
