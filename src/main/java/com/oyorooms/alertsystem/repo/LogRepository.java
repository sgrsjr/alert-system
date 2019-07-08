package com.oyorooms.alertsystem.repo;/*
  Created by rameshwar on 2019-07-07.
 */

import com.oyorooms.alertsystem.entity.Log;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface LogRepository extends JpaRepository<Log, Long> {
    List<Log> findByIsResolved(boolean isResolved);
}
