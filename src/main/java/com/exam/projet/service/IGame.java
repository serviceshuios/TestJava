package com.exam.projet.service;

import com.exam.projet.metier.Game;
import com.exam.projet.metier.Player;

public interface IGame {

	public Game createGame(Game game);
	public Game getGame(Long id);
	public Player createPlayer(Player player);
	public Player displayPlayer(Long id);
	public void play(Player p, Game g, int nombre);
	public void statut(Game g);
	
}
