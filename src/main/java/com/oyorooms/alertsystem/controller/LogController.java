/*Ò
  Created by rameshwar on 2019-07-06.
 */
package com.oyorooms.alertsystem.controller;

import com.oyorooms.alertsystem.entity.Log;
import com.oyorooms.alertsystem.service.LogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class LogController {

    private final LogService logService;

    @Autowired
    public LogController(LogService logService) {
        this.logService = logService;
    }

    @GetMapping("/logs")
    List<Log> getAllLogs() {
        return logService.getAllLogs();
    }

    @GetMapping("/logs/unresolved")
    List<Log> getUnresolvedLogs() {
        return logService.getUnresolvedLogs();
    }

    @GetMapping("/logs/resolved")
    List<Log> getResolvedLogs() {
        return logService.getResolvedLogs();
    }

    @GetMapping("/logs/{id}")
    Log getLog(@PathVariable Long id) {
        return logService.getLog(id);
    }

    @PostMapping(value = "/logs")
    void addLog(Log log) {
        logService.addLog(log);
    }

    @PutMapping(value = "/logs/{id}")
    void updateLog(@PathVariable String id, Log log) {
        logService.updateLog(Long.parseLong(id), log);
    }
}
