package com.nice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class DockerController {

    @GetMapping("/")
    public String index() {
        return "Hello Nice";
    }

}
