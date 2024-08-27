package com.example.notvisible;

import io.micronaut.core.annotation.Introspected;

/**
 * This class should not appear in the schema, but it does because it's a property of NotVisibleResponse
 */
@Introspected
public class NotVisibleRequestPartKO {
    private String test;

    public String getTest() {
        return test;
    }
}
