package com.example.course.aop.advice.interceptor;

import com.example.course.aop.advice.Advice;
import com.example.course.aop.MethodInvocation;

public class AfterAdviceInterceptor implements MethodInterceptor {
    private Advice advice;

    public AfterAdviceInterceptor(Advice advice) {
        this.advice = advice;
    }

    @Override
    public Object invoke(MethodInvocation mi) throws Throwable{
        Object returnValue = mi.proceed();
        advice.execute(mi.getMethod(), mi.getArguments(), mi.getTarget());
        return returnValue;
    }

}
