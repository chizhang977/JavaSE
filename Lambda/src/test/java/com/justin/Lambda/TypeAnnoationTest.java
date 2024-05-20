package com.justin.Lambda;

import com.justin.lambda.Employee;
import lombok.NonNull;
import org.junit.jupiter.api.Test;

//测试类型注解
public class TypeAnnoationTest {
    @Test
    public void test1(){
        //@NonNull
        Employee employee = new @NonNull Employee();
        System.out.println(employee);
    }
}
