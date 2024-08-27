package com.example.hidden;

import io.micronaut.core.annotation.Introspected;

@Introspected
public class HiddenResponse {
    private HiddenEnumOK hiddenEnumOK;

    public HiddenEnumOK getHiddenEnum() {
        return hiddenEnumOK;
    }

    public void setHiddenEnum(HiddenEnumOK hiddenEnumOK) {
        this.hiddenEnumOK = hiddenEnumOK;
    }
}
