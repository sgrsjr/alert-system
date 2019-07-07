/*
  Created by rameshwar on 2019-07-07.
 */
package com.oyorooms.alertsystem.system;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Status {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @JoinTable
    @OneToMany(targetEntity = SysModule.class, cascade = CascadeType.ALL)
    private List<SysModule> services;
    private boolean allWorking;

    public Status() {
    }

    public boolean isAllWorking() {
        return allWorking;
    }

    public void setAllWorking(boolean allWorking) {
        this.allWorking = allWorking;
    }

    public Status(ArrayList<SysModule> services, boolean allWorking) {
        this.services = services;
        this.allWorking = allWorking;
    }

    public Status(ArrayList<SysModule> services) {
        this.services = services;
    }

    public List<SysModule> getServices() {
        return services;
    }

    public void setServices(ArrayList<SysModule> services) {
        this.services = services;
    }
}
