/*
 * Copyright (c) 2019 designModels
 * module: designModels
 * file       : Creator.java
 * author  :bigmoon
 * date     :19-3-6 下午10:48
 */

package com.designModes.factory;

public abstract  class Creator {

    public abstract <T extends Product> T createProduct(String productCLass);

}
