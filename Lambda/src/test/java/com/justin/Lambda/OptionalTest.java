package com.justin.Lambda;

import com.justin.lambda.Employee;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class OptionalTest {

    @Test
    public void test01(){
        //创建Optional实例
        Optional<String> optional = Optional.of("hello world");
        Optional<Object> optinalEmpty = Optional.empty();
        Optional<Object> optinalNull = Optional.ofNullable(null);

        //判断是否存在
        System.out.println(optional.isPresent());
        //获取值
        System.out.println(optional.get());
        System.out.println(optinalEmpty.orElse("world"));
        System.out.println(optinalNull.orElse("world"));
        System.out.println(optinalEmpty.orElseGet(() -> "OrElseGet"));
        System.out.println(optinalNull.orElseGet(() -> "OrElseGet"));
        System.out.println("========");

        //转化和映射
        Optional<Integer> integer = optional.map(String::length);
        System.out.println(integer.get());

        //过滤
        Optional<String> filtered = optional.filter(s -> s.length() > 100);
        System.out.println(filtered.orElse("没有符合的值"));

        //扁平化
        Integer integer1 = optional.flatMap(s -> Optional.of(s.length())).get();
        System.out.println(integer1);
    }
    @Test
    public void testFilter(){
        Optional<String> longName = Optional.of("hello world");
        Optional<String> s1 = longName.filter(s -> s.length() > 100);
        System.out.println(s1.orElse("没有符合的值"));
    }
    @Test
    public void testFlatMap() {
        Optional<String> s1 = Optional.of(Arrays.asList("C#", "Java", "Python", "JavaScript"))
                .flatMap(list -> list.stream().filter(s -> s.length() > 3).findAny());
        System.out.println(s1.orElse("没有符合的值"));

    }
    @Test
    public void testMap() {
        Optional<Optional<String>> s1 = Optional.of(Arrays.asList("C#", "Java", "Python", "JavaScript"))
                .map(list -> list.stream().filter(s -> s.length() > 3).findAny());
        System.out.println(s1.orElse(Optional.empty()).orElse("没有符合的值"));

    }
    @Test
    public void test02(){

    }
}
