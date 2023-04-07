package com.example.sampleproject.service;

import com.example.sampleproject.dto.request.MemberSaveReqDto;
import com.example.sampleproject.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@RequiredArgsConstructor
public class MemberService {
    private final MemberRepository memberRepository;

    @Transactional
    public void saveMember(MemberSaveReqDto memberSaveReqDto) {
        memberRepository.save(memberSaveReqDto.toEntity());
    }
}
