package com.exam.projet.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.exam.projet.metier.Player;

@Repository
public interface PlayerRepository extends JpaRepository<Player, Long>{
	
}
