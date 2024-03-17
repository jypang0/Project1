package com.practicCICD.project1.controller;

import com.practicCICD.project1.Entity.TestEntity;
import com.practicCICD.project1.dto.TestDTO;
import com.practicCICD.project1.repository.TestRepository;
import com.practicCICD.project1.service.TestService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class Controller1 {
    @GetMapping("/hello")
    public String hello() {
        return "hello hi";
    }

    private final TestService testService;
    @Autowired
    public Controller1(TestService testService) {
        this.testService = testService;
    }

    @PostMapping("/addTest")
    public TestEntity put(@RequestParam int id, @RequestParam String name) {
        return testService.save(new TestDTO(id, name));
    }

    @GetMapping("/getTest")
    public Iterable<TestEntity> list() {
        return testService.findAll();
    }

    @DeleteMapping("/delete")
    public void delete(@RequestParam int id) {
        testService.deleteById(id);
    }
}
