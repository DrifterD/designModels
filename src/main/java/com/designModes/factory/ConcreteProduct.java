/*
 * Copyright (c) 2019 designModels
 * module: designModels
 * file       : ConcreteProduct.java
 * author  :bigmoon
 * date     :19-3-6 下午10:47
 */

package com.designModes.factory;

import java.security.Principal;

public class ConcreteProduct extends Product {

    @Override
    public void showInfo() {
        System.out.println("product:"+this.getClass());
    }
}
