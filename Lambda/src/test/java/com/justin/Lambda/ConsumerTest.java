package com.justin.Lambda;

import com.justin.lambda.Employee;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Stream;

public class ConsumerTest {
    @Test
    public void test1(){
        List<String> list = Arrays.asList("hello","java","lambda","atguigu");
        list.forEach(s -> System.out.println(s));
    }
    @Test
    public void test2(){
        HashMap<Integer,String> map = new HashMap<>();
        map.put(1, "hello");
        map.put(2, "java");
        map.put(3, "lambda");
        map.put(4, "atguigu");
        map.forEach((k,v) -> System.out.println(k+"->"+v));
    }

    @Test
    public void test3(){
        Stream.generate(() -> Math.random())
                .forEach(num -> System.out.println(num));
    }

    @Test
    public void test4(){
        HashMap<Integer, Employee> map = new HashMap<>();
        Employee e1 = new Employee(1, "张三", 8000);
        Employee e2 = new Employee(2, "李四", 9000);
        Employee e3 = new Employee(3, "王五", 10000);
        Employee e4 = new Employee(4, "赵六", 11000);
        Employee e5 = new Employee(5, "钱七", 12000);

        map.put(e1.getId(), e1);
        map.put(e2.getId(), e2);
        map.put(e3.getId(), e3);
        map.put(e4.getId(), e4);
        map.put(e5.getId(), e5);

        map.forEach((k,v)-> System.out.println(k+"->"+v));
        System.out.println();

        map.replaceAll((k,v)->{
            if (v.getSalary() < 10000){
                v.setSalary(10000);
            }
            return v;
        });
        map.forEach((k,v)-> System.out.println(k+"->"+v));
    }

    @Test
    public void test5(){
        ArrayList<String> list = new ArrayList<>();
        list.add("hello");
        list.add("java");
        list.add("atguigu");
        list.add("ok");
        list.add("yes");

        list.forEach(s-> System.out.println(s));
        System.out.println();
        list.removeIf(s->s.length() < 5);
        list.forEach(s-> System.out.println(s));
    }
}
