package com.itmax.streaming.features.profile.service;

import com.itmax.streaming.features.profile.dto.ProfileCreateRequest;
import com.itmax.streaming.features.profile.model.Device;
import com.itmax.streaming.features.profile.model.Profile;
import com.itmax.streaming.features.profile.repository.ProfileRepository;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.util.Collections;
import java.util.List;

@Service
public class ProfileService {

    private final ProfileRepository profileRepository;

    public ProfileService(ProfileRepository profileRepo) {
        this.profileRepository = profileRepo;
    }

    public Profile createProfile(String accountId, ProfileCreateRequest request) throws Exception {
        List<Profile> existingProfiles = profileRepository.findByAccountId(accountId);

        if(existingProfiles.size() >= 5) {
            throw new IllegalArgumentException("Esta conta já atingiu o limite máximo de 5 perfis.");
        }

        Device initialDevice = new Device(
            request.getDeviceId(),
            request.getDeviceName(),
            Instant.now().toString()
        );

        Profile profile = new Profile();
        profile.setAccountId(accountId);
        profile.setName(request.getName());
        profile.setAvatarAssetPath(request.getAvatarAssetPath());
        profile.setActiveDevices(Collections.singletonList(initialDevice));

        return profileRepository.save(profile);
    }

    public List<Profile> listProfiles(String accountId) throws Exception {
        return profileRepository.findByAccountId(accountId);
    }


}