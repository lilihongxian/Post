package com.baizhi.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpSession;
import java.io.*;
import java.lang.reflect.Method;
import java.util.Date;

/**
 * Created by admin on 2018/7/11.
 */
@Configuration
@Aspect
public class AroundAspect {

    @Around(value = "@annotation(LogAnnotation)")
    public Object around(ProceedingJoinPoint proceedingJoinPoint) throws IOException {
        ServletRequestAttributes requestAttributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpSession session = requestAttributes.getRequest().getSession();
        String user = (String) session.getAttribute("user");

        Date date = new Date();

        String name = proceedingJoinPoint.getSignature().getName();

        MethodSignature signature = (MethodSignature) proceedingJoinPoint.getSignature();
        Method method = signature.getMethod();
        LogAnnotation annotation = method.getAnnotation(LogAnnotation.class);
        String s = annotation.name();
        Object proceed = null;
        boolean flag = false;
        try {
            proceed = proceedingJoinPoint.proceed();
            flag = true;
        }catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        //非桥转换
        try(OutputStream outputStream = new FileOutputStream(new File("G:\\Log\\log.txt"),true)){
            //语法糖 try-with-resources
            try (PrintWriter printWriter = new PrintWriter(outputStream)){
                printWriter.println("登陆用户:"+user);
                printWriter.println("日期:"+date);
                printWriter.println("方法名:"+name);
                printWriter.println("显式方法名："+s);
                printWriter.println("执行返回值："+proceed);
                printWriter.println("执行是否成功："+flag);
                printWriter.println();

            }
        }

        return proceed;
    }

}
