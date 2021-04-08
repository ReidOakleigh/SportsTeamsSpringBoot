package edu.dmacc.sportsteams.controllers;

import edu.dmacc.sportsteams.daos.LeagueRepository;
import edu.dmacc.sportsteams.model.League;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class LeagueController {

	LeagueRepository repo;
	
	LeagueController(LeagueRepository repo) {
		this.repo = repo;
	}
	
	@GetMapping("/leagues")
	public String viewLeagues( Model model ) {
		List<League> leagues = repo.findAll();
		model.addAttribute("leagues", leagues);
		return "league-list";
	}
	
	@GetMapping("/addLeague")
	public String addLeague() {
		return "add-league";
	}
	
	@PostMapping("/addLeague")
	public String addLeague(@RequestParam 
			String leagueId, String leagueName, String hallOfFame) {
		League league = new League(leagueId, leagueName, hallOfFame);
		repo.save(league);
		return "add-league";
	}
	
	@GetMapping("/teamsByLeague")
	public String teamsByLeague( Model model ) {
		List<League> leagues = repo.findAll();
		model.addAttribute("leagues", leagues);	
		return "teams-by-league-list";
	}
}
