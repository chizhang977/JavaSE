package com.justin.lambda;

import java.lang.reflect.Method;

public class MyClass {

    @MyAnnotation("justin")
    @MyAnnotation("justin2")
    public void myMethod(String name){
        System.out.println("myMethod invoked with name: " + name);
    }

    public static void main(String[] args) throws NoSuchMethodException {
        Method myMethod = MyClass.class.getMethod("myMethod", String.class);
        MyAnnotations annotation = myMethod.getAnnotation(MyAnnotations.class);
        for (MyAnnotation myAnnotation : annotation.value()) {
            System.out.println(myAnnotation.value());
        }
    }
}
