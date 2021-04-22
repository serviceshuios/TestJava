package com.exam.projet.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.exam.projet.metier.Game;

@Repository
public interface GameRepository extends JpaRepository<Game, Long>{
	
}
