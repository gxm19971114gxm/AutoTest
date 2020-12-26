package com.aliyun.test.group;

import org.testng.annotations.*;

public class GroupOnMethod {
    @Test
    public void test(){
        System.out.println("test");
    }
    @Test(groups = "server")
    public void group1(){
        System.out.println("group1");
    }
    @Test(groups = "server")
    public void group1_1(){
        System.out.println("group1_1");
    }
    @Test(groups = "client")
    public void group2(){
        System.out.println("group2");
    }
    @Test(groups = "client")
    public void group2_1(){
        System.out.println("group2_1");
    }
    @BeforeGroups("server")
    public void testBeforeGroups(){
        System.out.println("beforeGroups===============");
    }
    @AfterGroups("server")
    public void testAftergroups(){
        System.out.println("aftergroups===================");
    }
    @BeforeSuite
    public void testBeforeSuite(){
        System.out.println("beforeSuite");
    }
    @AfterSuite
    public void testAfterSuite(){
        System.out.println("afterSuite");
    }
    @BeforeGroups("client")
    public void testBeforeGroupsClient(){
        System.out.println("beforeGroups===============");
    }
    @AfterGroups("client")
    public void testAftergroupsClient(){
        System.out.println("aftergroups===================");
    }
}
