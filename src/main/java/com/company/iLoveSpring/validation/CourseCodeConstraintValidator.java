package com.company.iLoveSpring.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CourseCodeConstraintValidator implements ConstraintValidator <CourseCode, String> {

    private String[] coursePrefixes;;

    @Override
    public void initialize(CourseCode theCourseCode) {
        coursePrefixes = theCourseCode.value();

    }

    @Override
    public boolean isValid(String theCode, ConstraintValidatorContext constraintValidatorContext) {
        boolean result = false;
        if (theCode != null) {
             for (String stringPref: coursePrefixes) {
                 result = theCode.startsWith(stringPref);
                 if (result = true) {
                     break;
                 }
             }
        } else {
            result = true;
        }
        return result;
    }
       
}
