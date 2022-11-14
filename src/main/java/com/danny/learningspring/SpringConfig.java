package com.danny.learningspring;

import com.danny.learningspring.aop.TimeTraceAop;
import com.danny.learningspring.repository.*;
import com.danny.learningspring.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.persistence.EntityManager;
import javax.sql.DataSource;

@Configuration
@RequiredArgsConstructor
public class SpringConfig {

    private final MemberRepository memberRepository;
//    private final EntityManager em;
//    private final DataSource dataSource;

//    @Autowired
//    public SpringConfig(DataSource dataSource) {
//        this.dataSource = dataSource;
//    }

    @Bean
    public MemberService memberService(){
        return new MemberService(memberRepository);
    }

    @Bean
    public TimeTraceAop timeTraceAop() { return new TimeTraceAop();}


//    @Bean
//    public MemberRepository memberRepository() {
//        return new JpaMemberRepository(em);
//        return new JdbcTemplateMemberRepository(dataSource);
//        return new JdbcMemberRepository(dataSource);
//        return new MemoryMemberRepository();
//    }
}
