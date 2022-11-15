package com.danny.learningspring.aop;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

@Slf4j
@Aspect
public class TimeTraceAop {

    @Around("execution(* com.danny.learningspring..*(..)) && !target(com.danny.learningspring.SpringConfig)")
    public Object execute(ProceedingJoinPoint joinPoint) throws Throwable {
        long start = System.currentTimeMillis();
        log.error("MethodName===>{}", joinPoint.getSignature().getName());
        try {
            return joinPoint.proceed();
        } finally {
            long finish = System.currentTimeMillis();
            long timeMs = finish - start;
            log.error("END=====>{}", timeMs +"ms");
        }
    }
}
