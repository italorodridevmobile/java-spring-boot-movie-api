package com.itmax.streaming.features.profile.controller;

import com.itmax.streaming.features.profile.dto.ProfileCreateRequest;
import com.itmax.streaming.features.profile.model.Profile;
import com.itmax.streaming.features.profile.service.ProfileService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/profiles")
public class ProfileController {

    private final ProfileService profileService;

    public ProfileController(ProfileService profileService) {
        this.profileService = profileService;
    }

    @PostMapping("/create/{accountId}")
    public ResponseEntity<Profile> createProfile(
        @PathVariable String accountId,
        @Valid @RequestBody ProfileCreateRequest request
    ) {
        try {
            Profile created = profileService.createProfile(accountId, request);
            return ResponseEntity.status(HttpStatus.CREATED).body(created);
        } catch(IllegalArgumentException e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        } catch(Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }

    @GetMapping("/list/{accountId}")
    public ResponseEntity<List<Profile>> listProfiles(@PathVariable String accountId) {
        try {
            List<Profile> profiles = profileService.listProfiles(accountId);
            return ResponseEntity.ok(profiles);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }
}