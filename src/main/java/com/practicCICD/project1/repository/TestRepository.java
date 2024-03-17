package com.practicCICD.project1.repository;

import com.practicCICD.project1.Entity.TestEntity;
import com.practicCICD.project1.dto.TestDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface TestRepository extends CrudRepository<TestEntity, Integer> {
}
