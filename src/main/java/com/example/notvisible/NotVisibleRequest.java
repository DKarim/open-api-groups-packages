package com.example.notvisible;

import io.micronaut.core.annotation.Introspected;

@Introspected
public class NotVisibleRequest {
    private NotVisibleRequestPartKO part;

    public NotVisibleRequestPartKO getPart() {
        return part;
    }
}
