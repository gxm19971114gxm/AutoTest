package com.aliyun.test.suite;

import org.testng.annotations.*;

public class SuiteConfig {
    @BeforeSuite
    public void testBeforeSuite(){
        System.out.println("beforeSuite");
    }
    @AfterSuite
    public void testAfterSuite(){
        System.out.println("afterSuite");
    }
    @BeforeTest
    public void testBeforeTest(){
        System.out.println("beforeTest");
    }
    @AfterTest
    public void testAfterTest(){
        System.out.println("afterTest");
    }
    @BeforeClass
    public void testBeforeClass(){
        System.out.println("beforeClass");
    }
    @AfterClass
    public void testAfterClass(){
        System.out.println("afterClass");
    }
    @BeforeMethod
    public void testBeforeMethod(){
        System.out.println("beforeMethod");
    }
    @AfterMethod
    public void testAfterMethod(){
        System.out.println("afterMethod");
    }
    @BeforeGroups
    public void testBeforeGroups(){
        System.out.println("beforeGroups");
    }
    @AfterGroups
    public void testAfterGroups(){
        System.out.println("afterGroups");
    }
}
