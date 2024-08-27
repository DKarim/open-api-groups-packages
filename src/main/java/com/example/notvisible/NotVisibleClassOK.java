package com.example.notvisible;

import io.micronaut.core.annotation.Introspected;

/**
 * This class does not appear in the schema because it's not a property of NotVisibleResponse
 */
@Introspected
public class NotVisibleClassOK {
    private String test;

    public String getTest() {
        return test;
    }

    public void setTest(String test) {
        this.test = test;
    }
}
