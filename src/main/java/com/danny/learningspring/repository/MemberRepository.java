package com.danny.learningspring.repository;

import com.danny.learningspring.domain.Member;

import java.util.List;
import java.util.Optional;

public interface MemberRepository {
    Member save(Member member);
    Optional<Member> findById(long id);
    Optional<Member> findName(String name);
    List<Member> findAll();
}
