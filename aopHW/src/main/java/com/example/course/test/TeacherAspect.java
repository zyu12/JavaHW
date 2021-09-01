package com.example.course.test;

import com.example.course.aop.annotation.After;
import com.example.course.aop.annotation.Before;
import com.example.course.aop.annotation.AfterReturn;
import com.example.course.aop.annotation.AfterThrow;

public class TeacherAspect {
    @Before("TeacherServiceImpl")
    public void invoke() {
        System.out.println("aspect method: before");
    }

    @AfterThrow("TeacherServiceImpl")
    public void invoke2(){
        System.out.println("aspect method: method threw exception");
    }

    @AfterReturn("TeacherServiceImpl")
    public void invoke1(){
        System.out.println("aspect method: successfully returned");
    }

    @After("TeacherServiceImpl")
    public void invoke3(){
        System.out.println("aspect method: after");
    }



}



