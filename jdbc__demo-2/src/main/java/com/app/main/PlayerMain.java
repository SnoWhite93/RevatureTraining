package com.app.main;

import java.util.Date;
import java.util.List;

import com.app.dao.PlayerCrudDAO;
import com.app.dao.PlayerSearchDAO;
import com.app.dao.impl.PlayerCrudDAOImpl;
import com.app.dao.impl.PlayerSearchDAOImpl;
import com.app.exception.BusinessExceptions;
import com.app.model.Player;

public class PlayerMain {

	public static void main(String[] args) {

		PlayerCrudDAO dao = new PlayerCrudDAOImpl();
		PlayerSearchDAO dao2 = new PlayerSearchDAOImpl();
//		Player p = new Player(108, "Eric", 24, 9001312321L, "Rockers", "M", new Date());
//
//		try {
//			if (dao.createPlayer(p) != 0) {
//				System.out.println("Player created successfuly");
//			}
//		} catch (BusinessExceptions e) {
//			System.out.println(e.getMessage());
//		}

//   create player

		try {
			System.out.println("Creating player with id 109 ");
			Player pl = new Player(109, "Billy", 77, 2313131313L, "Bulls", "M", new Date());
			int newPlayer = dao.createPlayer(pl);
		} catch (BusinessExceptions e1) {
			System.out.println(e1.getMessage());
		}

//  display player
		try {
			System.out.println("Displaying player with id 109 ");
			Player player = dao.getPlayerById(109);
			if (player != null) {
				System.out.println("Details of player with id  " + player.getId());
				System.out.println(player);
			}
		} catch (BusinessExceptions e) {
			System.out.println(e.getMessage());
		}
//  update player
		try {
			dao.updatePlayerContact(109, 1111111111L);
		} catch (BusinessExceptions e) {
			System.out.println(e.getMessage());
		}
// get player by id
		try {
			Player player = dao.getPlayerById(109);
			if (player != null) {
				System.out.println("Details of player with id  " + player.getId());
				System.out.println(player);
			}
		} catch (BusinessExceptions e) {
			System.out.println(e.getMessage());
		}

// get all players
		try {
			List<Player> playersList = dao.getAllPlayers();
			if (playersList != null && playersList.size() != 0) {
				System.out.println("\n\nFound " + playersList.size() + " no of players in DB....Printing them all");
				for (Player p : playersList) {
					System.out.println(p);
				}
			}
		} catch (BusinessExceptions e) {
			System.out.println(e.getMessage());
		}

//  delete player
		try {
			dao.deletePlayer(109);
		} catch (BusinessExceptions e) {
			System.out.println(e.getMessage());
		}

// after player Billy with id 109 is deleted
		try {
			List<Player> playersList = dao.getAllPlayers();
			if (playersList != null && playersList.size() != 0) {
				System.out.println("\n\nFound " + playersList.size() + " no of players in DB....Printing them all");
				for (Player p : playersList) {
					System.out.println(p);
				}
			}
		} catch (BusinessExceptions e) {
			System.out.println(e.getMessage());
		}
// find player after contact
		try {

			long contact = 2234567899L;
			Player player = dao2.getPlayerByContact(contact);
			if (player != null) {
				System.out.println("Player found with contact: " + contact + " details of the players is: ");
				System.out.println(player);
			}
		} catch (NumberFormatException e) {
			System.out.println("Player contact cannot be special chars or symbols or white spaces, it is numeric");
		} catch (BusinessExceptions e) {
			System.out.println(e.getMessage());
		}
		
// get players by gender
		try {
			String gender = "M";
			List<Player> genderPlayersList = dao2.getPlayersByGender(gender);
			if (genderPlayersList != null && genderPlayersList.size() > 0) {
				System.out.println("There are " + genderPlayersList.size() + " no of player/s...with gender = "
						+ gender + " Printing their details.....");
				for (Player p : genderPlayersList) {
					System.out.println(p);
				}
			}
		} catch (BusinessExceptions e2) {
			System.out.println(e2.getMessage());
		}
	}
}
