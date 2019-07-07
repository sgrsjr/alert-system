/*
  Created by rameshwar on 2019-07-07.
 */
package com.oyorooms.alertsystem.members;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MemberController {

    private final MemberService memberService;

    @Autowired
    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }

    @RequestMapping("/teams/{teamId}/members")
    public List<Member> getAllMembers(@PathVariable("teamId") Long id) {
        return memberService.getAllMembers(id);
    }

    @RequestMapping("/teams/{teamId}/members/{id}")
    public Member getMember(@PathVariable("id") Long id) {
        return memberService.getMember(id);
    }

    @RequestMapping(value = "/teams/{teamId}", method = RequestMethod.POST)
    public void addMember(Member member, @PathVariable String teamId) {
        member.setTeamId(Long.parseLong(teamId));
        memberService.addMember(member);
    }

    @RequestMapping(value = "/teams/{teamId}", method = RequestMethod.PUT)
    public void updateMember(Member member, @PathVariable String teamId) {
        member.setTeamId(Long.parseLong(teamId));
        memberService.updateMember(member);
    }


}
