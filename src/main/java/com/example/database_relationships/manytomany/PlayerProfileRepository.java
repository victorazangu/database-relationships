package com.example.database_relationships.manytomany;

import com.example.database_relationships.onetoone.PlayerProfile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlayerProfileRepository extends JpaRepository<PlayerProfile, Integer> {
}
