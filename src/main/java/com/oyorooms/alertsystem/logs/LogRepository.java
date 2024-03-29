package com.oyorooms.alertsystem.logs;/*
  Created by rameshwar on 2019-07-07.
 */

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface LogRepository extends JpaRepository<Log, Long> {
    List<Log> findByIsResolved(boolean isResolved);
}
