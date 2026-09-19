package com.example.dockertestapplication.controller;

import com.example.dockertestapplication.service.StringService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
public class StringController {

    private final StringService stringService;

    @GetMapping("/")
    public String hello() {
        return "Hello please check github: https://github.com/dausei/webAss1";
    }

    @GetMapping("/random")
    public String getRandomString(@RequestHeader("length") int length) {
        return stringService.getRandomString(length);
    }

}
