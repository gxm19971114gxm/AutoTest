package com.aliyun.test.depend;

import org.testng.annotations.Test;

public class DependTest {
    @Test
    public void test(){
        System.out.println("test1");
        throw new RuntimeException();
    }
    @Test(dependsOnMethods = {"test"})
    public void test2(){

        System.out.println("test2");
    }
}
