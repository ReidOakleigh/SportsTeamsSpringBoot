package edu.dmacc.sportsteams.services;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import edu.dmacc.sportsteams.model.Team;

@Service
public class TeamServiceImpl implements TeamService {
	
    private final JpaRepository<Team, Integer> teamRepository;

    public TeamServiceImpl( JpaRepository<Team, Integer> teamRepository ) {
        this.teamRepository = teamRepository;
    }

    @Transactional
    public List<Team> getAllTeams() {
        return ( List<Team> ) teamRepository.findAll();
    }
}
