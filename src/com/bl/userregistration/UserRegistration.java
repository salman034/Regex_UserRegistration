package com.bl.userregistration;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class UserRegistration {
    public boolean passwordRule3() {
        boolean matchesString = Pattern.matches("^[A-Z{1}0-9{1}a-z]{8}$", "Sa9amash");
        return matchesString;
    }
}
