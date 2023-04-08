package com.example.sampleproject.entity;

import com.sun.istack.NotNull;
import lombok.Builder;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Email;


@Entity
@NoArgsConstructor
public class Member {
    @Id
    @GeneratedValue
    private Long id;
    @Column(nullable = false, length = 4)
    private String name;
    @Column(nullable = false, length = 6)
    private String nikName;

    @Builder
    public Member(String name, String nikName) {
        this.name = name;
        this.nikName = nikName;
    }
}
