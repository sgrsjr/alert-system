/*
  Created by rameshwar on 2019-07-07.
 */
package com.oyorooms.alertsystem.repo;

import com.oyorooms.alertsystem.entity.Team;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeamRepository extends JpaRepository<Team, Long> {
}
