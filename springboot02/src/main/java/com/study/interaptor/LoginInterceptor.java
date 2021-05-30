package com.study.interaptor;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @Auther: zhaotj
 * @Date: 2021/5/29 0029 - 05 - 29 - 23:59
 * @Description: com.study.interaptor
 * @version: 1.0
 */
@Component
public class LoginInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        Object username = request.getSession().getAttribute("username");
        if (null != username){
            return true;
        }
        response.sendRedirect("login.html");
        return false;
    }
}
