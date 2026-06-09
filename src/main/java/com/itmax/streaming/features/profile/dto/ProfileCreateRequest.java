package com.itmax.streaming.features.profile.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class ProfileCreateRequest {

    @NotBlank(message = "O nome é obrigatório")
    @Size(min = 2, max = 15, message = "O nome deve ter entre 2 e 15 caracteres")
    private String name;

    @NotBlank(message = "O caminho do avatar é obrigatório")
    private String avatarAssetPath;

    @NotBlank(message = "O ID do dispositivo é obrigatório")
    private String deviceId;

    private String deviceName = "Dispositivo Não Identificado";

    public ProfileCreateRequest() {
    }

    public ProfileCreateRequest(String name, String avatarAssetPath, String deviceId, String deviceName) {
        this.name = name;
        this.avatarAssetPath = avatarAssetPath;
        this.deviceId = deviceId;
        this.deviceName = deviceName;
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
}