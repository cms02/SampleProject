package com.example.sampleproject.dto.request;

import com.example.sampleproject.entity.Member;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Data
public class MemberSaveReqDto {
    @Size(max = 4, message = "4 글자 이내의 이름을 입력하세요")
    @NotBlank
    private String name;
    @Size(max = 6, message = "6 글자 이내의 별명을 입력하세요")
    @NotBlank
    private String nikName;

    public Member toEntity() {
        return Member.builder()
                .name(name)
                .nikName(nikName)
                .build();
    }
}
