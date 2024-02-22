package com.luv2code.springboot.thymeleafdemo.validation;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Constraint(validatedBy = CourseCodeConstraintValidator.class)
@Target({ElementType.FIELD, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface CourseCode {

    //define default course code
    public String value() default "LUV";

    //define default error message
    public String message() default "must start with 'LUV'";

    //define default groups
    public Class<?> [] groups() default {};

    //define default payloads
    public Class<? extends Payload>[] payload() default {};



}
