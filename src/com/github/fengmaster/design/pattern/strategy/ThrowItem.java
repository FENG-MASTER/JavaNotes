package com.github.fengmaster.design.pattern.strategy;

/**
 * Created by Feng-master on 2017/9/16.
 * 丢弃物品实现类
 */
public class ThrowItem implements IUseHand{

    @Override
    public void useHand() {
        System.out.println("丢弃了物品");
    }
}
