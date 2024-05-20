package com.justin.lambda;

import java.lang.annotation.*;

//定义可重复的注解
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@Repeatable(MyAnnotations.class)
public @interface MyAnnotation {
    String value();
}
