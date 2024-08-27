package com.example.notvisible;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

@Controller("/not-visible")
public class NotVisibleController {


    @Get
    public NotVisibleDTO index() {
        return new NotVisibleDTO();
    }
}
