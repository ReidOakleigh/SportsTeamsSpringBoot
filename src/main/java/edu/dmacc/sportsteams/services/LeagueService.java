package edu.dmacc.sportsteams.services;

import edu.dmacc.sportsteams.model.League;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public interface LeagueService {
    List<League> getAllLeagues();
}
