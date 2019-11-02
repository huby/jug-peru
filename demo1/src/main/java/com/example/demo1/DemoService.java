package com.example.demo1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DemoService {

    private final DemoRepository demoRepository;

    @Autowired
    public DemoService(final DemoRepository demoRepository) {
        this.demoRepository = demoRepository;
    }

    public List<Demo> getAll() {
        return this.demoRepository.findAll();
    }

}
