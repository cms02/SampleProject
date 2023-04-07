package com.example.sampleproject.controller;

import com.example.sampleproject.dto.request.MemberSaveReqDto;
import com.example.sampleproject.dto.response.CommonResDto;
import com.example.sampleproject.service.MemberService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequiredArgsConstructor
@Slf4j
public class MemberController {

    private final MemberService memberService;

    @PostMapping("/api/member")
    public ResponseEntity<?> saveMember(@RequestBody @Valid MemberSaveReqDto memberSaveReqDto/*, BindingResult bindingResult*/) {
//        if (bindingResult.hasErrors()) {
//            Map<String, String> errorMap = new HashMap<>();
//            for (FieldError fe : bindingResult.getFieldErrors()) {
//                errorMap.put(fe.getField(), fe.getDefaultMessage());
//            }
//            System.out.println(errorMap);
//            return new ResponseEntity<>(CommonResDto.builder().msg(errorMap.toString()).build(),HttpStatus.BAD_REQUEST);
//            throw new RuntimeException(errorMap.toString());
//
//        }

        memberService.saveMember(memberSaveReqDto);
        return new ResponseEntity<>(CommonResDto.builder().msg("등록 성공").build(),HttpStatus.CREATED);
    }


}
