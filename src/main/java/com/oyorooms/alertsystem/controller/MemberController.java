/*
  Created by rameshwar on 2019-07-07.
 */
package com.oyorooms.alertsystem.controller;

import com.oyorooms.alertsystem.entity.Member;
import com.oyorooms.alertsystem.entity.Team;
import com.oyorooms.alertsystem.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MemberController {

    private final MemberService memberService;

    @Autowired
    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }

    @GetMapping("/teams/members")
    public List<Member> getAllMembers() {
        return memberService.getAllMembers();
    }

    @GetMapping("/teams/{teamId}/members")
    public List<Member> getAllTeamMembers(@PathVariable("teamId") Long id) {
        return memberService.getAllTeamMembers(id);
    }

    @GetMapping("/teams/{teamId}/members/{id}")
    public Member getMember(@PathVariable("id") Long id) {
        return memberService.getMember(id);
    }

    @PostMapping(value = "/teams/{teamId}")
    public void addMember(Member member, @PathVariable String teamId) {
        Team team = new Team();
        team.setId(Long.parseLong(teamId));
        member.setTeam(team);
        memberService.addMember(member);
    }

    @PutMapping(value = "/teams/{teamId}")
    public void updateMember(Member member, @PathVariable String teamId) {
        Team team = new Team();
        team.setId(Long.parseLong(teamId));
        member.setTeam(team);
        memberService.updateMember(member);
    }


}
