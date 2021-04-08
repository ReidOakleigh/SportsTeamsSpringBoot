package edu.dmacc.sportsteams.services;

import org.springframework.stereotype.Component;
import edu.dmacc.sportsteams.model.Team;

import java.util.List;

@Component
public interface TeamService {
	List<Team> getAllTeams();
}
