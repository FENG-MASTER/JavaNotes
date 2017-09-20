package com.github.fengmaster.design.pattern.factory.absfactory.vegetable;

import com.github.fengmaster.design.pattern.factory.absfactory.itf.IVegetable;

/**
 * Created by Feng-master on 2017/9/21.
 */
public class TropicalVegetable implements IVegetable {
    @Override
    public void getVegetableName() {
        System.out.println("热带蔬菜s");
    }
}
