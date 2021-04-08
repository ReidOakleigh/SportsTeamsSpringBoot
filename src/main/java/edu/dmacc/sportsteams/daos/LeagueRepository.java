package edu.dmacc.sportsteams.daos;

import edu.dmacc.sportsteams.model.League;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface LeagueRepository extends JpaRepository<League, Integer> {

	League findOneBySport(String sport);
}
