package com.app.service;

import java.util.List;

import com.app.exception.BusinessExceptions;
import com.app.model.Player;

public interface PlayerSearchService {

	public Player getPlayerById(int id) throws BusinessExceptions;

	public Player getPlayerbyContact(long contact) throws BusinessExceptions;

	public List<Player> getAllPlayers() throws BusinessExceptions;

	public List<Player> getPlayersByAge(int age) throws BusinessExceptions;

	public List<Player> getPlayersByGender(String gender) throws BusinessExceptions;

	public List<Player> getPlayersByTeamName(String teamname) throws BusinessExceptions;

	public List<Player> getPlayersByName(String name) throws BusinessExceptions;

	public List<Player> getPlayersByDob(String dob) throws BusinessExceptions;

}
