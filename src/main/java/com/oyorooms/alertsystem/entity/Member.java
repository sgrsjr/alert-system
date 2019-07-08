/*
  Created by rameshwar on 2019-07-07.
 */
package com.oyorooms.alertsystem.entity;

import javax.persistence.*;

@Entity
public class Member {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    private String name;

    @ManyToOne(targetEntity = Team.class, cascade = CascadeType.MERGE, fetch = FetchType.EAGER)
    private Team team;

    public Member() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

//    public Team getTeam() {
//        return team;
//    }

    public void setTeam(Team team) {
        this.team = team;
    }
}
