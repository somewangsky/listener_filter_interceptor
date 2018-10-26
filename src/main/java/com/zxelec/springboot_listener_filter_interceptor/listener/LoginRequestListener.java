package com.zxelec.springboot_listener_filter_interceptor.listener;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.annotation.WebListener;

@WebListener(value = "/api/v1/*")
public class LoginRequestListener implements ServletRequestListener {
    @Override
    public void requestDestroyed(ServletRequestEvent servletRequestEvent) {
        System.out.println("LoginRequestListener-------------->requestDestroyed");
    }

    @Override
    public void requestInitialized(ServletRequestEvent servletRequestEvent) {
        System.out.println("LoginRequestListener-------------->requestInitialized");
    }
}
