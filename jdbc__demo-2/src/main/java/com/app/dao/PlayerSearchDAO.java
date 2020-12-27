package com.app.dao;

import java.util.List;

import com.app.exception.BusinessExceptions;
import com.app.model.Player;

public interface PlayerSearchDAO {
   
	public Player getPlayerByContact(long contact)throws BusinessExceptions;
	public List<Player> getPlayersByGender(String gender) throws BusinessExceptions;


}
