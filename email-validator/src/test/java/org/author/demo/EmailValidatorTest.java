package org.author.demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class EmailValidatorTest {

    @Test
    public void testIsValidEmail_ValidEmail_ReturnsTrue() {
        EmailValidator emailValidator = new EmailValidator();
        boolean result = emailValidator.isValidEmail("test@example.com");
        Assertions.assertTrue(result);
    }

    @Test
    public void testIsValidEmail_ValidEmail_Returnsfalse() {
        EmailValidator emailValidator = new EmailValidator();
        boolean result = emailValidator.isValidEmail(null);
        Assertions.assertFalse(result);
    }

    @Test
    public void testGetDomain_ValidEmail_ReturnsDomain() {
        EmailValidator emailValidator = new EmailValidator();
        String result = emailValidator.getDomain("test@example.com");
        Assertions.assertEquals("example.com", result);
    }

    @Test
    public void testGetUsername_ValidEmail_ReturnsUsername() {
        EmailValidator emailValidator = new EmailValidator();
        String result = emailValidator.getUsername("test@example.com");
        Assertions.assertEquals("test", result);
    }
    
}