package com.aliyun.test.ignore;

import org.testng.annotations.Test;

public class IgnoreTest {
    @Test
    public void testCase1(){
        System.out.println("testCase1");

    }
    @Test(enabled = false)
    public void testCase2(){
        System.out.println("testCase2");
    }
    @Test(enabled = true)
    public void testCase3(){
        System.out.println("testCase3");
    }
}
