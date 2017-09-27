package com.github.fengmaster.design.pattern.template;

/**
 * Created by Feng-master on 2017/9/27.
 *
 * 具体实现类2
 *
 * 使用了模版方法中的钩子
 */
public class ConcreteTemplate2 extends AbsTemplate{
    @Override
    public int process1(int input) {
        return input;
    }

    @Override
    public int process2(int input) {
        return 5-input;
    }

    @Override
    public int process3(int input) {
        return input%9;
    }

    @Override
    public boolean isPlusOne() {
        return false;
    }
}
