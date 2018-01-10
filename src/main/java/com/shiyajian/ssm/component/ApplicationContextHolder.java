package com.shiyajian.ssm.component;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component
public class ApplicationContextHolder implements ApplicationContextAware {

    private static ApplicationContext applicationContext;

    @Override
    public void setApplicationContext(ApplicationContext arg0) throws BeansException {
        applicationContext = arg0;
    }

    public static ApplicationContext getContext() {
        return applicationContext;
    }

    @SuppressWarnings("unchecked")
    public static <T> T getBean(String name) {

        if (applicationContext == null) {
            throw new IllegalStateException("applicationContext 对象没有注入,请检查！");
        }

        return (T) applicationContext.getBean(name);
    }

    public static <T> T getBean(Class<T> clazz) {

        if (applicationContext == null) {
            throw new IllegalStateException("applicationContext 对象没有注入,请检查！");
        }

        return (T) applicationContext.getBean(clazz);
    }
}
