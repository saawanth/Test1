package com.seti.custom.validators;


import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import java.lang.annotation.ElementType;
import java.lang.annotation.RetentionPolicy;
import javax.validation.Constraint;
import javax.validation.Payload;

@Documented
@Constraint(validatedBy = GenericLocaleValidator.class)
@Target( { ElementType.METHOD, ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
public @interface Locale {

	
	 String message() default "{Locale should be Either US, CA or BR) }";
     
	    Class<?>[] groups() default {};
	     
	    Class<? extends Payload>[] payload() default {};
}