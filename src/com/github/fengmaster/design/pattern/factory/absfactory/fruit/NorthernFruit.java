package com.github.fengmaster.design.pattern.factory.absfactory.fruit;

import com.github.fengmaster.design.pattern.factory.absfactory.itf.IFruit;

/**
 * Created by Feng-master on 2017/9/21.
 */
public class NorthernFruit implements IFruit {
    @Override
    public void getFruitName() {
        System.out.println("北方水果");
    }
}
