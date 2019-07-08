/*
  Created by rameshwar on 2019-07-06.
 */
package com.oyorooms.alertsystem.service;

import com.oyorooms.alertsystem.entity.Log;
import com.oyorooms.alertsystem.repo.LogRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LogService {

    private final LogRepository logRepository;

    public LogService(LogRepository logRepository) {
        this.logRepository = logRepository;
    }

    public List<Log> getAllLogs() {
        return logRepository.findAll();
    }

    public List<Log> getUnresolvedLogs() {
        return logRepository.findByIsResolved(false);
    }

    public List<Log> getResolvedLogs() {
        return logRepository.findByIsResolved(true);
    }

    public Log getLog(Long id) {
        return logRepository.findById(id).get();
    }

    public void addLog(Log log) {
        log.timestamp = System.currentTimeMillis();
        logRepository.save(log);
    }

    public void updateLog(long id, Log newLog) {
        Log log = logRepository.findById(id).get();
        log.setMemberId(newLog.getMemberId());
        log.setResolved(true);
        log.setUpdateTimestamp(System.currentTimeMillis());
        logRepository.save(log);
    }
}
