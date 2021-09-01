package com.example.course.aop.advice.interceptor;

import com.example.course.aop.MethodInvocation;
import com.example.course.aop.advice.Advice;

public class AfterThrowAdviceInterceptor implements MethodInterceptor{
    private Advice advice;
    public AfterThrowAdviceInterceptor(Advice advice){
        this.advice = advice;
    }
    @Override
    public Object invoke(MethodInvocation mi) throws Throwable {
        try{
            return mi.proceed();
        }catch (Throwable t1){
            advice.execute(mi.getMethod(), mi.getArguments(), mi.getTarget());
            throw t1;
        }

    }
}
