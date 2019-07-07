/*
  Created by rameshwar on 2019-07-06.
 */
package com.oyorooms.alertsystem.logs;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class LogService {

    private final LogRepository logRepository;

    public LogService(LogRepository logRepository) {
        this.logRepository = logRepository;
    }

    List<Log> getAllLogs() {
        ArrayList<Log> logs = new ArrayList<>();
        logRepository.findAll().forEach(logs::add);
        return logs;
    }

    Log getLog(Long id) {
        return logRepository.findById(id).get();
    }

    void addLog(Log log) {
        log.timestamp = System.currentTimeMillis();
        logRepository.save(log);
    }

    void updateLog(Log log) {
        log.timestamp = System.currentTimeMillis();
        logRepository.save(log);
    }

}
