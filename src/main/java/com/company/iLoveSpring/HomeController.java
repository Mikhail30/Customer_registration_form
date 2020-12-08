package com.company.iLoveSpring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping ("/")
    public String showMyPage () {
        return "main_page";
    }
}
