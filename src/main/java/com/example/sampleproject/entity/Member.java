package com.example.sampleproject.entity;

import com.sun.istack.NotNull;
import lombok.Builder;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity
@NoArgsConstructor
public class Member {
    @Id
    @GeneratedValue
    private Long id;
    @Column(nullable = false, length = 4)
    private String name;
    private Long age;

    @Builder
    public Member(String name, Long age) {
        this.name = name;
        this.age = age;
    }
}
