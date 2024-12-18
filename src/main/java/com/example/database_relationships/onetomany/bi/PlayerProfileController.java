package com.example.database_relationships.onetomany.bi;

import com.example.database_relationships.onetoone.PlayerProfile;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/profiles")
public class PlayerProfileController {

    @Autowired
    private PlayerProfileService service;

    @GetMapping
    public List<com.example.database_relationships.onetoone.PlayerProfile> getAllProfiles() {
        return service.allPlayerProfiles();
    }
    @GetMapping("/{id}")
    public com.example.database_relationships.onetoone.PlayerProfile getProfileById(@PathVariable int id) {
        return service.getPlayerProfile(id);
    }

    @PostMapping
    public com.example.database_relationships.onetoone.PlayerProfile createProfile(@RequestBody PlayerProfile profile) {
        return service.addPlayerProfile(profile);
    }

    @DeleteMapping("/{id}")
    public void deleteProfileById(@PathVariable int id) {
        service.deletePlayerProfile(id);
    }

}
