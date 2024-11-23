package com.example.database_relationships.manytomany;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlayerProfileService {
    @Autowired
    private PlayerProfileRepository repository;

    public List<PlayerProfile> allPlayerProfiles() {
        return repository.findAll();
    }
    public PlayerProfile getPlayerProfile(int id) {
        System.out.println("id = " + id);
        var result = repository.findById(id).get();
        System.out.println("result = " + result);
        return result;
    }
    public PlayerProfile addPlayerProfile(PlayerProfile playerProfile) {
        return repository.save(playerProfile);
    }
    public void deletePlayerProfile(int id) {
        repository.deleteById(id);
    }
}
