package com.app.dao;

import java.util.List;

import com.app.exception.BusinessExceptions;
import com.app.model.Player;

public interface PlayerCrudDAO {

	public int createPlayer(Player player) throws BusinessExceptions;

	public void deletePlayer(int id) throws BusinessExceptions;

	public int updatePlayerContact(int id, long newContact) throws BusinessExceptions;

	public Player getPlayerById(int id) throws BusinessExceptions;

	public List<Player> getAllPlayers() throws BusinessExceptions;
}
