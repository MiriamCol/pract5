package com.demo.pract5.controller;

import org.apache.coyote.Response;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class demoController {
    @GetMapping("/api/demo")

    public @ResponseBody ResponseEntity<List<String>> getDatos()
    {
        List<String> datos = List.of(
                "Dato 1",
                "Dato 2",
                "Dato 3",
                "Dato mil"
        );

        return ResponseEntity.ok().body(datos);
    }
}
