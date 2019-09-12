/*
 * Copyright (C), 2017-2019 bigmoon
 * FileName: ConcreteCreator.java
 * Author:   bigmoon
 * Date:     19-5-6 上午9:32
 * Description: designModels
 */

package org.yhx.design.mode.factory;

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
