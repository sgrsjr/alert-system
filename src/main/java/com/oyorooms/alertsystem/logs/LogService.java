/*
  Created by rameshwar on 2019-07-06.
 */
package com.oyorooms.alertsystem.logs;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LogService {

    private final LogRepository logRepository;

    public LogService(LogRepository logRepository) {
        this.logRepository = logRepository;
    }

    List<Log> getAllLogs() {
        return logRepository.findAll();
    }

    List<Log> getUnresolvedLogs() {
        return logRepository.findByIsResolved(false);
    }

    List<Log> getResolvedLogs() {
        return logRepository.findByIsResolved(true);
    }

    Log getLog(Long id) {
        return logRepository.findById(id).get();
    }

    void addLog(Log log) {
        log.timestamp = System.currentTimeMillis();
        logRepository.save(log);
    }

    void updateLog(long id, Log newLog) {
        Log log = logRepository.findById(id).get();
        log.setMemberId(newLog.getMemberId());
        log.setResolved(true);
        log.setUpdateTimestamp(System.currentTimeMillis());
        logRepository.save(log);
    }
}
