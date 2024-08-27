package com.example.notvisible;

import io.micronaut.core.annotation.Introspected;

import java.time.Instant;
import java.time.ZoneId;

@Introspected
public class NotVisibleResponse {

    private String test;
    private NotVisibleEnumKO notVisibleEnumKO;
    private NotVisibleClassKO notVisibleClassKO;
    private ZoneId notVisibleZoneIdKO;
    private Instant notVisibleInstantOK;

    public String getTest() {
        return test;
    }

    public void setTest(String test) {
        this.test = test;
    }

    public NotVisibleEnumKO getNotVisibleEnumKO() {
        return notVisibleEnumKO;
    }

    public void setNotVisibleEnumKO(NotVisibleEnumKO notVisibleEnumKO) {
        this.notVisibleEnumKO = notVisibleEnumKO;
    }

    public NotVisibleClassKO getNotVisibleClassKO() {
        return notVisibleClassKO;
    }

    public void setNotVisibleClassKO(NotVisibleClassKO notVisibleClassKO) {
        this.notVisibleClassKO = notVisibleClassKO;
    }

    /**
     * If this getter is uncommented, the ZoneId and related classes will be visible in the schema
     */
//    public ZoneId getNotVisibleZoneIdKO() {
//        return notVisibleZoneIdKO;
//    }

    /**
     * If this getter is uncommented, nothing about Instant will be visible in the schema
     */
    public Instant getNotVisibleInstantOK() {
        return notVisibleInstantOK;
    }
}
