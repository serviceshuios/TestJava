package com.exam.projet.metier;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Player {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
    private Long idPlayer;
    private String namePlayer;
    private String surNamePlayer;
    private int points;
    @ManyToOne
    private Game game;
    
	public Player(String namePlayer, String surNamePlayer, int points) {
		super();
		this.namePlayer = namePlayer;
		this.surNamePlayer = surNamePlayer;
		this.points = points;
	}
	
	
	public Player(String namePlayer, String surNamePlayer, int points, Game game) {
		super();
		this.namePlayer = namePlayer;
		this.surNamePlayer = surNamePlayer;
		this.points = points;
		this.game = game;
	}


	public Player() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Long getIdPlayer() {
		return idPlayer;
	}
	public void setIdPlayer(Long idPlayer) {
		this.idPlayer = idPlayer;
	}
	public String getNamePlayer() {
		return namePlayer;
	}
	public void setNamePlayer(String namePlayer) {
		this.namePlayer = namePlayer;
	}
	public String getSurNamePlayer() {
		return surNamePlayer;
	}
	public void setSurNamePlayer(String surNamePlayer) {
		this.surNamePlayer = surNamePlayer;
	}
	public int getPoints() {
		return points;
	}
	public void setPoints(int points) {
		this.points = points;
	}


	public Game getGame() {
		return game;
	}


	public void setGame(Game game) {
		this.game = game;
	}

    
}