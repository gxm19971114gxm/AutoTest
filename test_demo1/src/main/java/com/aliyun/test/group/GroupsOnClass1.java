package com.aliyun.test.group;

import org.testng.annotations.Test;

@Test(groups = "stu")
public class GroupsOnClass1 {

    public void stu1(){
        System.out.println("groupsOnClass1中的stu1方法");
    }

    public void stu2(){
        System.out.println("groupsOnClass1中的stu2方法");
    }
}
