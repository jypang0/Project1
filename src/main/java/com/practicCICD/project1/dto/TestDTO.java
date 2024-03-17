package com.practicCICD.project1.dto;

import com.practicCICD.project1.Entity.TestEntity;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class TestDTO {
    private int id;
    private String name;

    public static TestDTO toTestDTO(TestEntity testEntity) {
        TestDTO testDTO = new TestDTO();
        testDTO.setId(testEntity.getId());
        testDTO.setName(testEntity.getName());

        return testDTO;
    }
}
