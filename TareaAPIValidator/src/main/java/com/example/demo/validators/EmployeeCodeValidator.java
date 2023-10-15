package com.example.demo.validators;

import java.util.regex.Pattern;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;



public class EmployeeCodeValidator implements ConstraintValidator<ValidEmployeeCode, String>{

		private static final Pattern CODE_PATTERN = Pattern.compile("^EMP-([a-zA-Z]{3})-\\d{4}$");

		public void initialize(ValidEmployeeCode constraintAnnotation) {
		}

		public boolean isValid(String code, ConstraintValidatorContext context) {
			if (code == null) {
				return false;
			}
			return CODE_PATTERN.matcher(code).matches();
		}
	
}
