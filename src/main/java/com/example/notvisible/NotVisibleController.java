package com.example.notvisible;

import io.micronaut.http.annotation.Body;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Post;

/**
 * This endpoint is properly hidden in the generated documentation.
 */
@Controller("/not-visible")
public class NotVisibleController {

    @Get
    public NotVisibleResponse index() {
        return new NotVisibleResponse();
    }

    @Post
    public void index(@Body NotVisibleRequest request) {
        System.out.println("nothing here");
    }
}
