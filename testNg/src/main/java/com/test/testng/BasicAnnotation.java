package com.test.testng;

import lombok.extern.slf4j.Slf4j;
import org.testng.annotations.*;

@Slf4j
public class BasicAnnotation {

    @Test
    public void testCase1(){
        System.out.println("测试用例1");
        //log.info("测试用例1");

    }


    @Test
    public void testCase2(){

    }
    @BeforeMethod
    public void beforeMethod(){
        System.out.print("beforMethod在方法之前执行");
    }

    @AfterMethod
    public void afterMethod(){
        System.out.println("afterMethod在方法之后执行");
    }

    @BeforeClass
    public void beforeClass(){
        System.out.println("beforeClass在类运行之前运行");
    }
    @AfterClass
    public void afterClass(){
        System.out.println("afterClass在类运行之后运行");
    }
    @BeforeSuite
    public void beforeSuite(){
        System.out.println("测试套件1");
    }
    @AfterSuite
    public void afterSuite(){
        System.out.println("测试套件2");
    }
}
