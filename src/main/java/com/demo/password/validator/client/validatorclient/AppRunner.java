/**
 * 
 */
package com.demo.password.validator.client.validatorclient;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.demo.password.validator.passwordvalidator.rules.ValidationResult;
import com.demo.password.validator.passwordvalidator.service.PasswordValidationService;

/**
 * CommandLineRunner class for invoking password validation service. Its run
 * method will be called automatically by the spring boot application class
 * after the initial boot
 * 
 * @author dushyant sahu
 * @version 0.1
 * @since Dec, 2017
 *
 */
@Component
public class AppRunner implements CommandLineRunner {

	/** logger object for logging error/info messages */
	private static final Logger logger = LoggerFactory.getLogger(AppRunner.class);

	/** success message */
	private static final String SUCCESS_MESSAGE = "CommandLineRunner completed with {}";

	/** Password Validation Service object */
	@Autowired
	private PasswordValidationService passwordValidationService;

	@Override
	public void run(String... args) throws Exception {
		for (String arg : args) {
			ValidationResult validationResult = passwordValidationService.validate(arg);
			logger.info(SUCCESS_MESSAGE, validationResult);
		}
	}

}