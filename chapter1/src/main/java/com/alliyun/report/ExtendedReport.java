package com.alliyun.report;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ExtendedReport {
    @Test
    public void testCase1(){
        Assert.assertEquals(1,1);
    }
    @Test
    public void testCase2(){
        Assert.assertEquals(1,2);
    }
    @Test
    public void testCase3(){
        Assert.assertEquals(new String(),new String());
    }
    @Test
    public void testCase4(){
        Assert.assertEquals("a","a");
    }
    @Test
    public void testCase5(){
        Assert.assertEquals("a","b");
    }
    @Test
    public void testCase6(){
        Reporter.log("这是我们自己抛出的运行时异常");
        throw new RuntimeException("这是我们自己抛出的运行时异常");
    }
    @Test
    public void testCase7(){
        Assert.assertEquals("",null);
    }
    @Test
    public void testCase8(){
        Assert.assertEquals("","");
    }
    @Test
    public void testCase9(){
        Assert.assertEquals("a",96);
    }
    @Test
    public void testCaseA(){
        Assert.assertEquals(Math.class,Math.class);
    }
    @Test
    public void testCaseB(){
        Assert.assertEquals(Math.class,String.class);
    }
    @Test
    public void testCaseC(String name){
        Reporter.log("这是我们自己抛出的空指针异常");
        System.out.println(name);
    }
    @Test
    public void testCaseD(){
        Reporter.log("这是我们自己抛出的空指针异常");
        throw new NullPointerException("这是我们自己抛出的空指针异常");
    }
    @Test
    public void testCaseE(){
        Reporter.log("比较两个组");
        String arr1="abcdefg";
        String arr2="abxdesf";
        Assert.assertEquals(arr1,arr2);
        throw new NullPointerException();
    }
    @Test
    public void testCaseF(){
        Reporter.log("比较两个组");
        int arr1=132794;
        int arr2=132094;
        Assert.assertEquals(arr1,arr2);
        throw new NullPointerException();
    }
}
