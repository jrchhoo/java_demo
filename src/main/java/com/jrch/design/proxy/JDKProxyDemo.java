package com.jrch.design.proxy;

import java.lang.reflect.InvocationHandler;
import lombok.extern.slf4j.Slf4j;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @program: bill-admin-server
 * @description: JDK动态代理模式实例
 * @author: Mr.Hou
 * @create: 2021-05-20 14:10
 **/
public class JDKProxyDemo {

    public static void main(String[] args) {
        SmsService1 smsService1 = (SmsService1) JDKProxyFactory.getProxy(new SmsServiceImpl1());
        smsService1.send("987654321");

    }
}

/**
 * 发送短信的接口
 */
interface SmsService1{
    String send(String message);
}

/**
 * 实现发送短信的接口
 */
@Slf4j
class SmsServiceImpl1 implements SmsService1{

    @Override
    public String send(String message) {
        log.info("send message: " + message);
        return message;
    }
}

/**
 * JDK动态代理类
 */
@Slf4j
class DebugInvocationHandler implements InvocationHandler {

    private final Object target;

    public DebugInvocationHandler(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws InvocationTargetException, IllegalAccessException {
        log.info("执行之前: " + method.getName());
        Object result = method.invoke(target, args);
        log.info("执行之后: " + method.getName());
        return result;
    }
}

class JDKProxyFactory{
    public static Object getProxy(Object target) {
        return Proxy.newProxyInstance(
                target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                new DebugInvocationHandler(target)
        );
    }
}


