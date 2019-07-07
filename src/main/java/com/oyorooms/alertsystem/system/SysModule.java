/*
  Created by rameshwar on 2019-07-07.
 */
package com.oyorooms.alertsystem.system;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
class SysModule {
    @Id
    String name;
    boolean isWorking;
    String teamInfo;

    public SysModule() {
    }

    public SysModule(String name, Boolean isWorking, String teamInfo) {
        this.name = name;
        this.isWorking = isWorking;
        this.teamInfo = teamInfo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getWorking() {
        return isWorking;
    }

    public void setWorking(Boolean working) {
        isWorking = working;
    }

    public String getTeamInfo() {
        return teamInfo;
    }

    public void setTeamInfo(String teamInfo) {
        this.teamInfo = teamInfo;
    }
}
