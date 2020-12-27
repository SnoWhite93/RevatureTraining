package com.app.service.impl;

import java.util.List;

import com.app.dao.PlayerSearchDAO;
import com.app.dao.impl.PlayerSearchDAOImpl;
import com.app.exception.BusinessExceptions;
import com.app.model.Player;
import com.app.service.PlayerSearchService;

public class PlayerSearchServiceImpl implements PlayerSearchService {

	private PlayerSearchDAO playerSearchDAO = new PlayerSearchDAOImpl();

	@Override
	public Player getPlayerById(int id) throws BusinessExceptions {
		Player player = null;
		if (id > 99 && id < 1000) {
			// code here for DAO
			player = playerSearchDAO.getPlayerById(id);
		} else {
			throw new BusinessExceptions("Entered Player Id " + id + " is INVALID.....");

		}
		return player;
	}

	@Override
	public Player getPlayerbyContact(long contact) throws BusinessExceptions {
		Player player = null;
		if (contact > 0) {
			// code here for DAO
			player = playerSearchDAO.getPlayerbyContact(contact);
		} else {
			throw new BusinessExceptions("Entered Player contact " + contact + " is INVALID.....");

		}
		return player;
	}

	@Override
	public List<Player> getAllPlayers() throws BusinessExceptions {
		List<Player> allPlayersList = null;
		allPlayersList = playerSearchDAO.getAllPlayers();
		return allPlayersList;
	}

	@Override
	public List<Player> getPlayersByAge(int age) throws BusinessExceptions {
		List<Player> agePlayersList = null;
		Player player = null;
		if (age > 19 && age < 41) {
			// code here for DAO
			agePlayersList = playerSearchDAO.getPlayersByAge(age);
		} else {
			throw new BusinessExceptions("Entered Player Age " + age + " is INVALID.....");

		}
		return agePlayersList;
	}

	@Override
	public List<Player> getPlayersByGender(String gender) throws BusinessExceptions {
		List<Player> agePlayersList = null;
		Player player = null;
		if (gender.equals("M") || gender.equals("F")) {
			// code here for DAO
			agePlayersList = playerSearchDAO.getPlayersByGender(gender);
		} else {
			throw new BusinessExceptions("Entered Player gender" + gender + " can only be M or F.....");

		}
		return agePlayersList;
	}

	@Override
	public List<Player> getPlayersByTeamName(String teamname) throws BusinessExceptions {
		List<Player> teamPlayersList = null;
		if (teamname != null && teamname.matches("[a-zA-Z]{5,20}")) {
			teamPlayersList = playerSearchDAO.getPlayersByTeamName(teamname);

		} else {
			throw new BusinessExceptions("Entered TeamName " + teamname + " is INVALID");
		}
		return teamPlayersList;
	}

	@Override
	public List<Player> getPlayersByName(String name) throws BusinessExceptions {
		List<Player> teamPlayersList = null;
		if (name != null) {
			teamPlayersList = playerSearchDAO.getPlayersByName(name);

		} else {
			throw new BusinessExceptions("Entered name " + name + " is INVALID");
		}
		return teamPlayersList;
	}

	@Override
	public List<Player> getPlayersByDob(String dob) throws BusinessExceptions {
		List<Player> dobPlayersList = null;
		if (dob != null && dob.matches("[0-9]{4}-[0-9]{2}-[0-9]{2}")) {
			dobPlayersList = playerSearchDAO.getPlayersByDob(dob);

		} else {
			throw new BusinessExceptions("Entered date of birth " + dob + " is INVALID");
		}
		return dobPlayersList;
	}

}
