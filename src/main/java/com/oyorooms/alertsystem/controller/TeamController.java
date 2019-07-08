/*
  Created by rameshwar on 2019-07-07.
 */
package com.oyorooms.alertsystem.controller;

import com.oyorooms.alertsystem.entity.Team;
import com.oyorooms.alertsystem.service.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TeamController {

    private final TeamService teamService;

    @Autowired
    public TeamController(TeamService teamService) {
        this.teamService = teamService;
    }

    @GetMapping("/teams")
    public List<Team> getAllTeams() {
        return teamService.getAllTeams();
    }

    @GetMapping("/teams/{id}")
    public Team getTeam(@PathVariable String id) {
        return teamService.getTeam(Long.parseLong(id));
    }

    @PostMapping(value = "/teams")
    public void addTeam(Team team) {
        teamService.addTeam(team);
    }

    @PutMapping(value = "/teams")
    public void updateTeam(Team team) {
        teamService.updateTeam(team);
    }


}
