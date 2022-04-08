package com.bl.userregistration;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class UserRegistration {
    public boolean password() {
        boolean matchesString = Pattern.matches("^[a-z]{8}$","mkspasha");
        return matchesString;
    }
}
