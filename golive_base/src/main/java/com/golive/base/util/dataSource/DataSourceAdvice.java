package com.golive.base.util.dataSource;

import org.apache.log4j.Logger;
import org.springframework.aop.AfterReturningAdvice;
import org.springframework.aop.MethodBeforeAdvice;
import org.springframework.aop.ThrowsAdvice;

import java.lang.reflect.Method;

public class DataSourceAdvice implements MethodBeforeAdvice, AfterReturningAdvice, ThrowsAdvice {

    Logger log = Logger.getLogger(DataSourceAdvice.class);
    //private long beginTime=0;


    /**
     * SERVICE方法调用结束后调用
     */
    public void afterReturning(Object arg, Method method, Object[] args,
                               Object target) throws Throwable {
        //log.info("结束业务处理[" + method.getName() + "];耗时:" + (System.currentTimeMillis()-beginTime)+"毫秒;全路径[" +target.getClass().getName()+ "]");
        //log.info("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
    }


    public void before(Method method, Object[] arg, Object target)
            throws Throwable {
        //log.error("开始业务处理["+method.getName()+"];全路径["+  target.getClass().getName()+"]");
        //beginTime=System.currentTimeMillis();
        //log.info("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        if (method.getName().startsWith("add") || method.getName().startsWith("create")
                || method.getName().startsWith("del") || method.getName().startsWith("edit") || method.getName().startsWith("delete")
                || method.getName().startsWith("insert") || method.getName().startsWith("save")
                || method.getName().startsWith("update") || method.getName().startsWith("modify")) {
            //log.info("数据源切换到:master");
            DataSourceSwitch.setMaster();
            //log.info("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++master");
        } else if (method.getName().startsWith("refresh") || method.getName().startsWith("init")) {
            //log.info("数据源切换到:slave");
            DataSourceSwitch.setSlave();
            //log.info("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++slave");
        } else if (method.getName().startsWith("analyse")) {
            //log.info("数据源切换到:analyse");
            DataSourceSwitch.setBehavior();
            //log.info("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++analyse");
        } else {
            //log.info("数据源切换到:slave");
            DataSourceSwitch.setSlave();
            //log.info("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++ else slave");
        }
    }

    /**
     * 抛出Exception异常调用
     */
    public void afterThrowing(Method method, Object[] args, Object target, Exception ex) throws Throwable {
        //log.error("数据源调用发生异常,数据源切换到:slave"+method.getName()+"];全路径["+  target.getClass().getName());
        DataSourceSwitch.setSlave();
        //log.error("数据源调用异常信息:"+ex.getMessage());
        //log.info("数据源调用异常信息:"+ex.getMessage());
        //log.info("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
    }
}
