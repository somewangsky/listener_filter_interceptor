package com.zxelec.springboot_listener_filter_interceptor.exceptionhandler;

import com.zxelec.springboot_listener_filter_interceptor.exceptor.MyException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

@ControllerAdvice
public class LoginExceptionHandler {

    @ExceptionHandler(MyException.class)
    @ResponseBody
    public Object loginExceptionHandler(MyException e, HttpServletRequest request){
        Map<String,Object> mapExecption = new HashMap<>();

        mapExecption.put("code",e.getCode());
        mapExecption.put("msg",e.getMsg());
        mapExecption.put("data",e.getData());
        mapExecption.put("url",request.getRequestURL());

        return mapExecption;
    }

}
