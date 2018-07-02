package com.luminent.demo;

import java.sql.Time;

public class Resource {

    int id;
    String name;
    Time startShiftTime;
    String[] specialization;
    String region;
    String[] weekend;
    String[] weekdays;
    Boolean flag; //to set the priority of a resource in last hour of tasks/tickets

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Time getStartShiftTime() {
        return startShiftTime;
    }

    public void setStartShiftTime(Time startShiftTime) {
        this.startShiftTime = startShiftTime;
    }

    public String[] getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String[] specialization) {
        this.specialization = specialization;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String[] getWeekend() {
        return weekend;
    }

    public void setWeekend(String[] weekend) {
        this.weekend = weekend;
    }

    public String[] getWeekdays() {
        return weekdays;
    }

    public void setWeekdays(String[] weekdays) {
        this.weekdays = weekdays;
    }

    public Boolean getFlag() {
        return flag;
    }

    public void setFlag(Boolean flag) {
        this.flag = flag;
    }
}
