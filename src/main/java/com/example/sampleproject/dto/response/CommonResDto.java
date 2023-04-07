package com.example.sampleproject.dto.response;

import lombok.Builder;
import lombok.Data;

@Data
public class CommonResDto<T> {
    private String msg;
    private T body;

    @Builder
    public CommonResDto(String msg, T body) {
        this.msg = msg;
        this.body = body;
    }
}

