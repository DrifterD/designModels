/*
 * Copyright (C), 2017-2019 bigmoon
 * FileName: Creator.java
 * Author:   bigmoon
 * Date:     19-5-6 上午9:32
 * Description: designModels
 */

package org.yhx.design.mode.factory;

public abstract  class Creator {

    public abstract <T extends Product> T createProduct(String productCLass);

}
