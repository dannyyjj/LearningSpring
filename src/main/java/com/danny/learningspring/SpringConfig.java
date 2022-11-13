//package com.danny.learningspring;
//
//import com.danny.learningspring.repository.MemberRepository;
//import com.danny.learningspring.repository.MemoryMemberRepository;
//import com.danny.learningspring.service.MemberService;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//@Configuration
//public class SpringConfig {
//
//    @Bean
//    public MemberService memberService(){
//        return new MemberService(memberRepository());
//    }
//
//    @Bean
//    public MemberRepository memberRepository() {
//        return new MemoryMemberRepository();
//    }
//}
