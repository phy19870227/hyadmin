package com.github.phy19870227.hyadmin.tests;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;

public class PasswordTests {

    @Test
    public void testPassword() {
        PasswordEncoder passwordEncoder = PasswordEncoderFactories.createDelegatingPasswordEncoder();
        String encodedPassword = passwordEncoder.encode("123456");
        System.out.println(encodedPassword);
        Assert.assertTrue(passwordEncoder.matches("123456", encodedPassword));
    }

}
