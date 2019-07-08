/*
  Created by rameshwar on 2019-07-07.
 */
package com.oyorooms.alertsystem.service;

import com.oyorooms.alertsystem.entity.Member;
import com.oyorooms.alertsystem.repo.MemberRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MemberService {

    private final MemberRepository memberRepository;

    public MemberService(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    public List<Member> getAllTeamMembers(Long teamId) {
        return memberRepository.findByTeamId(teamId);
    }

    public List<Member> getAllMembers() {
        return memberRepository.findAll();
    }

    public Member getMember(Long id) {
        return memberRepository.findById(id).get();
    }

    public void addMember(Member member) {
        memberRepository.save(member);
    }

    public void updateMember(Member member) {
        memberRepository.save(member);
    }
}