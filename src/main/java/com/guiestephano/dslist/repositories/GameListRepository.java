package com.guiestephano.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.guiestephano.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long>{

}
