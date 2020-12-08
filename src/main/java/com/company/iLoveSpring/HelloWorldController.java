package com.company.iLoveSpring;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import  javax.servlet.http.*;

@Controller
@RequestMapping("/hello")
public class HelloWorldController {

    //Create view
    @RequestMapping("/showForm")
    public String sayHello() {
        return "hello/hello_world_form";
    }

    //process form from our view
    @RequestMapping("/processForm")
    public String processHelloPage() {
        return "hello/hello_world";
    }

    //new controller method to read form data and add data to the model
    @RequestMapping("/processFormVersion2")
    public String letsShoutDude(HttpServletRequest request, Model model) {

        //read request parameter from html form.
        String theName = request.getParameter("studentName");
        //convert data to upper case
        theName = theName.toUpperCase();
        //create a message
        String result = "Yo! " + theName;
        //add message to the model
        model.addAttribute("message", result);

        return "hello/hello_world";
    }

    @RequestMapping("/processFormVersion3")
    public String processFormVersionThree(@RequestParam("studentName") String theName, Model model) {

        //read request parameter from html form.
        //String theName = request.getParameter("studentName");
        //convert data to upper case
        theName = theName.toUpperCase();
        //create a message
        String result = "Hey my friend from v3! " + theName;
        //add message to the model
        model.addAttribute("message", result);

        return "hello/hello_world";
    }
}
