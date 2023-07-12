package com.guiestephano.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.guiestephano.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long>{

}
