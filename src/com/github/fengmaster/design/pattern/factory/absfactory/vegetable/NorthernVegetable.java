package com.github.fengmaster.design.pattern.factory.absfactory.vegetable;

import com.github.fengmaster.design.pattern.factory.absfactory.itf.IVegetable;

/**
 * Created by Feng-master on 2017/9/21.
 */
public class NorthernVegetable implements IVegetable {
    @Override
    public void getVegetableName() {
        System.out.println("北方蔬菜");
    }
}
