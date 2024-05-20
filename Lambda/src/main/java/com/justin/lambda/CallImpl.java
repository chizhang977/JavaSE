package com.justin.lambda;

public class CallImpl implements Call, Call2{
    @Override
    public void shout() {
        System.out.println("shout");
    }

    @Override
    public void say() {
        Call2.super.say();
    }


    public static void main(String[] args) {
        CallImpl call = new CallImpl();

        call.shout();
        Call.staticSay();
    }
}
