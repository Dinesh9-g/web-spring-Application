package com.dinesh.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
@Controller
public class StartApplication {

    public static void main(String[] args) {
        SpringApplication.run(StartApplication.class, args);
    }

    @GetMapping("/")
    public String home() {
        return "forward:/index.html";
    }

    @GetMapping("/docker")
    public String docker() {
        return "forward:/index.html#docker";
    }

    @GetMapping("/kubernetes")
    public String kubernetes() {
        return "forward:/index.html#kubernetes";
    }

    @GetMapping("/terraform")
    public String terraform() {
        return "forward:/index.html#terraform";
    }
}