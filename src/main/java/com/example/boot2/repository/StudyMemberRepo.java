package com.example.boot2.repository;

import com.example.boot2.entity.Study_member;
import com.example.boot2.entity.Study_record;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudyMemberRepo extends JpaRepository<Study_member, Integer> {

}
