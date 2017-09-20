package com.github.fengmaster.design.pattern.factory.absfactory.factory;

import com.github.fengmaster.design.pattern.factory.absfactory.fruit.TropicalFruit;
import com.github.fengmaster.design.pattern.factory.absfactory.itf.IAbsFactory;
import com.github.fengmaster.design.pattern.factory.absfactory.itf.IFruit;
import com.github.fengmaster.design.pattern.factory.absfactory.itf.IVegetable;
import com.github.fengmaster.design.pattern.factory.absfactory.vegetable.TropicalVegetable;

/**
 * Created by Feng-master on 2017/9/21.
 */
public class SouthernFactory implements IAbsFactory {
    @Override
    public IFruit createFruit() {
        return new TropicalFruit();
    }

    @Override
    public IVegetable createVegetable() {
        return new TropicalVegetable();
    }
}
