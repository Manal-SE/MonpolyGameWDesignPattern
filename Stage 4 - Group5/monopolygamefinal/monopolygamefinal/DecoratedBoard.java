
//Group 5 
// Student 1 : Manal Fathi 		1706943
// Student 2 : Mashail Alghamdi 1876100
// Student 3 : Ashjan Alomar 	1809839
public class DecoratedBoard implements Board{
	
	public static OriginalBoard decoratedBoard;
	private static DecoratedBoard board = null;
	
	private DecoratedBoard(OriginalBoard decoratedBoard) {
		this.decoratedBoard=decoratedBoard;
	}
	
	public static DecoratedBoard getDecoratedBoard(OriginalBoard decoratedBoard) {
		
		if (board==null)
			return new DecoratedBoard(decoratedBoard);
		else
			return board;
	}

	@Override
	public void createBoard() {
		decoratedBoard.createBoard();
		
	}

	public static Cell getCellByIndex(int x, int y) {
		
		return decoratedBoard.getCellByIndex(x, y);
		 
	}

	@Override
	public void printBoard() {
		
		
		System.out.print("\n");
        System.out.print("...................................................");
        System.out.print("...................................................");
        System.out.print("...................................................");
        System.out.println(".....................................");

        for (int i = 0; i < 1; i++) {
        for (int j = 0; j < decoratedBoard.gameBoard[i].length; j++) {
            if (j == 0) {
                System.out.print("| " + decoratedBoard.gameBoard[i][j].getName() + "                  " + "|" + "   ");

            } else {
                System.out.print(decoratedBoard.gameBoard[i][j].getName() + "   " + "|" + "   ");
            }
        }

        System.out.print("\n");
        System.out.print("...................................................");
        System.out.print("...................................................");
        System.out.print("...................................................");
        System.out.println(".....................................");
       
        // ثاني سطر
        for (i = 1; i < 2; i++) {
			for (int j = 0; j < decoratedBoard.gameBoard[i].length; j++) {
                if (decoratedBoard.gameBoard[i][j] == null) {
                    System.out.print("\t               ");
                } else {
                    if (j == 9) {
                        System.out.print("\t            |    ");
                        System.out.print(decoratedBoard.gameBoard[i][j].getName() + "  " + "|" + "  ");
                    } else {
                        System.out.print("|  " + decoratedBoard.gameBoard[i][j].getName() + "  " + "   |  ");
                    }

                }
            }
            // الخطوط بعد ثاني سطر
            System.out.print("\n");
            System.out.print(".......................");
            System.out.print("\t                                          ");
            System.out.print("\t                                          ");
            System.out.print("\t                                          ");
            System.out.println("          ..................");

        }
        // ثالث سطر
        for (i = 2; i < 3; i++) {
            for (int j = 0; j < decoratedBoard.gameBoard[i].length; j++) {
                if (decoratedBoard.gameBoard[i][j] == null) {
                    System.out.print("\t               ");
                } else {
                    if (j == 9) {
                        System.out.print("\t            |    ");
                        System.out.print(decoratedBoard.gameBoard[i][j].getName() + " " + "|");
                    } else {
                        System.out.print("| " + decoratedBoard.gameBoard[i][j].getName() + "          " + "|" + "  ");
                    }

                }
            }
            // الخطوط بعد ثالث سطر
             System.out.print("\n");
             System.out.print("......................");
            System.out.print("\t                                          ");
            System.out.print("\t                                          ");
            System.out.print("\t                                          ");
            System.out.println("          ..................");

        }
        // رابع سطر
        for (i = 3; i < 4; i++) {
            for (int j = 0; j < decoratedBoard.gameBoard[i].length; j++) {
                if (decoratedBoard.gameBoard[i][j] == null) {
                    System.out.print("\t               ");
                } else {
                    if (j == 9) {
                        System.out.print("\t            |    ");
                        System.out.print(decoratedBoard.gameBoard[i][j].getName() + "   " + "|" + "   ");
                    } else {
                        System.out.print("| " + decoratedBoard.gameBoard[i][j].getName() + "   " + "|" + "    ");
                    }

                }
            }
            // الخطوط بعد رابع سطر
            System.out.print("\n");
            System.out.print(".......................");
            System.out.print("\t                                          ");
            System.out.print("\t                                          ");
            System.out.print("\t                                          ");
            System.out.println("          ..................");

        }
        // 5 سطر
        for (i = 4; i < 5; i++) {
            for (int j = 0; j < decoratedBoard.gameBoard[i].length; j++) {
                if (decoratedBoard.gameBoard[i][j] == null) {
                    System.out.print("\t               ");
                } else {
                    if (j == 9) {
                        System.out.print("\t            |   ");
                        System.out.print(decoratedBoard.gameBoard[i][j].getName() + "   " + "|" + "   ");
                    } else {
                        System.out.print("| " + decoratedBoard.gameBoard[i][j].getName() + "        " + "|" + "    ");
                    }

                }
            }
            // الخطوط بعد 5 سطر
             System.out.print("\n");
            System.out.print(".......................");
            System.out.print("\t                                          ");
            System.out.print("\t                                          ");
            System.out.print("\t                                          ");
            System.out.println("          ..................");

        }
        // 6 سطر
        for (i = 5; i < 6; i++) {
            for (int j = 0; j < decoratedBoard.gameBoard[i].length; j++) {
                if (decoratedBoard.gameBoard[i][j] == null) {
                    System.out.print("\t               ");
                } else {
                    if (j == 9) {
                        System.out.print("\t            |   ");
                        System.out.print(decoratedBoard.gameBoard[i][j].getName() + "    " + "|" + "     ");
                    } else {
                        System.out.print("| " + decoratedBoard.gameBoard[i][j].getName() + "      " + "|" + "    ");
                    }

                }
            }
            // الخطوط بعد 6 سطر
             System.out.print("\n");
            System.out.print(".......................");
            System.out.print("\t                                          ");
            System.out.print("\t                                          ");
            System.out.print("\t                                          ");
            System.out.println("          ..................");

        }

        // 7 سطر
        for (i = 6; i < 7; i++) {
            for (int j = 0; j < decoratedBoard.gameBoard[i].length; j++) {
                if (decoratedBoard.gameBoard[i][j] == null) {
                    System.out.print("\t               ");
                } else {
                    if (j == 9) {
                        System.out.print("\t            |   ");
                        System.out.print(decoratedBoard.gameBoard[i][j].getName() + "       " + "|");
                    } else {
                        System.out.print("|      " + decoratedBoard.gameBoard[i][j].getName() + "        " + "|" + "    ");
                    }

                }
            }
            // الخطوط بعد 7 سطر
            System.out.print("\n");
            System.out.print(".......................");
            System.out.print("\t                                          ");
            System.out.print("\t                                          ");
            System.out.print("\t                                          ");
            System.out.println("          ..................");
        }

        // 8 سطر
        for (i = 7; i < 8; i++) {
            for (int j = 0; j < decoratedBoard.gameBoard[i].length; j++) {
                if (decoratedBoard.gameBoard[i][j] == null) {
                    System.out.print("\t               ");
                } else {
                    if (j == 9) {
                        System.out.print("\t            |   ");
                        System.out.print(decoratedBoard.gameBoard[i][j].getName() + "   " + "|" + "     ");
                    } else {
                        System.out.print("|     " + decoratedBoard.gameBoard[i][j].getName() + "            " + "|" + "    ");
                    }

                }
            }
            // الخطوط بعد 8 سطر
            System.out.print("\n");
            System.out.print(".......................");
            System.out.print("\t                                          ");
            System.out.print("\t                                          ");
            System.out.print("\t                                          ");
            System.out.println("          ..................");

        }

        // 9 سطر
        for (i = 8; i < 9; i++) {
            for (int j = 0; j < decoratedBoard.gameBoard[i].length; j++) {
                if (decoratedBoard.gameBoard[i][j] == null) {
                    System.out.print("\t               ");
                } else {
                    if (j == 9) {
                        System.out.print("\t            |   ");
                        System.out.print(decoratedBoard.gameBoard[i][j].getName() + "       " + "|" + "      ");
                    } else {
                        System.out.print("|     " + decoratedBoard.gameBoard[i][j].getName() + "          " + "|" + "    ");
                    }

                }
            }
            // الخطوط بعد 9 سطر
             System.out.print("\n");
             System.out.print("...................................................");
             System.out.print("...................................................");
             System.out.print("...................................................");
             System.out.println(".....................................");

        }

        for (i = 9; i < 10; i++) {
            for (int j = 0; j < decoratedBoard.gameBoard[i].length; j++) {
                if (j == 0) {
                    System.out.print("| " + decoratedBoard.gameBoard[i][j].getName() + "             " + "|" + "   ");

                } else if (j == 8) {
                    System.out.print(decoratedBoard.gameBoard[i][j].getName() + "      " + "|" + "   ");
                } else if (j == 9) {
                    System.out.print(decoratedBoard.gameBoard[i][j].getName() + " " + "|");
                } else {
                    System.out.print(decoratedBoard.gameBoard[i][j].getName() + "   " + "|" + "   ");
                }
            }
        }

        System.out.print("\n");
        System.out.print("...................................................");
        System.out.print("...................................................");
        System.out.print("...................................................");
        System.out.println(".....................................");
        System.out.print("\n");

    }

}
		
}