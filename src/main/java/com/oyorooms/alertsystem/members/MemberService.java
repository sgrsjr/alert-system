/*
  Created by rameshwar on 2019-07-07.
 */
package com.oyorooms.alertsystem.members;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MemberService {

    private final MemberRepository memberRepository;

    public MemberService(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    List<Member> getAllMembers(Long teamId) {
        return memberRepository.findAll();
    }

    Member getMember(Long id) {
        return memberRepository.findById(id).get();
    }

    void addMember(Member member) {
        memberRepository.save(member);
    }

    void updateMember(Member member) {
        memberRepository.save(member);
    }
}