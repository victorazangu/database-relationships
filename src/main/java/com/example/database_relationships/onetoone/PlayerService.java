package com.example.database_relationships.onetoone;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlayerService {
    @Autowired
    private PlayerRepository repository;

    public List<Player> getAllPlayers() {
        return repository.findAll();
    }
    public Player getPlayerById(int id) {
        return repository.findById(id).get();
    }
    public Player addPlayer(Player player) {
        return repository.save(player);
    }
    public Player updatePlayer(Player player, int id) {
        player.setId(id);
        return repository.save(player);
    }
    public void deletePlayerById(int id) {
        repository.deleteById(id);
    }

    public Player assignProfile(int id, PlayerProfile profile) {
        Player player = repository.findById(id).get();
        player.setPlayerProfile(profile);
        return repository.save(player);
    }

}
