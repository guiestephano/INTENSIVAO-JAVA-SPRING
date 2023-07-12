package com.guiestephano.dslist.dto;

import com.guiestephano.dslist.entities.GameList;

public class GameListDTO {
	Long id;
	String name;
	
	public GameListDTO() {}
	
	public GameListDTO(GameList entity) {
		id = entity.getId();
		name = entity.getName();
		
	}

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}
	
	
}
