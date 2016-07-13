package com.litmus7.mongo.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import org.springframework.stereotype.Repository;

import com.litmus7.model.Member;


@Repository

public interface MemberRepository extends MongoRepository<Member, String>{

}