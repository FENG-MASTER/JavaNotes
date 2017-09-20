package com.github.fengmaster.design.pattern.factory.absfactory.factory;

import com.github.fengmaster.design.pattern.factory.absfactory.fruit.NorthernFruit;
import com.github.fengmaster.design.pattern.factory.absfactory.itf.IAbsFactory;
import com.github.fengmaster.design.pattern.factory.absfactory.itf.IFruit;
import com.github.fengmaster.design.pattern.factory.absfactory.itf.IVegetable;
import com.github.fengmaster.design.pattern.factory.absfactory.vegetable.NorthernVegetable;

/**
 * Created by Feng-master on 2017/9/21.
 */
public class NorthernFactory implements IAbsFactory {
    @Override
    public IFruit createFruit() {
        return new NorthernFruit();
    }

    @Override
    public IVegetable createVegetable() {
        return new NorthernVegetable();
    }
}
