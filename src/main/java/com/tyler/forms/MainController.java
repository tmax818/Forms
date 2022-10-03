package com.tyler.forms;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;

@Controller
public class MainController {

    @RequestMapping("/display")
    public String index(){
        return "index.jsp";
    }

    @RequestMapping("/handle")
    public String login(@RequestParam(value = "email") String email, @RequestParam(value = "password")String password, HttpSession session
    ){
        System.out.println(email);
        System.out.println(password);
        session.setAttribute("email", email);
        session.setAttribute("password", password);
        return "demo.jsp";
    }
}
