package com.sam.springbootWeb;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import static org.apache.coyote.http11.Constants.a;

@Controller
public class HomeController {
    @RequestMapping(value = "/")
    public String home(){
        return "index.jsp";
    }

//    @RequestMapping("/add")
//    public String add(HttpServletRequest req, HttpSession session){
//        int a = Integer.parseInt(req.getParameter("num1"));
//        int b = Integer.parseInt(req.getParameter("num2"));
//
//        session.setAttribute("result",a+b);
//
//        return "result.jsp";
//    }

//    @RequestMapping("/add")
//    //num1 and num2 are variable name from the url
//    public String add(int num1, int num2, HttpSession session){
//
//        session.setAttribute("result",num1 + num2);
//
//        return "result.jsp";
//    }


//    @RequestMapping("/add")
//    //num1 and num2 are variable name from the url
//    public String add(@RequestParam("num1") int a,@RequestParam("num2") int b, Model model){
//        model.addAttribute("result",a + b);
//
//        return "result.jsp";
//    }

//    @RequestMapping("/add")
//    public String add(@ModelAttribute Calculator calc, Model model){
//
//        model.addAttribute("result",calc.sum());
//
//        return "result.jsp";
//    }


    @RequestMapping("/add")

    //@ModelAttribute is optional
    public String add(Calculator calc, Model model){

        model.addAttribute("result",calc.sum());

        return "result.jsp";
    }
}
