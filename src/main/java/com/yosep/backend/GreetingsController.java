package com.yosep.backend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingsController {
    @Autowired
    private Environment env;

    @GetMapping("/hello")
    public String hello() {
        return env.getProperty("vcap.application.instance_id");
    }
}
