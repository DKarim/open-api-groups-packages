package com.example.visible;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

@Controller("/visible")
public class VisibleController {

    @Get
    public VisibleResponse index() {
        return new VisibleResponse("This DTO should appear in schema");
    }
}
