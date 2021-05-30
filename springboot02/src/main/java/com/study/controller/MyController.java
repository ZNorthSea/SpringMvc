package com.study.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * @Auther: zhaotj
 * @Date: 2021/5/29 0029 - 05 - 29 - 23:38
 * @Description: com.study.controller
 * @version: 1.0
 */
@Controller
public class MyController {
    @RequestMapping("regist")
    public String login(String username, HttpServletRequest request){
        if (null !=username && !"".equals(username)){
            request.getSession().setAttribute("username",username);
            return "main";
        }
        return "redirect:/login.html";
    }
    @RequestMapping("loginPage")
    public String login2(){

        return "main";
    }
}
