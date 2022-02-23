package com.demo.controller;

import io.micronaut.http.HttpResponse;
import io.micronaut.http.HttpStatus;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class HomeController {

    @Get()
    public HttpResponse<?> getAllMessages() {
        return HttpResponse.status(HttpStatus.OK).body("Hello from app");
    }
}
