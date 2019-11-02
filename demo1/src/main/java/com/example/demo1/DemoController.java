package com.example.demo1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/demo")
public class DemoController {

    private final DemoService demoService;

    @Autowired
    public DemoController(final DemoService demoService) {
        this.demoService = demoService;
    }

    @GetMapping
    public List<Demo> findAll() {
        return this.demoService.getAll();
    }

}
