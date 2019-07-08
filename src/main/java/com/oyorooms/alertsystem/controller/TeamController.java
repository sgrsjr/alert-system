/*
  Created by rameshwar on 2019-07-07.
 */
package com.oyorooms.alertsystem.controller;

import com.oyorooms.alertsystem.entity.Team;
import com.oyorooms.alertsystem.service.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TeamController {

    private final TeamService teamService;

    @Autowired
    public TeamController(TeamService teamService) {
        this.teamService = teamService;
    }

    @RequestMapping("/teams")
    public List<Team> getAllTeams() {
        return teamService.getAllTeams();
    }

    @RequestMapping("/teams/{id}")
    public Team getTeam(@PathVariable String id) {
        return teamService.getTeam(Long.parseLong(id));
    }

    @RequestMapping(value = "/teams", method = RequestMethod.POST)
    public void addTeam(Team team) {
        teamService.addTeam(team);
    }

    @RequestMapping(value = "/teams", method = RequestMethod.PUT)
    public void updateTeam(Team team) {
        teamService.updateTeam(team);
    }


}
