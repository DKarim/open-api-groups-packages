package com.example.hidden;

import io.micronaut.core.annotation.Introspected;

@Introspected
public class HiddenResponse {
    private HiddenEnum hiddenEnum;

    public HiddenEnum getHiddenEnum() {
        return hiddenEnum;
    }

    public void setHiddenEnum(HiddenEnum hiddenEnum) {
        this.hiddenEnum = hiddenEnum;
    }
}
