package com.example.sampleproject.dto.request;

import com.example.sampleproject.entity.Member;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Data
public class MemberSaveReqDto {
    @Size(min = 2, max = 4, message = "2~4 글자의 이름을 입력하세요")
    @NotBlank
    private String name;
    @Size(min = 1, max = 6, message = "1~6 글자의 이름을 입력하세요")
    @NotBlank
    private String nikName;
    private Long age;

    public Member toEntity() {
        return Member.builder()
                .name(name)
                .age(age)
                .nikName(nikName)
                .build();
    }
}
