package com.bl.userregistration;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class UserRegistration {
    public static final String EMAIL_TESTS = "^[a-zA-Z0-9+_.-]+[@][a-zA-Z0-9]+[.a-z]{4}([.a-zA-Z,]{3})*$";

    public boolean emailTest(String email) {
        boolean matchesString = Pattern.matches(EMAIL_TESTS, email);
        return matchesString;
    }
}
