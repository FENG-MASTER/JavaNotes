package com.github.fengmaster.design.pattern.factory.factorymethod.product;

import com.github.fengmaster.design.pattern.factory.factorymethod.itf.IProduct;

/**
 * Created by Feng-master on 2017/9/19.
 */
public class Teacup implements IProduct {
    @Override
    public void getName() {
        System.out.println("茶杯");
    }
}
