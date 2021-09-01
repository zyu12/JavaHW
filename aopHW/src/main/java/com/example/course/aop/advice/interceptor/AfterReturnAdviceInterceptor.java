package com.example.course.aop.advice.interceptor;

import com.example.course.aop.MethodInvocation;
import com.example.course.aop.advice.Advice;

public class AfterReturnAdviceInterceptor implements MethodInterceptor {
    private Advice advice;
    public AfterReturnAdviceInterceptor(Advice advice)  {
        this.advice = advice;
    }
    @Override
    public Object invoke(MethodInvocation mi) throws Throwable {
        Object returnValue = mi.proceed();
        advice.execute(mi.getMethod(), mi.getArguments(), mi.getTarget());
        return returnValue;
    }
}
