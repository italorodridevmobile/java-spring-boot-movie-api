package com.itmax.streaming.features.profile.model;

public class Device {
    private String deviceId;
    private String deviceName;
    private String lastLogin;

    public Device() {
    }

    public Device(String deviceId, String deviceName, String lastLogin) {
        this.deviceId = deviceId;
        this.deviceName = deviceName;
        this.lastLogin = lastLogin;
    }

    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    public String getDeviceName() {
        return deviceName;
    }

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    public String getLastLogin() {
        return lastLogin;
    }

    public void setLastLogin(String lastLogin) {
        this.lastLogin = lastLogin;
    }
}