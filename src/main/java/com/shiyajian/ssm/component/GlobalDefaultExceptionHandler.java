package com.shiyajian.ssm.component;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.alibaba.fastjson.JSON;
import com.shiyajian.ssm.common.ResponseData;
import com.shiyajian.ssm.exception.BizException;
import com.shiyajian.ssm.exception.NologinException;

@ControllerAdvice
public class GlobalDefaultExceptionHandler {

    /**
     * controller级别的全局拦截器，拦截所有异常
     * 判断异常类型，进行相应操作
     */
    @ExceptionHandler(value = Exception.class)
    public void handleServiceException(Exception ex,HttpServletRequest request, HttpServletResponse response) {
       
       /*
        * 异常主要分为三类
        * 第一类：没有授权，跳转到登录页面，一般有拦截器， 
        */
       if( ex instanceof NologinException){
           toLoginPage(response);
       }
       /*
        * 第二类：业务异常，返回一个实体
        */
       else if(ex instanceof BizException){
           errorResponse(response);
       }
       /*
        * 第三类：跳转到500错误页面
        */
       else{
           toErrorPage(response);
       }
    }
    
    private void toLoginPage(HttpServletResponse reponse){
        try {
            // TODO  记录日志
            reponse.sendRedirect("/");
        } catch (IOException e) {
            System.out.println("跳转异常");
        }
    }
    
    private void errorResponse(HttpServletResponse response){
        // TODO  记录日志
        ResponseData data = new ResponseData();
        response.setCharacterEncoding("UTF-8");
        response.setContentType("application/json; charset=utf-8");
        PrintWriter out = null;
        try {
            out = response.getWriter();
            out.write(JSON.toJSONString(data));
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (out != null) {
                out.close();
            }
        }
    }
    
    private void toErrorPage(HttpServletResponse response){
        try {
            // TODO 记录日志
            response.sendRedirect("/500");
        } catch (IOException e) {
            System.out.println("跳转异常");
        }
    }
}
