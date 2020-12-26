package com.aliyun.test.param;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterTest {
    @Test
    @Parameters({"name","age"})
    public void testCase1(String name,int age){
        System.out.println("name: "+name+"       age: "+age);
    }
}
