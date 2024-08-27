package com.example.notvisible;

import io.micronaut.core.annotation.Introspected;

/**
 * This class should not appear in the schema, but it does because it's a property of NotVisibleResponse
 */
@Introspected
public class NotVisibleClassKO {
    private String test;

    public String getTest() {
        return test;
    }

    public void setTest(String test) {
        this.test = test;
    }
}
