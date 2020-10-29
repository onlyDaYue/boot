package com.Shelf.demo.Util;

import com.Shelf.demo.Controller.UserController;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Arrays;

/**
 * Auther:ezRiel
 * Time:2020/10/29
 * for:增 删 改 后置一条日志
 */
@Aspect
@Component
public class LogAop {
    private static Logger log = LoggerFactory.getLogger(UserController.class);
   /**
    * auther:ezRiel
    * date:2020/10/29
    * param:[]
    * return:void
    * 切dao层方法
    */
    @Pointcut("execution(* deletePlanOutData(String, ..))")
//    @Pointcut("execution(* testDelete())")
    public void point(){
    }
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
       log.info(currentUser.getPrincipal()+"in"+localDate+" "+localTime+"delete one data");
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
        log.info(currentUser.getPrincipal()+"prepare to"+localDate+" "+localTime+"delete one data");
    }

}
