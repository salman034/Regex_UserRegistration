package com.bl.userregistration;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class UserRegistration {
    public boolean firstName() {
        boolean matchesString = Pattern.matches("^[A-Z]{1}[a-zA-Z]{3,10}$", "Salman");
        return matchesString;
    }
}
