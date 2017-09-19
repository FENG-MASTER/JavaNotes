package com.github.fengmaster.design.pattern.factory.factorymethod.factory;

import com.github.fengmaster.design.pattern.factory.factorymethod.product.Backpack;
import com.github.fengmaster.design.pattern.factory.factorymethod.product.BackpackExt;
import com.github.fengmaster.design.pattern.factory.factorymethod.itf.IFactory;
import com.github.fengmaster.design.pattern.factory.factorymethod.itf.IProduct;

/**
 * Created by Feng-master on 2017/9/19.
 */
public class BackpackFactory implements IFactory{


    @Override
    public IProduct produce(int index) {
        switch (index){
            case 0:
                return new Backpack();
            case 1:
                return new BackpackExt();
            default:
                return null;
        }

    }
}
