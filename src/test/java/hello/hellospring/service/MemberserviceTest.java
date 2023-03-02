package hello.hellospring.service;

import hello.hellospring.domain.Member;
import hello.hellospring.repository.MemoryMemberRepository;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

class MemberServiceTest {

    MemberService memberService;
    MemoryMemberRepository memberRepository;

    @Test
    void 회원가입() {

        //given
        Member member1 = new Member();
        member1.setName("hello");

        //when


        //then

    }

    @Test
    void findMembers() {
    }

    @Test
    void findOne() {
    }
}