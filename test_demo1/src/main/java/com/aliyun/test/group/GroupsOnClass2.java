package com.aliyun.test.group;

import org.testng.annotations.Test;

@Test(groups = "stu")
public class GroupsOnClass2 {

    public void stu1(){
        System.out.println("groupsOnClass2中的stu1方法执行了");
    }

    public void stu2(){
        System.out.println("groupsOnClass2中的方法stu2执行了");
    }
}
