package com.github.fengmaster.design.pattern.factory.factorymethod.factory;

import com.github.fengmaster.design.pattern.factory.factorymethod.product.Teacup;
import com.github.fengmaster.design.pattern.factory.factorymethod.product.TeacupExt;
import com.github.fengmaster.design.pattern.factory.factorymethod.itf.IFactory;
import com.github.fengmaster.design.pattern.factory.factorymethod.itf.IProduct;

/**
 * Created by Feng-master on 2017/9/19.
 */
public class CupFactory implements IFactory {
    @Override
    public IProduct produce(int index) {
        switch (index){
            case 0:
                return new Teacup();
            case 1:
                return new TeacupExt();
            default:
                return null;
        }
    }
}
