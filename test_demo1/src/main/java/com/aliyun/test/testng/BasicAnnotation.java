package com.aliyun.test.testng;

import org.testng.annotations.*;

public class BasicAnnotation {
    @Test
    public void testCase1(){
        System.out.println("测试用例1"+ System.out.printf("Thread Id : %s%n",Thread.currentThread().getId()));
    }
    @BeforeTest
    public void testBeforeDemo(){
        System.out.println("beforeTest");
    }
    @AfterTest
    public void testAfterTest(){
        System.out.println("afterTest");
    }
    @Test
    public void testCase2(){
        System.out.println("测试用例2"+ System.out.printf("Thread Id : %s%n",Thread.currentThread().getId()));
    }
    //包裹每一个方法
    @BeforeMethod
    public void testBeforeMethod(){
        System.out.println("beforeMethod");
    }
    @AfterMethod
    public void testAfterMethod(){
        System.out.println("AfterMethod");
    }
    @BeforeClass
    public void testBeforeClass(){
        System.out.println("beforeClass");
    }
    @AfterClass
    public void testAfterClass(){
        System.out.println("testAfterClass");
    }
    @BeforeSuite
    public void testBefoerSuite(){
        System.out.println("beforeSuite");
    }
    @AfterSuite
    public void testAfterSuite(){
        System.out.println("afterSuite");
    }




}
