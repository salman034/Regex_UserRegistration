package com.bl.userregistration;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class UserRegistration {
    public boolean phoneNumber() {
        boolean matchesString = Pattern.matches("^[0-9]{2}[ ][789]{1}[0-9]{9}$","91 9845715264");
        return matchesString;
    }
}
