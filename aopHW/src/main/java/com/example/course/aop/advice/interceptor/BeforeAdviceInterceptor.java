package com.example.course.aop.advice.interceptor;

import com.example.course.aop.advice.Advice;
import com.example.course.aop.MethodInvocation;

public class BeforeAdviceInterceptor implements MethodInterceptor {
    private Advice advice;

    public BeforeAdviceInterceptor(Advice advice) {
        this.advice = advice;
    }

    @Override
    public Object invoke(MethodInvocation mi) throws Throwable{
        advice.execute(mi.getMethod(), mi.getArguments(), mi.getTarget());
        return mi.proceed();
    }
}
