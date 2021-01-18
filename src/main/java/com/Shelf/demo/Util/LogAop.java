package com.Shelf.demo.Util;

import com.Shelf.demo.Controller.UserController;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Arrays;

/**
 * @description aop代码 目前只使用了前置和后置
 * @date 2021/1/15 16:41
 */
@Aspect
@Component
public class LogAop {
    private static Logger log = LoggerFactory.getLogger(UserController.class);

   /**
    * @description 两种切入切点的方法
    *               1.使用自定义注解
    *               2.组合形式
    * @date 2021/1/15 16:38
    */

   //1注解形式
//   @Pointcut("@annotation(com.Shelf.demo.Util.ShelfLog)")
//   public void point(){};

    @Pointcut("execution(* getPlanOutDa*(..))")
    private void aVoid(){
    }
    @Pointcut("execution(* deletePlanOutData*(..))")
    private void bVoid(){}

    //2组合形式
    @Pointcut("aVoid() || bVoid()")
    public void point(){
    }

//   @Pointcut("execution(* getPlanOutData*(..))")
//    private void point(){
//    }
    /**
     * @description  在连接点执行之后执行的通知（返回通知和异常通知的异常）
     */
    @AfterReturning("point()")
    public void doAfterGame(){
        //who
        Subject currentUser = SecurityUtils.getSubject();
        //time
        LocalDate localDate=LocalDate.now();
        LocalTime localTime=LocalTime.now();
       log.info(currentUser.getPrincipal()+"   in  "+localDate+" "+localTime+"  do after");
    }
    @Before("point()")
    public void dobefore(JoinPoint joinPoint){
        //who
        Subject currentUser = SecurityUtils.getSubject();
        //time
        LocalDate localDate=LocalDate.now();
        LocalTime localTime=LocalTime.now();
        log.info("响应方法：" + joinPoint.getSignature().getDeclaringTypeName() + "." + joinPoint.getSignature().getName());
        log.info("请求参数：" + Arrays.toString(joinPoint.getArgs()));
        log.info(currentUser.getPrincipal()+"    prepare to     "+localDate+" "+localTime+"  do before");
    }

}
