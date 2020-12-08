package com.company.iLoveSpring;

import com.company.iLoveSpring.validation.CourseCode;

import javax.validation.constraints.*;


public class Customer {

    private String firstName;

    @NotNull (message = "is required")
    @Min(value = 0, message = "must be equal or greater than zero")
    @Max(value = 10, message = "must be less or equals 10")
    private Integer freePasses;

    @NotNull (message = "is required")
    @Size(min=3, message = "this field is required")
    private String lastName;


    @Pattern(regexp = "^[a-zA-Z0-9]{5}", message = "only 5 symbols")
    private String postalCode;

    @CourseCode (value = {"TOPS", "LUV"}, message = "must start with TOPS or LUV")
    private String courseCode;

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public Integer getFreePasses() {
        return freePasses;
    }

    public void setFreePasses(Integer freePasses) {
        this.freePasses = freePasses;
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
