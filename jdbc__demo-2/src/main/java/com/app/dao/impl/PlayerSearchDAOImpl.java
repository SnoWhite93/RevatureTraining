package com.app.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.app.dao.PlayerSearchDAO;
import com.app.dao.dbutil.PostgresSqlConnection;
import com.app.exception.BusinessExceptions;
import com.app.model.Player;

public class PlayerSearchDAOImpl implements PlayerSearchDAO {

	@Override
	public Player getPlayerByContact(long contact) throws BusinessExceptions {
		Player player = null;
		try (Connection connection = PostgresSqlConnection.getConnection()) {
			String sql = "select id, name, age, gender, teamname, contact, dob from player where contact=?";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setLong(1, contact);
			ResultSet resultSet = preparedStatement.executeQuery();
			if (resultSet.next()) {
				player = new Player();
				player.setId(resultSet.getInt("id"));
				player.setName(resultSet.getString("name"));
				player.setAge(resultSet.getInt("age"));
				player.setGender(resultSet.getString("gender"));
				player.setContact(resultSet.getLong("contact"));
				player.setTeamname(resultSet.getString("teamname"));
				player.setDob(resultSet.getDate("dob"));
			} else {
				throw new BusinessExceptions("No Player found with contact " + contact);
			}
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println(e);// take it off when app is live
			throw new BusinessExceptions("Internal error occured contact SYSADMIN");
		}

		return player;
	}

	@Override
	public List<Player> getPlayersByGender(String gender) throws BusinessExceptions {
		List<Player> playersList = new ArrayList<>();
		try (Connection connection = PostgresSqlConnection.getConnection()) {
			String sql = "select id,name, age, gender, teamname, contact, dob from player where gender=? ";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, gender);
			ResultSet resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				Player player = new Player();
				player.setId(resultSet.getInt("id"));
				player.setName(resultSet.getString("name"));
				player.setAge(resultSet.getInt("age"));
				player.setGender(resultSet.getString("gender"));
				player.setContact(resultSet.getLong("contact"));
				player.setTeamname(resultSet.getString("teamname"));
				player.setDob(resultSet.getDate("dob"));
				playersList.add(player);
			}
			if (playersList.size() == 0) {
				throw new BusinessExceptions("No Players found in the DB with gender " + gender);
			}
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println(e);// take it off when app is live
			throw new BusinessExceptions("Internal error occured contact SYSADMIN");
		}

		return playersList;
	}

}
