package com.example.database_relationships.onetomany.bi;

import com.example.database_relationships.onetoone.Player;
import com.example.database_relationships.onetoone.PlayerProfile;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/players")
public class PlayerController {
    @Autowired
    private PlayerService service;

    @Autowired
    private PlayerProfileService profileService;

    @GetMapping
    public List<com.example.database_relationships.onetoone.Player> getAllPlayers() {
        return service.getAllPlayers();
    }

    @GetMapping("/{id}")
    public com.example.database_relationships.onetoone.Player getPlayerById(@PathVariable int id) {
        return service.getPlayerById(id);
    }

    @PostMapping
    public com.example.database_relationships.onetoone.Player createPlayer(@RequestBody com.example.database_relationships.onetoone.Player player) {
        return service.addPlayer(player);
    }
    @DeleteMapping("/{id}")
    public void deletePlayerById(@PathVariable int id) {
        service.deletePlayerById(id);
    }


    @PutMapping("/{id}/profiles/{profile_id}")
    public Player assignDetail(@PathVariable int id, @PathVariable int profile_id) {
        PlayerProfile profile = profileService.getPlayerProfile(profile_id);
        return service.assignProfile(id, profile);
    }
}
