package com.demo;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/v1/demo")
public class DemoController {

    @GetMapping
    public ResponseEntity<String> getDemo() {
        String response = "Hello World! -> v1.0";
        return ResponseEntity.ok(response);
    }

    @GetMapping("/hi")
    public ResponseEntity<String> getHi() {
        String response = "Hi -> v1.1...";
        return ResponseEntity.ok(response);
    }
}
