package com.uniovi.validators;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.uniovi.entities.Mark;
import com.uniovi.services.MarksService;

@Component
public class MarkValidator implements Validator {
	@Autowired
	private MarksService marksService;

	@Override
	public boolean supports(Class<?> clazz) {
		return Mark.class.equals(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		Mark mark = (Mark) target;
		if (mark.getDescription().length() < 20) {
			errors.rejectValue("description", "Error.add.description.length");
		}
		if(mark.getScore() < 0 || mark.getScore() > 10) {
			errors.rejectValue("score", "Error.add.mark");
		}
	}

}
