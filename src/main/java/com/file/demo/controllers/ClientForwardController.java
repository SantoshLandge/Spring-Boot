package com.file.demo.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class ClientForwardController {

    @GetMapping(value = "/**/{path:[^\\.]*}")
    public String forward() {
        return "forward:/";
    }

    // Handles all requests with any path variable
//    @GetMapping(value = "/**/{path:[^\\.]*}")
//    public ResponseEntity<String> handleAllRequests(@PathVariable String path) {
//        // Example of excluding file extensions manually in the controller method
//        if (path.contains(".")) {
//            return ResponseEntity.badRequest().body("Invalid request");
//        }
//        return ResponseEntity.ok("You have accessed: " + path);
//    }
}
