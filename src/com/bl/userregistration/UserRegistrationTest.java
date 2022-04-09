package com.bl.userregistration;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class UserRegistrationTest {
    private Assertions Assert;

    @Test
    public void givenPasswordWhenOneNumericShouldReturnTrue() {
        UserRegistration userRegistration = new UserRegistration();
        boolean userTest = userRegistration.passwordRule3();
        System.out.println(userTest);
        Assert.assertTrue(userTest);
    }
}
