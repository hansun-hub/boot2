package com.example.boot2.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenerationTime;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "STUDY_MEMBER")
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Study_member {

    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    @Column(name="member_id")
    private int memberId;

    @Column(name="login_id")
    private String loginId;

    private String password;

    private String name;

    private String email;

    private String role;

    @org.hibernate.annotations.Generated(GenerationTime.ALWAYS)
    @Column(name="reg_day", updatable = false)
    private LocalDateTime reg_day;



}
