package com.danny.learningspring.repository;

import com.danny.learningspring.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface SpringDataJpaMemberRepository extends JpaRepository<Member, Long>, MemberRepository {

    // JPQL >> SELECT m FROM member m WHERE m.name = ?
    @Override
    Optional<Member> findByName(String name);

}
