/*
 * Copyright (C), 2017-2019 bigmoon
 * FileName: ConcreteProduct.java
 * Author:   bigmoon
 * Date:     19-5-6 上午9:32
 * Description: designModels
 */

package org.yhx.design.mode.factory;

public class ConcreteProduct extends Product {

    @Override
    public void showInfo() {
        System.out.println("product:"+this.getClass());
    }
}
