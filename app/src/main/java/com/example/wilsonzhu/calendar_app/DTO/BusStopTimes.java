package com.example.wilsonzhu.calendar_app.DTO;

import java.util.ArrayList;

public class BusStopTimes {
    private ArrayList<String> busStopTimes;

    public BusStopTimes() {
        busStopTimes = new ArrayList<>();
    }

    public ArrayList<String> getBusStopTimes() {
        return busStopTimes;
    }

    public void addBusStopTime(String busStopTime) {
        getBusStopTimes().add(busStopTime);
    }
}
