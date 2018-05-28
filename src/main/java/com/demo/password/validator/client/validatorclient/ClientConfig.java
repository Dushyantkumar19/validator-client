/**
 * 
 */
package com.demo.password.validator.client.validatorclient;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * client configuration class for PasswordValidationService client
 * 
 * @author dushyant sahu
 * @version 0.1
 * @since Dec, 2017
 *
 */
@Configuration
@ComponentScan(basePackages = { "com.demo.password.validator.passwordvalidator" })
public class ClientConfig {

}