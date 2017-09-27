package com.github.fengmaster.design.pattern.template;

/**
 * Created by Feng-master on 2017/9/27.
 *
 * 具体实现类1
 */
public class ConcreteTemplate1 extends AbsTemplate{
    @Override
    public int process1(int input) {
        return input*input;
    }

    @Override
    public int process2(int input) {
        return input+3;
    }

    @Override
    public int process3(int input) {
        return input/3;
    }
}
