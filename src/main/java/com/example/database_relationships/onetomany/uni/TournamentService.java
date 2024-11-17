package com.example.database_relationships.onetomany.uni;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TournamentService {

    @Autowired
    private TournamentRepository tournamentRepository;


    public List<Tournament> getAllTournaments() {
        return tournamentRepository.findAll();
    }

    public Tournament getTournamentById(int id) {
        return tournamentRepository.findById(id).get();
    }

    public Tournament addTournament(Tournament tournament) {
        tournament.setId(0);
        return tournamentRepository.save(tournament);
    }

    public void deleteTournamentById(int id) {
        tournamentRepository.deleteById(id);
    }

    public Tournament addRegistration(int id, Registration registration) {
        Tournament tournament = tournamentRepository.findById(id).get();
        tournament.addRegistration(registration);
        return tournamentRepository.save(tournament);
    }
}
