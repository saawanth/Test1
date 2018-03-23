package com.seti.custom.validators;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.springframework.util.StringUtils;

public class GenericEmailValidator implements ConstraintValidator<Email, String> {
	private static  String email = 
	        "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
	        + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
	
	@Override
	public void initialize(Email constraintAnnotation) {
	}

	@Override
	public boolean isValid(String value, ConstraintValidatorContext ctx) {
		if(StringUtils.isEmpty(value)) {
			return true;
		}
		else if(value.matches(email) && value.contains("climate.com")){
			return true;
		}else {
			return false;
		}
			}

}