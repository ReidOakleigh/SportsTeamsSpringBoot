package edu.dmacc.sportsteams.services;

import edu.dmacc.sportsteams.daos.LeagueRepository;
import edu.dmacc.sportsteams.model.League;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class LeagueServiceImpl implements LeagueService {
	
    private final LeagueRepository leagueRepository;

    public LeagueServiceImpl( LeagueRepository leagueRepository ) {
        this.leagueRepository = leagueRepository;
    }

    @Transactional
    public List<League> getAllLeagues() {
        return ( List<League> ) leagueRepository.findAll();
    }
}
