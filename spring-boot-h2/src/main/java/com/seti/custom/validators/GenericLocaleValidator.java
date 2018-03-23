

package com.seti.custom.validators;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.springframework.util.StringUtils;

public class GenericLocaleValidator implements ConstraintValidator<Locale, String> {
//	private static  String locale = 
//	        "[A-Za-z]{2}";
//	
	@Override
	public void initialize(Locale constraintAnnotation) {
	}

	@Override
	public boolean isValid(String value, ConstraintValidatorContext ctx) {
		if(StringUtils.isEmpty(value)) {
			return true;
		}
//		value.matches(locale) ||
		else if(value.equalsIgnoreCase("US") || value.equalsIgnoreCase("CA") || value.equalsIgnoreCase("BR") ){
			return true;
		}else {
			return false;
		}
			}

}