/*
  Created by rameshwar on 2019-07-07.
 */
package com.oyorooms.alertsystem.teams;

import com.oyorooms.alertsystem.members.Member;

import javax.persistence.*;
import java.util.List;

@Entity
public class Team {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    private String name;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinTable
    private
    List<Member> members;

    public Team() {
    }

    public Team(String name, List<Member> members) {
        this.name = name;
        this.members = members;
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

    public List<Member> getMembers() {
        return members;
    }

    public void setMembers(List<Member> members) {
        this.members = members;
    }
}
