package edu.dmacc.sportsteams.daos;

import edu.dmacc.sportsteams.model.Team;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface TeamRepository extends JpaRepository<Team, Integer>{
}
