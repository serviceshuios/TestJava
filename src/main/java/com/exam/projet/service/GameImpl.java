package com.exam.projet.service;

import java.util.Collection;
import java.util.Collections;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exam.projet.dao.GameRepository;
import com.exam.projet.dao.PlayerRepository;
import com.exam.projet.metier.Game;
import com.exam.projet.metier.Player;

@Service
public class GameImpl implements IGame {

	@Autowired
	GameRepository gameRepository;
	
	@Autowired
	PlayerRepository playerRepository;
	
	@Override
	public Game createGame(Game game) {
		if(game.getNbJoueurs() <= 8 && game.getNbTours()==10)
			return gameRepository.save(game);
		return null;
	}

	@Override
	public Player createPlayer(Player player) {
		return playerRepository.save(player);
	}

	@Override
	public Player displayPlayer(Long id) {
		return playerRepository.getOne(id);
		
	}

	@Override
	public void play(Player p, Game g, int score) {
		System.out.println(p.getNamePlayer());
		System.out.println("score actuel:"+ p.getPoints()+"/301");
		for(int i=1; i <=3; i++) {
			System.out.println("Lancer "+i);
				p.setPoints(p.getPoints()+score);
		}
		//diminution du nombre de tours
	}
	
	public void OneTour(Game g, int score) {
		for (Player player : g.getPlayers()) {
			play(player, g, score);
		}
	}

	@Override
	public void statut(Game g) {
		System.out.println("statut");
		System.out.println("il reste "+g.getNbTours()+" tours");
		for (Player player: g.getPlayers()) {
			System.out.println(player.getNamePlayer()+ ":"+ player.getPoints()+"/301");
			
			if(player.getPoints() >= 301)
				System.out.println("Gagnant:"+player.getNamePlayer());
			
			//if(g.getNbTours()==10)
					//System.out.println("Gagnant:"+Collections.max(g.getPlayers());
		}
		
		
	}

	@Override
	public Game getGame(Long id) {
		// TODO Auto-generated method stub
		return gameRepository.findById(id).get();
	}

}
