package com.aliyun.test.group;

import org.testng.annotations.Test;

@Test(groups = "teacher")
public class GroupsOnClass3 {
    public void t1(){
        System.out.println("groupsOnClass3中的t1方法执行了");
    }
    public void t2(){
        System.out.println("groupsOnClass3中的方法t2执行了");
    }
}
