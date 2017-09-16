package com.github.fengmaster.design.pattern.strategy;

/**
 * Created by Feng-master on 2017/9/16.
 * 使用物品实现类
 */
public class UseItem implements IUseHand{

    @Override
    public void useHand() {
        System.out.println("使用物品");
    }
}
