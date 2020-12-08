package com.company.iLoveSpring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SillyController {

    @RequestMapping("/helloForm")
    public String displayTheForm () {
        return "silly_form";
    }
}
