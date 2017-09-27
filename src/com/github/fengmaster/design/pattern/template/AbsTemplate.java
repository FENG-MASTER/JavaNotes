package com.github.fengmaster.design.pattern.template;

/**
 * Created by Feng-master on 2017/9/27.
 * <p>
 * 抽象模版类,负责定义算法的结构{@link AbsTemplate#getResult(int)}
 * 而算法的每个部分的行为都交由子类具体实现
 */
public abstract class AbsTemplate {


    /**
     * 算法过程1
     * @param input 输入
     * @return 输出
     */
    public abstract int process1(int input);

    /**
     * 算法过程2
     * @param input 输入
     * @return 输出
     */
    public abstract int process2(int input);

    /**
     * 算法过程3
     * @param input 输入
     * @return 输出
     */
    public abstract int process3(int input);

    /**
     * 算法执行函数
     * @param input 输入
     * @return 输出
     */
    public final int getResult(int input) {
        int res = process1(input);
        res = process2(res);
        if (isPlusOne()) {
            res++;//也可以加入其他共有的部分
        }
        res %= 10;
        res = process3(res);
        return res;
    }

    /**
     * 钩子:负责决定是否需要加一
     * @return 标志位
     */
    public boolean isPlusOne() {
        return true;
    }


}
