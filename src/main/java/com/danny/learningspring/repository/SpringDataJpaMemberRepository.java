package com.danny.learningspring.repository;

import com.danny.learningspring.domain.Member;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
public interface SpringDataJpaMemberRepository extends JpaRepository<Member, Long>, MemberRepository {
    // JpaRepository 구현체 생성, 빈 등록
    // JPQL >> SELECT m FROM member m WHERE m.name = ?
    @Override
    Optional<Member> findByName(String name);

}