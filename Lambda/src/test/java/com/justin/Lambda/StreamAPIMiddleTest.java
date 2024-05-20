package com.justin.Lambda;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.stream.Stream;

public class StreamAPIMiddleTest {

    /**
     * - default Stream<E> stream() : 返回一个顺序流
     *
     * - default Stream<E> parallelStream() : 返回一个并行流
     */
    @Test
    public void testStream(){
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6);
        list.stream().forEach(System.out::print);
        System.out.println("============");
        list.parallelStream().forEach(System.out::print);
    }

    @Test
    public void testArrays(){
        String[] arr = {"a", "b", "c", "d"};
        Arrays.stream(arr).forEach(System.out::print);
    }

    @Test
    public void testStream2(){
        Stream.of("a", "b", "c", "d").forEach(System.out::print);
        System.out.println("============");
        Stream.iterate(0, x -> x + 2).limit(10).forEach(System.out::println);
        System.out.println("============");
        Stream.generate(Math::random).limit(10).forEach(System.out::println);
        System.out.println("============");

    }

    @Test
    public void StreamMiddleOperate(){
        Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5, 6);
        stream.filter(num-> num % 2 == 0).forEach(System.out::print);

    }
    @Test
    public void StreamMiddleOperate1(){
        Stream.of(1, 2, 3, 4, 5, 6,6,7,8,9,10,1,2,3,4,5,6,7,8,9,10)
                .distinct().forEach(System.out::print);
    }
    @Test
    public void StreamMiddleOperate2(){
        Stream.of(1,2,2,3,3,4,4,5,2,3,4,5,6,7)
                .distinct()
                .filter(num-> num % 2 == 0)
                .limit(3)
                .forEach(System.out::print);
    }

    @Test
    public void StreamMiddleOperate3(){
        Stream.of(1,2,3,4,5,6,2,2,3,3,4,4,5)
                .skip(5)
                .distinct()
                .filter(t-> t % 3 == 0)
                .forEach(System.out::print);
    }

    @Test
    public void StreamMiddleOperate4(){
        long count = Stream.of(1, 2, 3, 4, 5, 6, 2, 2, 3, 3, 4, 4, 5)
                .distinct()
                .peek(System.out::println).count();
        System.out.println(count);
    }
    @Test
    public void StreamMiddleOperate5(){
        Stream.of(11,2,39,4,54,6,2,22,3,3,4,54,54)
                .distinct()
                .sorted((o1,o2)->Integer.compare(o2,o1))
                .limit(3)
                .forEach(System.out::println);
    }
    @Test
    public void StreamMiddleOperate6(){
        Stream.of(1,2,3,4,5)
                .map(t -> t+=1)//Function<T,R>接口抽象方法 R apply(T t)
                .forEach(System.out::println);

    }
    @Test
    public void StreamMiddleOperate7(){
        Stream.of("hello","world","java","world","hello","world")
                .map(t->t.toUpperCase()).forEach(System.out::println);
    }

    @Test
    public void StreamMiddleOperate8(){
        String[] arr = {"hello","world","java"};
        Arrays.stream(arr)
                .flatMap(t -> Stream.of(t.split("|")))//Function<T,R>接口抽象方法 R apply(T t)  现在的R是一个Stream
                .forEach(System.out::println);
    }

}
