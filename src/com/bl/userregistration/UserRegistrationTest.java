package com.bl.userregistration;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class UserRegistrationTest {
    private Assertions Assert;

    @Test
    public void givenLastNameWhenShouldReturnTrue() {
        UserRegistration userRegistration = new UserRegistration();
        boolean userTest = userRegistration.lastName();
        System.out.println(userTest);
        Assert.assertTrue(userTest);
    }
}
