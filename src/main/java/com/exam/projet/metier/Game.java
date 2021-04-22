package com.exam.projet.metier;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Game {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
    private Long idJeu;
    private int nbJoueurs;
    private int nbTours;
    
    @OneToMany(mappedBy = "game")
    private List<Player> players = new ArrayList<Player>();
	public Long getIdJeu() {
		return idJeu;
	}
	public void setIdJeu(Long idJeu) {
		this.idJeu = idJeu;
	}
	public int getNbJoueurs() {
		return nbJoueurs;
	}
	public void setNbJoueurs(int nbJoueurs) {
		this.nbJoueurs = nbJoueurs;
	}
	public List<Player> getPlayers() {
		return players;
	}
	public void setPlayers(List<Player> players) {
		this.players = players;
	}
	public int getNbTours() {
		return nbTours;
	}
	public void setNbTours(int nbTours) {
		this.nbTours = nbTours;
	}
	
	public Game(int nbJoueurs, int nbTours) {
		super();
		this.nbJoueurs = nbJoueurs;
		this.nbTours = nbTours;
	}
	public Game() {
		super();
		// TODO Auto-generated constructor stub
	}
	
    
}