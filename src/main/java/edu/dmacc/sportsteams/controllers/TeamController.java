package edu.dmacc.sportsteams.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import edu.dmacc.sportsteams.daos.LeagueRepository;
import edu.dmacc.sportsteams.daos.TeamRepository;
import edu.dmacc.sportsteams.model.League;
import edu.dmacc.sportsteams.model.Team;

import java.util.List;

@Controller
public class TeamController {

	LeagueRepository leagueRepo;
	TeamRepository teamRepo;
	
	TeamController(LeagueRepository leagueRepo, TeamRepository teamRepo) {
		this.leagueRepo = leagueRepo;
		this.teamRepo = teamRepo;
	}

	@GetMapping("/teams")
	public String viewTeams(Model model) {
		List<Team> teams = teamRepo.findAll();
		model.addAttribute("teams", teams);
		return "team-list";
	}
	
	@GetMapping("/addTeam")
	public String addTeam() {
		return "add-team";
	}
	
	@PostMapping("/addTeam")
	public String addTeam(@RequestParam 
			String city, String name, String league) {
		League l = leagueRepo.findOneBySport(league);
		Team team = new Team(city, name, l);
		l.addTeam(team);
		leagueRepo.save(l);
		teamRepo.save(team);
		return "add-team";
	}

}
