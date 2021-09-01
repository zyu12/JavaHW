package com.example.course.aop.advice.interceptor;

import com.example.course.aop.MethodInvocation;

public interface MethodInterceptor {
    Object invoke(MethodInvocation mi) throws Throwable;
}
