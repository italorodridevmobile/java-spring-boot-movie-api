package com.itmax.streaming.features.profile.model;

import java.util.List;

public class Profile {
    private String id;
    private String accountId;
    private String name;
    private String avatarAssetPath;
    private List<Device> activeDevices;

    public Profile() {
    }

    public Profile(String id, String accountId, String name, String avatarAssetPath, List<Device> activeDevices) {
        this.id = id;
        this.accountId = accountId;
        this.name = name;
        this.avatarAssetPath = avatarAssetPath;
        this.activeDevices = activeDevices;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAvatarAssetPath() {
        return avatarAssetPath;
    }

    public void setAvatarAssetPath(String avatarAssetPath) {
        this.avatarAssetPath = avatarAssetPath;
    }

    public List<Device> getActiveDevices() {
        return activeDevices;
    }

    public void setActiveDevices(List<Device> activeDevices) {
        this.activeDevices = activeDevices;
    }
}