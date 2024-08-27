package com.example.hidden;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.swagger.v3.oas.annotations.Hidden;

@Hidden
@Controller("/hidden")
public class HiddenController {

    @Get
    public HiddenResponse index() {
        return new HiddenResponse();
    }
}
