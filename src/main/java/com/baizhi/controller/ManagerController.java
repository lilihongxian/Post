package com.baizhi.controller;

import com.baizhi.entity.Manager;
import com.baizhi.service.ManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by admin on 2018/7/5.
 */
@Controller
@RequestMapping("/Manager")
public class ManagerController {

    @Autowired
    private ManagerService managerService;

    @RequestMapping("Login")
    public String Login(String username, String enCode, HttpServletRequest request){
        Object kaptcha_session_key = request.getSession().getAttribute("KAPTCHA_SESSION_KEY");
        String code = (String) kaptcha_session_key;
        if(!enCode.equals(code)){
            return "redirect:/login.jsp";
        }
        Manager manager = managerService.queryOneByUsername(username);

        if (manager==null){
            return "redirect:/login.jsp";
        }else {
            request.getSession().setAttribute("user",manager.getMagRealname());
            return "main/main";
        }

    }



}
