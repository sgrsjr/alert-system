/*Ò
  Created by rameshwar on 2019-07-06.
 */
package com.oyorooms.alertsystem.logs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class LogController {

    private final LogService logService;

    @Autowired
    public LogController(LogService logService) {
        this.logService = logService;
    }

    @RequestMapping("/logs")
    List<Log> getAllLogs() {
        return logService.getAllLogs();
    }

    @RequestMapping("/logs/{id}")
    Log getLog(@PathVariable Long id) {
        return logService.getLog(id);
    }

    @RequestMapping(value = "/logs", method = RequestMethod.POST)
    void addLog(Log log) {
        logService.addLog(log);
    }

    @RequestMapping(value = "/logs/{id}", method = RequestMethod.PUT)
    void updateLog(@PathVariable String id, Log log) {
        logService.updateLog(Long.parseLong(id), log);
    }
}
