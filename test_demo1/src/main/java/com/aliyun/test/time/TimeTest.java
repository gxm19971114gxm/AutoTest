package com.aliyun.test.time;

import org.testng.annotations.Test;

public class TimeTest {
    @Test(timeOut = 5000)
    public void test() throws InterruptedException {
        Thread.sleep(2000);
        System.out.println("test");
    }
}
