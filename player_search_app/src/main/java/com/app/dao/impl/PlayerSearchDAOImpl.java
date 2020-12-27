package com.app.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import com.app.dao.PlayerSearchDAO;
import com.app.dao.dbutil.PostgresSqlConnection;
import com.app.exception.BusinessExceptions;
import com.app.model.Player;

public class PlayerSearchDAOImpl implements PlayerSearchDAO {

	@Override
	public Player getPlayerById(int id) throws BusinessExceptions {
		Player player = null;
		try (Connection connection = PostgresSqlConnection.getConnection()) {
			String sql = "select name, age, gender, teamname, contact, dob from player where id=?";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, id);
			ResultSet resultSet = preparedStatement.executeQuery();
			if (resultSet.next()) {
				player = new Player();
				player.setId(id);
				player.setName(resultSet.getString("name"));
				player.setAge(resultSet.getInt("age"));
				player.setGender(resultSet.getString("gender"));
				player.setContact(resultSet.getLong("contact"));
				player.setTeamname(resultSet.getString("teamname"));
				player.setDob(resultSet.getDate("dob"));
			} else {
				throw new BusinessExceptions("No Player found with Id " + id);
			}
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println(e);// take it off when app is live
			throw new BusinessExceptions("Internal error occured contact SYSADMIN");
		}

		return player;
	}

	@Override
	public Player getPlayerbyContact(long contact) throws BusinessExceptions {
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
	public List<Player> getAllPlayers() throws BusinessExceptions {
		List<Player> playersList = new ArrayList<>();
		try (Connection connection = PostgresSqlConnection.getConnection()) {
			String sql = "select id,name, age, gender, teamname, contact, dob from player ";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
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
				throw new BusinessExceptions("No Players in the DB so far");
			}
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println(e);// take it off when app is live
			throw new BusinessExceptions("Internal error occured contact SYSADMIN");
		}

		return playersList;
	}

	@Override
	public List<Player> getPlayersByAge(int age) throws BusinessExceptions {
		List<Player> playersList = new ArrayList<>();
		try (Connection connection = PostgresSqlConnection.getConnection()) {
			String sql = "select id,name, age, gender, teamname, contact, dob from player where age=? ";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, age);
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
				throw new BusinessExceptions("No Players found in the DB with age " + age);
			}
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println(e);// take it off when app is live
			throw new BusinessExceptions("Internal error occured contact SYSADMIN");
		}

		return playersList;
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

	@Override
	public List<Player> getPlayersByTeamName(String teamname) throws BusinessExceptions {

		List<Player> playersList = new ArrayList<>();
		try (Connection connection = PostgresSqlConnection.getConnection()) {
			String sql = "select id,name, age, gender, teamname, contact, dob from player where teamname=? ";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, teamname);
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
				throw new BusinessExceptions("No Players found in the DB with teamname " + teamname);
			}
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println(e);// take it off when app is live
			throw new BusinessExceptions("Internal error occured contact SYSADMIN");
		}

		return playersList;
	}

	@Override
	public List<Player> getPlayersByName(String name) throws BusinessExceptions {
		List<Player> playersList = new ArrayList<>();
		try (Connection connection = PostgresSqlConnection.getConnection()) {
			String sql = "select id,name, age, gender, teamname, contact, dob from player where name=? ";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, name);
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
				throw new BusinessExceptions("No Players found in the DB with name " + name);
			}
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println(e);// take it off when app is live
			throw new BusinessExceptions("Internal error occured contact SYSADMIN");
		}

		return playersList;
	}

	@Override
	public List<Player> getPlayersByDob(String dob) throws BusinessExceptions {
		List<Player> playersList = new ArrayList<>();
		
		try (Connection connection = PostgresSqlConnection.getConnection()) {
			String sql = "select id,name, age, gender, teamname, contact, dob from player where dob=? ";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			java.sql.Date birthDate2 = null;
			try {
				Date birthDate = new SimpleDateFormat("yyyy-MM-dd").parse(dob);
				 birthDate2 = new java.sql.Date(birthDate.getTime());
			} catch (ParseException e) {
				System.out.println(e.getMessage());
				throw new BusinessExceptions("Date format is not valid");
			}
			preparedStatement.setDate(1, birthDate2 );
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
				throw new BusinessExceptions("No Players found in the DB with date of birth " + dob);
			}
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println(e);// take it off when app is live
			throw new BusinessExceptions("Internal error occured contact SYSADMIN");
		}

		return playersList;
	}

}
