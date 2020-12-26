package com.aliyun.test.exception;

import org.testng.annotations.Test;

public class ExpectedException {
    @Test(expectedExceptions = RuntimeException.class)
    public void test(){
        System.out.println("这是一个运行时异常的demo");
    }
    @Test(expectedExceptions = RuntimeException.class)
    public void testSuccess(){
        System.out.println("这是一个运行成功的demo");
        throw new RuntimeException();
    }
}
