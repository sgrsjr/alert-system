/*
  Created by rameshwar on 2019-07-07.
 */
package com.oyorooms.alertsystem.teams;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeamService {

    private final TeamRepository teamRepository;

    public TeamService(TeamRepository teamRepository) {
        this.teamRepository = teamRepository;
    }

    List<Team> getAllTeams() {
        return teamRepository.findAll();
    }

    Team getTeam(Long id) {
        return teamRepository.findById(id).get();
    }

    void addTeam(Team team) {
        teamRepository.save(team);
    }

    void updateTeam(Team team) {
        teamRepository.save(team);
    }
}