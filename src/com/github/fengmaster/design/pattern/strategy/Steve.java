package com.github.fengmaster.design.pattern.strategy;

/**
 * Created by Feng-master on 2017/9/16.
 * 史蒂夫
 *
 * 通过组合的方式,实现了一个函数不同行为的效果
 */
public class Steve {

    private IUseHand iUseHand;

    public void useHand(){
        if (iUseHand!=null){
            iUseHand.useHand();
        }
    }

    public void setUseHandBehavior(IUseHand iUseHand){
        this.iUseHand=iUseHand;
    }


    public static void main(String args[]){
        Steve steve=new Steve();
        steve.setUseHandBehavior(new UseItem());
        steve.useHand();
        steve.setUseHandBehavior(new ThrowItem());
        steve.useHand();
    }


}
