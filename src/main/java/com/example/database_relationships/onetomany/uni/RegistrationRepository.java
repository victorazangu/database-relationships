package com.example.database_relationships.onetomany.uni;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RegistrationRepository  extends JpaRepository<Registration, Integer> {
}
