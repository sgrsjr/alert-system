/*
  Created by rameshwar on 2019-07-07.
 */
package com.oyorooms.alertsystem.service;

import com.oyorooms.alertsystem.entity.Team;
import com.oyorooms.alertsystem.repo.TeamRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeamService {

    private final TeamRepository teamRepository;

    public TeamService(TeamRepository teamRepository) {
        this.teamRepository = teamRepository;
    }

    public List<Team> getAllTeams() {
        return teamRepository.findAll();
    }

    public Team getTeam(Long id) {
        return teamRepository.findById(id).get();
    }

    public void addTeam(Team team) {
        teamRepository.save(team);
    }

    public void updateTeam(Team team) {
        teamRepository.save(team);
    }
}