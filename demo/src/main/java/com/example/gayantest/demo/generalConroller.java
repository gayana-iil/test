package com.example.gayantest.demo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/booking")
@Slf4j
public class generalConroller {
    private final generalService generalService;

    public generalConroller(com.example.gayantest.demo.generalService generalService) {
        this.generalService = generalService;
    }

    @GetMapping("/{id}")
    public String getFile(@PathVariable String id){
        String name= generalService.getFiles(id);
        return name;
    }
}
