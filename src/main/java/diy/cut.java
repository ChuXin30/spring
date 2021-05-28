package hao.dao.diy;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class cut {

    @Before("execution(* hao.dao.demo1.UserServiceImpl.*(..))")
    public void before(){
        System.out.println("----------before-----------");
    }
}
