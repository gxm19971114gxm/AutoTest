package com.aliyun.test.param;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.lang.reflect.Method;


public class DataProviderTest {
//    @Test(dataProvider = "data")
//    @Parameters({"name","age"})
//    public void testCase1(String name,String age){
//        System.out.println("name: "+name+";age: "+age);
//    }
//    @DataProvider(name = "data")
//    public Object[][] providerData(){
//        Object[][] data=new Object[][]{
//                {"张三","10"},
//                {"里斯","23"},
//                {"情怀如","33"}
//        };
//        return data;
//    }
    @Test(dataProvider = "value")
    public void testCase2(String name,int age){
        System.out.println("testCase2===name: "+name+";age "+age);
    }
    @Test(dataProvider = "value")
    public void testCase3(String name,int age){
        System.out.println("testCase3===name: "+name+";age "+age);
    }
    @DataProvider(name="value")
    public Object[][] method(Method method){
        Object[][] data=null;
       if(method.getName().equals("testCase2")){
           data=new Object[][]{
                   {"zhangsan",70}   ,
                   {"lisi",22}
           };
       }else if(method.getName().equals("testCase3")){
           data=new Object[][]{
                   {"张三",70}   ,
                   {"里斯",22}
           };
       }
        return data;
    }

}
