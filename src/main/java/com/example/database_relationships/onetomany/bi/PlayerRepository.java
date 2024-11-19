package com.example.database_relationships.onetomany.bi;

import com.example.database_relationships.onetoone.Player;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlayerRepository extends JpaRepository<Player, Integer> {
}
