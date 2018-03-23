package com.seti.custom.validators;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import java.lang.annotation.ElementType;
import java.lang.annotation.RetentionPolicy;
import javax.validation.Constraint;
import javax.validation.Payload;

@Documented
@Constraint(validatedBy = GenericDateValidator.class)
@Target( { ElementType.METHOD, ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
public @interface Date {

	
	 String message() default "{Date  should be in mm/dd/yyyy following format }";
     
	    Class<?>[] groups() default {};
	     
	    Class<? extends Payload>[] payload() default {};
}
