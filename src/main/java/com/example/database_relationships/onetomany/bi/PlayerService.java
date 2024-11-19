package com.example.database_relationships.onetomany.bi;

import com.example.database_relationships.onetoone.Player;
import com.example.database_relationships.onetoone.PlayerProfile;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlayerService {
    @Autowired
    private PlayerRepository repository;

    public List<com.example.database_relationships.onetoone.Player> getAllPlayers() {
        return repository.findAll();
    }
    public com.example.database_relationships.onetoone.Player getPlayerById(int id) {
        return repository.findById(id).get();
    }
    public com.example.database_relationships.onetoone.Player addPlayer(com.example.database_relationships.onetoone.Player player) {
        return repository.save(player);
    }
    public com.example.database_relationships.onetoone.Player updatePlayer(com.example.database_relationships.onetoone.Player player, int id) {
        player.setId(id);
        return repository.save(player);
    }
    public void deletePlayerById(int id) {
        repository.deleteById(id);
    }

    public com.example.database_relationships.onetoone.Player assignProfile(int id, PlayerProfile profile) {
        Player player = repository.findById(id).get();
        player.setPlayerProfile(profile);
        return repository.save(player);
    }

}
