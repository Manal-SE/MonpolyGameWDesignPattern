
//Group 5 
// Student 1 : Manal Fathi 		1706943
// Student 2 : Mashail Alghamdi 1876100
// Student 3 : Ashjan Alomar 	1809839


public class OriginalBoard implements Board {

	public static Cell[][] gameBoard = new Cell[10][10];
	private static OriginalBoard board = null;
	


	private OriginalBoard() {
		createBoard();
	}
	
	public static OriginalBoard getOriginalBoard() {
		if (board==null)
			return new OriginalBoard();
		else
			return board;
	}
	
	
	public Cell[][] getGameBoard() {
		return gameBoard;
	}

	
	@Override
	public void createBoard() {

		gameBoard[0][0] = new Command("Go", 0, 0);
		gameBoard[0][1] = new Purchased("White House", 0, 1, null, 300);
		gameBoard[0][2] = new Purchased("Chica go avenue", 0, 2, null, 300);
		gameBoard[0][3] = new Purchased("Texas Avenue", 0, 3, null, 300);
		gameBoard[0][4] = new Purchased("Utility", 0, 4, null, 100);
		gameBoard[0][5] = new Purchased("College Avenue", 0, 5, null, 300);
		gameBoard[0][6] = new Purchased("Burger King", 0, 6, null, 300);
		gameBoard[0][7] = new Command("Nothing", 0, 7);
		gameBoard[0][8] = new Purchased("Holiday inn Hotel", 0, 8, null, 300);
		gameBoard[0][9] = new Command("Go to Jail", 0, 9);
		gameBoard[1][0] = new Purchased("Mall of Arabia", 1, 0, null, 300);
		gameBoard[1][9] = new Command("Roll again", 1, 9);
		gameBoard[2][0] = new Command("Roll again", 2, 0);
		gameBoard[2][9] = new Renting("Blue Mosque", 2, 9, 5);
		gameBoard[3][0] = new Purchased("Washington Avenue", 3, 0, null, 300);
		gameBoard[3][9] = new Purchased("Railroads", 3, 9, null, 100);
		gameBoard[4][0] = new Purchased("Yellow House", 4, 0, null, 300);
		gameBoard[4][9] = new Taxes("Luxury tax", 4, 9, 0.12);
		gameBoard[5][0] = new Purchased("Sheraton Hotel", 5, 0, null, 300);
		gameBoard[5][9] = new Renting("City Park", 5, 9, 20);
		gameBoard[6][0] = new Command("Nothing", 6, 0);
		gameBoard[6][9] = new Command("Nothing", 6, 9);
		gameBoard[7][0] = new Command("Swap", 7, 0);
		gameBoard[7][9] = new Command("Give half of your money", 7, 9);
		gameBoard[8][0] = new Renting("Mosque", 8, 0, 5);
		gameBoard[8][9] = new Renting("Mosque", 8, 9, 5);
		gameBoard[9][0] = new Command("In Jail", 9, 0);
		gameBoard[9][1] = new Purchased("Hilton Hotel", 9, 1, null, 300);
		gameBoard[9][2] = new Purchased("Blue house", 9, 2, null, 300);
		gameBoard[9][3] = new Purchased("Red house", 9, 3, null, 300);
		gameBoard[9][4] = new Command("Nothing", 9, 4);
		gameBoard[9][5] = new Renting("Marvin Garden", 9, 5, 20);
		gameBoard[9][6] = new Taxes("Income Tax", 9, 6, 0.7);
		gameBoard[9][7] = new Purchased("Colorado Avenue", 9, 7, null, 300);
		gameBoard[9][8] = new Purchased("New York Avenue", 9, 8, null, 300);
		gameBoard[9][9] = new Command("Free Parking", 9, 9);

	}

	public static Cell getCellByIndex(int x, int y) {
		return gameBoard[x][y];

	}

	@Override
	public void printBoard() {

		System.out.print("\n");
		System.out.print("___________________________________________________");
		System.out.print("___________________________________________________");
		System.out.print("___________________________________________________");
		System.out.println("_____________________________________");

		for (int i = 0; i < 1; i++) {
			for (int j = 0; j < gameBoard[i].length; j++) {
				if (j == 0) {
					System.out.print("| " + gameBoard[i][j].getName() + "                  " + "|" + "   ");

				} else {
					System.out.print(gameBoard[i][j].getName() + "   " + "|" + "   ");
				}
			}

			System.out.print("\n");
			System.out.print("___________________________________________________");
			System.out.print("___________________________________________________");
			System.out.print("___________________________________________________");
			System.out.println("_____________________________________");

			// ثاني سطر
			for (i = 1; i < 2; i++) {
				for (int j = 0; j < gameBoard[i].length; j++) {
					if (gameBoard[i][j] == null) {
						System.out.print("\t               ");
					} else {
						if (j == 9) {
							System.out.print("\t            |    ");
							System.out.print(gameBoard[i][j].getName() + "  " + "|" + "  ");
						} else {
							System.out.print("|  " + gameBoard[i][j].getName() + "  " + "   |  ");
						}

					}
				}
				// الخطوط بعد ثاني سطر
				System.out.print("\n");
				System.out.print("_______________________");
				System.out.print("\t                                          ");
				System.out.print("\t                                          ");
				System.out.print("\t                                          ");
				System.out.println("          __________________");

			}
			// ثالث سطر
			for (i = 2; i < 3; i++) {
				for (int j = 0; j < gameBoard[i].length; j++) {
					if (gameBoard[i][j] == null) {
						System.out.print("\t               ");
					} else {
						if (j == 9) {
							System.out.print("\t            |    ");
							System.out.print(gameBoard[i][j].getName() + " " + "|");
						} else {
							System.out.print("| " + gameBoard[i][j].getName() + "          " + "|" + "  ");
						}

					}
				}
				// الخطوط بعد ثالث سطر
				System.out.print("\n");
				System.out.print("_______________________");
				System.out.print("\t                                          ");
				System.out.print("\t                                          ");
				System.out.print("\t                                          ");
				System.out.println("          __________________");

			}
			// رابع سطر
			for (i = 3; i < 4; i++) {
				for (int j = 0; j < gameBoard[i].length; j++) {
					if (gameBoard[i][j] == null) {
						System.out.print("\t               ");
					} else {
						if (j == 9) {
							System.out.print("\t            |    ");
							System.out.print(gameBoard[i][j].getName() + "   " + "|" + "   ");
						} else {
							System.out.print("| " + gameBoard[i][j].getName() + "   " + "|" + "    ");
						}

					}
				}
				// الخطوط بعد رابع سطر
				System.out.print("\n");
				System.out.print("_______________________");
				System.out.print("\t                                          ");
				System.out.print("\t                                          ");
				System.out.print("\t                                          ");
				System.out.println("          __________________");
			}
			// 5 سطر
			for (i = 4; i < 5; i++) {
				for (int j = 0; j < gameBoard[i].length; j++) {
					if (gameBoard[i][j] == null) {
						System.out.print("\t               ");
					} else {
						if (j == 9) {
							System.out.print("\t            |   ");
							System.out.print(gameBoard[i][j].getName() + "   " + "|" + "   ");
						} else {
							System.out.print("| " + gameBoard[i][j].getName() + "        " + "|" + "    ");
						}

					}
				}
				// الخطوط بعد 5 سطر
				System.out.print("\n");
				System.out.print("_______________________");
				System.out.print("\t                                          ");
				System.out.print("\t                                          ");
				System.out.print("\t                                          ");
				System.out.println("          __________________");
			}
			// 6 سطر
			for (i = 5; i < 6; i++) {
				for (int j = 0; j < gameBoard[i].length; j++) {
					if (gameBoard[i][j] == null) {
						System.out.print("\t               ");
					} else {
						if (j == 9) {
							System.out.print("\t            |   ");
							System.out.print(gameBoard[i][j].getName() + "    " + "|" + "     ");
						} else {
							System.out.print("| " + gameBoard[i][j].getName() + "      " + "|" + "    ");
						}

					}
				}
				// الخطوط بعد 6 سطر
				System.out.print("\n");
				System.out.print("_______________________");
				System.out.print("\t                                          ");
				System.out.print("\t                                          ");
				System.out.print("\t                                          ");
				System.out.println("          __________________");
			}

			// 7 سطر
			for (i = 6; i < 7; i++) {
				for (int j = 0; j < gameBoard[i].length; j++) {
					if (gameBoard[i][j] == null) {
						System.out.print("\t               ");
					} else {
						if (j == 9) {
							System.out.print("\t            |   ");
							System.out.print(gameBoard[i][j].getName() + "       " + "|");
						} else {
							System.out.print("|      " + gameBoard[i][j].getName() + "        " + "|" + "    ");
						}

					}
				}
				// الخطوط بعد 7 سطر
				System.out.print("\n");
				System.out.print("_______________________");
				System.out.print("\t                                          ");
				System.out.print("\t                                          ");
				System.out.print("\t                                          ");
				System.out.println("          __________________");
			}

			// 8 سطر
			for (i = 7; i < 8; i++) {
				for (int j = 0; j < gameBoard[i].length; j++) {
					if (gameBoard[i][j] == null) {
						System.out.print("\t               ");
					} else {
						if (j == 9) {
							System.out.print("\t            |   ");
							System.out.print(gameBoard[i][j].getName() + "   " + "|" + "     ");
						} else {
							System.out.print("|     " + gameBoard[i][j].getName() + "            " + "|" + "    ");
						}

					}
				}
				// الخطوط بعد 8 سطر
				System.out.print("\n");
				System.out.print("_______________________");
				System.out.print("\t                                          ");
				System.out.print("\t                                          ");
				System.out.print("\t                                          ");
				System.out.println("          __________________");
			}

			// 9 سطر
			for (i = 8; i < 9; i++) {
				for (int j = 0; j < gameBoard[i].length; j++) {
					if (gameBoard[i][j] == null) {
						System.out.print("\t               ");
					} else {
						if (j == 9) {
							System.out.print("\t            |   ");
							System.out.print(gameBoard[i][j].getName() + "       " + "|" + "      ");
						} else {
							System.out.print("|     " + gameBoard[i][j].getName() + "          " + "|" + "    ");
						}

					}
				}
				// الخطوط بعد 9 سطر
				System.out.print("\n");
				System.out.print("___________________________________________________");
				System.out.print("___________________________________________________");
				System.out.print("___________________________________________________");
				System.out.println("_____________________________________");

			}

			for (i = 9; i < 10; i++) {
				for (int j = 0; j < gameBoard[i].length; j++) {
					if (j == 0) {
						System.out.print("| " + gameBoard[i][j].getName() + "             " + "|" + "   ");

					} else if (j == 8) {
						System.out.print(gameBoard[i][j].getName() + "      " + "|" + "   ");
					} else if (j == 9) {
						System.out.print(gameBoard[i][j].getName() + " " + "|");
					} else {
						System.out.print(gameBoard[i][j].getName() + "   " + "|" + "   ");
					}
				}
			}

			System.out.print("\n");
			System.out.print("___________________________________________________");
			System.out.print("___________________________________________________");
			System.out.print("___________________________________________________");
			System.out.println("_____________________________________");

			System.out.print("\n");

		}

	}


}