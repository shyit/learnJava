package net.htwater.think.D14_9;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by 96955 on 2019/5/13.
 */
public class SimpleDynamicProxy implements InvocationHandler{

    private Object proxied;

    public SimpleDynamicProxy(Object proxied) {
        this.proxied = proxied;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        return null;
    }
}
