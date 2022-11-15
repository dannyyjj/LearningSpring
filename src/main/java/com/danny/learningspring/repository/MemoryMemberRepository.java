package com.danny.learningspring.repository;

import com.danny.learningspring.domain.Member;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;

import java.util.*;

//@Repository
@Slf4j
public class MemoryMemberRepository implements MemberRepository{

    private static Map<Long, Member> store = new HashMap<>();  // 인터페이스 / 구현 클래스
    public static long sequence = 0L;

    @Override
    public Member save(Member member) {
        log.error("Repository===>MemoryMemberRepository//save");
        member.setId(++sequence);
        store.put(member.getId(), member);
        return member;
    }

    @Override
    public Optional<Member> findById(Long id) {
        return Optional.ofNullable(store.get(id)); // null값 허용
    }

    @Override
    public Optional<Member> findByName(String name) {
        return store.values().stream()
                .filter(member -> member.getName().equals(name))
                .findAny();
    }

    @Override
    public List<Member> findAll() {
        log.error("Repository===>MemoryMemberRepository//findAll");
        return new ArrayList<>(store.values());
    }

    public void clearStore(){
        store.clear();
    }

}
