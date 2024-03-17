package com.practicCICD.project1.service;

import com.practicCICD.project1.Entity.TestEntity;
import com.practicCICD.project1.dto.TestDTO;
import com.practicCICD.project1.repository.TestRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TestService {
    private final TestRepository testRepository;

    public TestEntity save(TestDTO testDTO) {
        return testRepository.save(TestEntity.toTestEntity(testDTO));
    }

    public Iterable<TestEntity> findAll() {
        return testRepository.findAll();
    }

    public void deleteById(int id) {
        testRepository.deleteById(id);
    }
}
