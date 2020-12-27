package com.app.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.app.dao.PlayerCrudDAO;
import com.app.dao.dbutil.PostgresSqlConnection;
import com.app.exception.BusinessExceptions;
import com.app.model.Player;

public class PlayerCrudDAOImpl implements PlayerCrudDAO {

	public int createPlayer(Player player) throws BusinessExceptions {
		int c = 0;

		try (Connection connection = PostgresSqlConnection.getConnection()) {
			String sql = "insert into player(id, name, age, gender, teamname, contact, dob) values(?,?,?,?,?,?,?)";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, player.getId());
			preparedStatement.setString(2, player.getName());
			preparedStatement.setInt(3, player.getAge());
			preparedStatement.setString(4, player.getGender());
			preparedStatement.setString(5, player.getTeamname());
			preparedStatement.setLong(6, player.getContact());
			preparedStatement.setDate(7, new java.sql.Date(player.getDob().getTime()));// util date to sql date

			c = preparedStatement.executeUpdate();

		} catch (ClassNotFoundException | SQLException e) {
			System.out.println(e);// take it off when app is live
			throw new BusinessExceptions("Internal error occured contact SYSADMIN");
		}
		return c;
	}

	public void deletePlayer(int id) throws BusinessExceptions {
		int prep = 0;

		try (Connection connection = PostgresSqlConnection.getConnection()) {
			String sql = "delete from player where id=?";

			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, id);

			prep = preparedStatement.executeUpdate();

		} catch (ClassNotFoundException | SQLException e) {
			System.out.println(e);// take it off when app is live
			throw new BusinessExceptions("Internal error occured contact SYSADMIN");
		}

	}

	public int updatePlayerContact(int id, long newContact) throws BusinessExceptions {
		int p = 0;
		try (Connection connection = PostgresSqlConnection.getConnection()) {
			String sql = "update player set contact=? where id=? ";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setLong(1, newContact);
			preparedStatement.setInt(2, id);

			p = preparedStatement.executeUpdate();

		} catch (ClassNotFoundException | SQLException e) {
			System.out.println(e);// take it off when app is live
			throw new BusinessExceptions("Internal error occured contact SYSADMIN");
		}

		return p;
	}

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

}
