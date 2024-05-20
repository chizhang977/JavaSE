package com.justin.Lambda;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.function.Function;
import java.util.function.Supplier;

public class LambdaSimpleDemo {
    @Test
    public void test1(){
        List<String> list = Arrays.asList("java","c","python","c++","VB","C#");
        //遍历Collection集合，并将传递给action参数的操作代码应用在每一个元素上。
        list.forEach(s -> System.out.println(s));
    }

    @Test
    public void testSupplier(){
        Supplier<String> supplier = () -> "justin";
        System.out.println(supplier.get());
    }

    @Test
    public void testPredicate(){
        ArrayList<String> list = new ArrayList<>();
        list.add("hello");
        list.add("java");
        list.add("atguigu");
        list.add("ok");
        list.add("yes");

        System.out.println("删除之前");
        list.forEach(s-> System.out.println(s));
        //删除集合中长度大于3的元素
        list.removeIf(s->s.length()>3);
        System.out.println("删除之后");
        list.forEach(s-> System.out.println(s));
    }

    @Test
    public void testFunction(){
        //使用Lambda实现Function<T,R>接口，可以实现将一个字符串首字母转为大写的功能
        Function<String,String> fun =
                s -> s.substring(0,1).toUpperCase()+s.substring(1);
        System.out.println(fun.apply("justin"));
    }
}
