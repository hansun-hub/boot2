package com.example.boot2.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Data
@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Study_record {

    @Id
    private int key_id;
    private String STUDY_DAY;
    private String CONTENTS;
    private LocalDateTime reg_day;
}
