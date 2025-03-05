package org.author.demo;

public class EmailValidator {
    private static final String EMAIL_ADDRESS_SIGN = "@";

    public boolean isValidEmail(String email) {
        return email != null && email.contains(EMAIL_ADDRESS_SIGN);
    }

    public String getDomain(String email) {
        String[] parts = email.split(EMAIL_ADDRESS_SIGN);
        return parts[1];
    }

    public String getUsername(String email) {
        String[] parts = email.split(EMAIL_ADDRESS_SIGN);
        return parts[0];
    }
}