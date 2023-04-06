package com.example.sampleproject.dto;

import com.example.sampleproject.entity.Member;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Data
public class MemberDto {
    @Size(min = 2, max = 4, message = "2~4 글자의 이름을 입력하세요")
    @NotBlank
    private String name;
    private Long age;

    public Member toEntity() {
        return Member.builder()
                .name(name)
                .age(age)
                .build();
    }
}
