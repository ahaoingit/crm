package com.brainyi.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * TODO
 *
 * @author ahao 2020-11-25
 */
@Aspect
@Component
public class JudgeNullAndBlank {
    @Pointcut("execution(* com.brainyi.service.*.*(..))")
    public void pointcut(){}

    @Before("pointcut()")
    public void Before(JoinPoint joinPoint) {
    }
}
