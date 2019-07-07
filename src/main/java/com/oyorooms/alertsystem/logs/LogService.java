/*
  Created by rameshwar on 2019-07-06.
 */
package com.oyorooms.alertsystem.logs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class LogService {

    @Autowired
    private LogRepository logRepository;

//    private List<Log> logs = Arrays.asList(
//            new Log(new Date(), "1", "Delhi"),
//            new Log(new Date(), "2", "Pune"),
//            new Log(new Date(), "3", "Hyderabad")
//    );

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
