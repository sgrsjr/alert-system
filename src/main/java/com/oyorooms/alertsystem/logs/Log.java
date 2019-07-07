/*
  Created by rameshwar on 2019-07-07.
 */
package com.oyorooms.alertsystem.logs;

import com.oyorooms.alertsystem.system.Status;

import javax.persistence.*;

@Entity
public class Log {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    String serverId;
    String location;
    Long timestamp;

    @OneToOne(targetEntity = Status.class, cascade = CascadeType.ALL)
    Status status;

    public Log() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getServerId() {
        return serverId;
    }

    public void setServerId(String serverId) {
        this.serverId = serverId;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}