package com.justin.lambda;

public interface Call {
    void shout();
    //默认方法
    default void say()
    {
        System.out.println("default say call1");
    }

    //静态方法
    static void staticSay()
    {
        //调用默认方法
        System.out.println("static say2");
    }
}
