package com.company.iLoveSpring;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.Map;

@Controller
@RequestMapping ("/student")
public class StudentController {

    @Value("#{countryOptions}")
    private Map<String, String> countryOptions;

    @RequestMapping("/showForm")
    public String showForm (Model theModel) {

        //create student object
        Student theStudent = new Student();
        //add student object to the model
        theModel.addAttribute("student", theStudent);
        theModel.addAttribute("theCountryOptions", countryOptions);
        return "student/student_form";
    }
    @RequestMapping("/processForm")
    public String processForm (@ModelAttribute("student") Student student) {
        return "student/student_confirmation_form";
    }
}
