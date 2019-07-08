/*
  Created by rameshwar on 2019-07-08.
 */
package com.oyorooms.alertsystem.repo;

import com.oyorooms.alertsystem.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MemberRepository extends JpaRepository<Member, Long> {
    List<Member> findByTeamId(Long teamId);
}
