package com.exam.projet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.exam.projet.metier.Game;
import com.exam.projet.metier.Player;
import com.exam.projet.service.IGame;

@SpringBootApplication
public class ProjetApplication implements CommandLineRunner {
	
	@Autowired
	IGame gameService;
	public static void main(String[] args) {
		SpringApplication.run(ProjetApplication.class, args);
		
	}
	@Override
	public void run(String... args) throws Exception {
		// création du jeu
		/*Game game = new Game(8, 10);
		gameService.createGame(game);*/
		
		// création des joueurs
		/*Player player = new Player("Player1", "Player 1", 0, game);
		Player player2 = new Player("Player2", "Player2", 0,game);
		Player player3 = new Player("Player3", "Player3", 0,game);
		Player player4 = new Player("Player 4", "Player 4", 0,game);
		Player player5 = new Player("Player 5", "Player 5", 0,game);
		
		gameService.createPlayer(player);
		gameService.createPlayer(player2);
		gameService.createPlayer(player3);
		gameService.createPlayer(player4);
		gameService.createPlayer(player5);*/
		
		// Affichage des joueurs
		Game game2 = gameService.getGame(1L);
		for(Player lePlayer : game2.getPlayers()) {
			System.out.println(lePlayer.getNamePlayer()+":"+lePlayer.getPoints()+"/301");
		}
	}

}
