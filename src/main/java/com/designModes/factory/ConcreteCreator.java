/*
 * Copyright (c) 2019 designModels
 * module: designModels
 * file       : ConcreteCreator.java
 * author  :bigmoon
 * date     :19-3-6 下午10:48
 */

package com.designModes.factory;

import com.sun.org.apache.bcel.internal.generic.RETURN;

public class ConcreteCreator extends Creator {
//    @Override
    public <T extends Product> T createProduct(String productCLass) {
        T product = null;
        try {
            product=(T)Class.forName(productCLass).newInstance();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return product;
    }
}
