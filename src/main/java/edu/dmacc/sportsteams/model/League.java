package edu.dmacc.sportsteams.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Entity implementation class for Entity: League
 *
 */

/**
 * Rumbi Chinhamhora rchinhamhora
 * CIS 175 - Spring 2021
 * Mar 3, 2021
 */
@Entity
@Table(name="league")
public class League implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="LEAGUE_ID")
	private int id;
	@Column(name="SPORT")
	private String sport;
	@Column(name="LEAGUE_NAME")
	private String leagueName;
	@Column(name="HALL_OF_FAME")
	private String hallOfFame;

	
	@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.EAGER)
	@JoinColumn(name="league_id")
	private List<Team> listOfTeams;
	 

	public League() {}
	
	
	public League(String sport, String leagueName, String hallOfFame) {
		super();
		this.sport = sport;
		this.leagueName = leagueName;
		this.hallOfFame = hallOfFame;
		listOfTeams = new ArrayList<Team>();
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getSport() {
		return sport;
	}


	public void setSport(String sport) {
		this.sport = sport;
	}


	public String getLeagueName() {
		return leagueName;
	}


	public void setLeagueName(String leagueName) {
		this.leagueName = leagueName;
	}


	public String getHallOfFame() {
		return hallOfFame;
	}


	public void setHallOfFame(String hallOfFame) {
		this.hallOfFame = hallOfFame;
	}



	public List<Team> getListOfTeams() {
		return listOfTeams;
	}

	public void addTeam(Team team) {
		listOfTeams.add(team);
	}

	@Override
	public String toString() {
		return id + " " + sport + " " + leagueName + " " + hallOfFame;
	}

}
