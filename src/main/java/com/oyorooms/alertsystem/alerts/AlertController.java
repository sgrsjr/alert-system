/*
  Created by rameshwar on 2019-07-06.
 */
package com.oyorooms.alertsystem.alerts;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AlertController {

    private final AlertService alertService;

    @Autowired
    public AlertController(AlertService alertService) {
        this.alertService = alertService;
    }

    @RequestMapping("/alerts")
    List<Alert> getAllAlerts() {
        return alertService.getAllAlerts();
    }

    @RequestMapping("/alerts/{id}")
    Alert getAlert(@PathVariable String id) {
        return alertService.getAlert(id);
    }
}
