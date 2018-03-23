package com.seti.custom.validators;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.springframework.util.StringUtils;

public class GenericDateValidator implements ConstraintValidator<Date, String> {
	private static  String date = 
	        "[0-9]{2}/[0-9]{2}/[0-9]{4}";
	
	@Override
	public void initialize(Date constraintAnnotation) {
	}

	@Override
	public boolean isValid(String value, ConstraintValidatorContext ctx) {
		if(StringUtils.isEmpty(value)) {
			return true;
		}
		else if(value.matches(date)){
			return true;
		}else {
			return false;
		}
			}

}