package com.app.main;

import java.util.List;
import java.util.Scanner;

import com.app.exception.BusinessExceptions;
import com.app.model.Player;
import com.app.service.PlayerSearchService;
import com.app.service.impl.PlayerSearchServiceImpl;

public class PlayerSearchMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to PlayerSearch app V1.0");
		System.out.println("---------------------------------------");
		int ch = 0;
		PlayerSearchService playerSearchService = new PlayerSearchServiceImpl();
		do {
			System.out.println("PLAYER SEARCH MENU");
			System.out.println("=======================");
			System.out.println("1) By Id");
			System.out.println("2) By Contact Number");
			System.out.println("3) By Age");
			System.out.println("4) By Gender");
			System.out.println("5) By TeamName");
			System.out.println("6) By Dob");
			System.out.println("7) By Player Name");
			System.out.println("8) Show All Players");
			System.out.println("9) EXIT");
			System.out.println("Please enter appropiate choice between 1-9");
			try {
				ch = Integer.parseInt(sc.nextLine());
			} catch (NumberFormatException e) {
				System.out.println(e.getMessage());
			}

			switch (ch) {
			case 1:
				System.out.println("Enter player Id to get player details");
				try {
					int id = Integer.parseInt(sc.nextLine());
					// code to service
					Player player = playerSearchService.getPlayerById(id);
					if (player != null) {
						System.out.println("Player found with id: " + id + " details of the players is: ");
						System.out.println(player);
					}
				} catch (NumberFormatException e) {
					System.out.println("Player id cannot be special chars or symbols or white spaces, it is numeric");
				} catch (BusinessExceptions e) {
					System.out.println(e.getMessage());
				}
				break;
			case 2:
				System.out.println("Enter player contact to get player details");
				try {
					long contact = Long.parseLong(sc.nextLine());
					Player player = playerSearchService.getPlayerbyContact(contact);
					if (player != null) {
						System.out.println("Player found with contact: " + contact + " details of the players is: ");
						System.out.println(player);
					}
				} catch (NumberFormatException e) {
					System.out.println("Player contact cannot be special chars or symbols or white spaces, it is numeric");
				} catch (BusinessExceptions e) {
					System.out.println(e.getMessage());
				}
				
				break;
			case 3:

				try {
					System.out.println("Enter Player Age to get all the players matching with that age");
					int age = Integer.parseInt(sc.nextLine());
					List<Player> agePlayersList = playerSearchService.getPlayersByAge(age);
					if (agePlayersList != null && agePlayersList.size() > 0) {
						System.out.println("There are " + agePlayersList.size() + " no of player/s...with age = " + age
								+ " Printing their details.....");
						for (Player p : agePlayersList) {
							System.out.println(p);
						}
					}
				} catch (NumberFormatException e) {
					System.out.println("Age cannot have special chard or spaces or alphabets");
				} catch (BusinessExceptions e) {
					System.out.println(e.getMessage());
				}
				break;
			case 4:
				System.out.println("Enter gender to get all the players matching with that age");
				String gender = sc.nextLine();
				try {
					List<Player> genderPlayersList = playerSearchService.getPlayersByGender(gender);
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
				break;
			case 5:
				System.out.println("Enter TeamName to get all the players of that team");
				String teamname = sc.nextLine();
				try {
					List<Player> teamPlayersList = playerSearchService.getPlayersByTeamName(teamname);
					if (teamPlayersList != null && teamPlayersList.size() > 0) {
						System.out.println("There are " + teamPlayersList.size() + " no of player/s...with team = "
								+ teamname + " Printing their details.....");
						for (Player p : teamPlayersList) {
							System.out.println(p);
						}
					}
				} catch (BusinessExceptions e) {
					System.out.println(e.getMessage());
				}
				break;
			case 6:
				System.out.println("Enter date of birth to get all the players with that date of birth");
				String dob = sc.nextLine();
				try {
					List<Player> dobPlayersList = playerSearchService.getPlayersByDob(dob);
					if (dobPlayersList != null && dobPlayersList.size() > 0) {
						System.out.println("There are " + dobPlayersList.size() + " no of player/s...with date of birth = "
								+ dob + " Printing their details.....");
						for (Player p : dobPlayersList) {
							System.out.println(p);
						}
					}
				} catch (BusinessExceptions e1) {
					System.out.println(e1.getMessage());
				}
				break;
			case 7:
				System.out.println("Enter name to get the player with that name");
				String name = sc.nextLine();
				try {
					List<Player> namePlayersList = playerSearchService.getPlayersByName(name);
					if (namePlayersList != null && namePlayersList.size() > 0) {
						System.out.println("There are " + namePlayersList.size() + " no of player/s...with name "
								+ name + " Printing their details.....");
						for (Player p :namePlayersList) {
							System.out.println(p);
						}
					}
				} catch (BusinessExceptions e3) {
							System.out.println(e3.getMessage());
							
					 }
				break;
			case 8:
				System.out.println("Retrieving all the players from backend");
				try {
					List<Player> allPlayersList = playerSearchService.getAllPlayers();
					if (allPlayersList != null && allPlayersList.size() > 0) {
						System.out.println(
								"There are " + allPlayersList.size() + " no of player/s...Printing their details.....");
						for (Player p : allPlayersList) {
							System.out.println(p);
						}
					}
				} catch (BusinessExceptions e) {
					System.out.println(e.getMessage());
				}
				break;
			case 9:
				System.out.println("Thank you for using our PlayerSeach App V1.0");
				break;

			default:
				System.out.println("Invalid menu option");
				break;
			}

		} while (ch != 9);

	}
}
