package com.github.inthedrink.render.poc.resource.rest.controller;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Component
@RestController
public class SampleRestController {
    @GetMapping(path="/poc", produces = "application/json")
    public String simpleGetEndpoint() {
        return "{\"message\":\"Hello, World\"}";
    }
}
