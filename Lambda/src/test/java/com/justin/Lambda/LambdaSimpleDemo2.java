package com.justin.Lambda;

import com.justin.lambda.Call;
import org.junit.jupiter.api.Test;

public class LambdaSimpleDemo2 {

    public static void callSomething(Call call){
        call.shout();
    }

    @Test
    public void TestLambda(){
        callSomething(()-> System.out.println("Hello World"));
        callSomething(()-> System.out.println("Java"));
        callSomething(()-> System.out.println("JDBC"));
        callSomething(()-> System.out.println("Spring"));
        callSomething(()-> System.out.println("SpringMVC"));
    }
}
