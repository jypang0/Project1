package com.practicCICD.project1.Entity;

import com.practicCICD.project1.dto.TestDTO;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
@Table(name = "test")
public class TestEntity {

    @Id
    private int id;

    @Column(nullable = false)
    private String name;

    public static TestEntity toTestEntity(TestDTO testDTO) {
        TestEntity testEntity = new TestEntity();
        testEntity.setId(testDTO.getId());
        testEntity.setName(testDTO.getName());

        return testEntity;
    }
}
