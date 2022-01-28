
//Group 5 
// Student 1 : Manal Fathi 		1706943
// Student 2 : Mashail Alghamdi 1876100
// Student 3 : Ashjan Alomar 	1809839
import java.util.*;

public class MonopolyGame {
    private static ArrayList<Player> players = new ArrayList<Player>();
    private Bank bankBalance = Bank.getBank();
    private static Board board = OriginalBoard.getOriginalBoard();
    private static int diceNumber=0;
    private static Player currentPlayer = null;
    private static Player secondPlayer = null;

    
    public static void main(String[] args) {

    	printStartGameMenu();
        
    }
    
    public static void printStartGameMenu(){
    	System.out.println("************ Welcome to Monopoly Game Have fun!************\n");
    	System.out.println("\n|-------------- 1- Start the game --------------|");
        System.out.println("|-------------- 2- End the game   --------------|\n");
        
        Scanner input = new Scanner(System.in);
        int option = input.nextInt();
        
        switch (option) {
        case 1:
        	System.out.println("************ Game is about to start! ************\n");
        	createPlayers();
        	printBoardMenu();
            printGameMenu();
            break;
        case 2:
            endGame();
            printStartGameMenu();
            break;
            
        default:
            System.out.println("\n|---------Invalid option!! Please choose again!!------|\n");
            printStartGameMenu();    
            
    }
}
    
    public static void createPlayers(){
        
        Scanner input = new Scanner(System.in);    
        String name;
        
        System.out.println("|-------------- Please Enter player 1 name: --------------|\n"); // check if its null 
        name= input.next();
        
        while(!name.matches("^[a-zA-Z]{1}[a-zA-Z0-9]{1,7}$") || name == null ){
            System.out.println("-Invalid input!! Name should be at max 8 charachters and should start with a letter");
            System.out.println("|-------------- Please Enter player 1 name: --------------|\n"); // check if its null 

            name= input.next();
        }
        Player player1= new Player(name);
        
        System.out.println("\n|-------------- Please Enter player 2 name: --------------|\n");
        name= input.next();
        while(!name.matches("^[a-zA-Z]{1}[a-zA-Z0-9]{1,7}$") || name == null ){
        	  System.out.println("-Invalid input!! Name should be at max 8 charachters and should start with a letter");
              System.out.println("|-------------- Please Enter player 2 name: --------------|\n"); // check if its null 

        	name= input.next();
        }
        Player player2= new Player(name);
        
        players.add(player1);
        players.add(player2);
    
    }
    
    public static void printBoardMenu(){
    	Scanner input = new Scanner(System.in);
    	 
        System.out.println("|-------------- Choose board style : --------------|\n"); 
        System.out.println("|-------------- 1-Lined Board --------------|\n"); 
        System.out.println("|-------------- 2-Dotted Board --------------|\n"); 
     	System.out.println("\n\n|-------------- Enter 1 for dotted board or 2 for lined board--------------|");
        int option = input.nextInt();

    	 while( !(option==1 || option==2)){
            System.out.println("|---------Invalid input! Please choose again!---------|\n");
         	System.out.println("\n|-------------- Enter 1 for dotted board or 2 for lined board--------------|");
             option = input.nextInt();
         }
    	 
    	if (option==1) 
    	    board = OriginalBoard.getOriginalBoard() ;

    	else
    	    board = DecoratedBoard.getDecoratedBoard(OriginalBoard.getOriginalBoard()) ;
 
    	
    }

    public static void printGameMenu(){
        //number 3 in the doc
        System.out.println("\n|-------------- 1- Select a player to play. --------------|");
        System.out.println("|-------------- 2- Print the board.         --------------|");
        System.out.println("|-------------- 3- End the game.            --------------|\n");

        Scanner input = new Scanner(System.in);
        int option = input.nextInt();
        
        switch (option) {
            case 1:
                printPlayerMenu();
                System.out.println("\n|-------------- Please choose player number:--------------|\n");
                int playerNumber = input.nextInt();
                while( !(playerNumber==1 || playerNumber==2)){
                    System.out.println("|---------Invalid player number! Please chose again!------|\n");
                    printPlayerMenu();
                    playerNumber = input.nextInt();
                }
                
                currentPlayer=players.get(playerNumber-1);
                if (players.get(0).equals(currentPlayer)){
                    secondPlayer=players.get(1);
                }
                else {
                    secondPlayer=players.get(0);
                }
                
                printPlayerInformation();
                printPlayerStartMenu();
                
                break;
            case 2:
                board.printBoard();
                printGameMenu();
                break;
            case 3:
                endGame();
                printGameMenu();
                break;
                
            default:
                System.out.println("\n|---------Invalid option!! Please choose again!!------|\n");
                printGameMenu();    
                
        }
    }
    
    public static void printPlayerMenu(){
        //number 4 in the doc
        for ( int i = 0 ; i<players.size();i++){
            System.out.println((i+1)+")"+players.get(i).getName());
        }
        
    }
        
    public static void printPlayerStartMenu(){
        //number 5 in the doc
        
        Scanner input = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);
        
        System.out.println("\n|-------------- 1- Roll a dice.             --------------|");
        System.out.println("|-------------- 2- Print a board.           --------------|");
        System.out.println("|-------------- 3- Send message to chat room.           --------------|");       
        System.out.println("|-------------- 4- End the game.            --------------|\n");

        int option = input.nextInt();
        switch (option) {
            case 1: //roll a dice
                diceNumber = rollDice();
                System.out.println("\n|**************          Dice is "+ diceNumber+"          **************|\n");
                
                if (currentPlayer.getLocation().getName().equalsIgnoreCase("in jail")){
                	currentPlayer.getLocation().makeAction(currentPlayer,secondPlayer);
                }
                else{
                    currentPlayer.changeLocation(diceNumber);
                	currentPlayer.getLocation().makeAction(currentPlayer,secondPlayer);
                }
                
                printPlayerInformation();
                
                
                currentPlayer.checkBalance();
                checkPassGo();
                changePlayerMenu();
                break;
            case 2: //print a board
                board.printBoard();
                break;
            case 3:
            	System.out.println("|-------------- Enter Your Message Please:          --------------|");
            	String message = input2.nextLine();
            	currentPlayer.sendMessage(message);
                printPlayerStartMenu();
            	break;
            case 4:
                endGame();
                printPlayerStartMenu();
                break;
                
            default:
                System.out.println("\n|---------Invalid option!! Please choose again!!----------|\n");
                printPlayerStartMenu();
        }
    }
    
    public static void changePlayerMenu(){
        System.out.println("\n|-------------- 1- Seconed Player.          --------------|");
        System.out.println("|-------------- 2- Print the board.         --------------|");
        System.out.println("|-------------- 3- Send message to chat room.           --------------|");       
        System.out.println("|-------------- 4- End the game.            --------------|\n");
        
        Scanner input = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);

        int option = input.nextInt();
        
        switch (option) {
            case 1: 
                if(players.get(0)== currentPlayer) {
                    currentPlayer = players.get(1);
                    secondPlayer = players.get(0);
                }
                else {
                    currentPlayer=players.get(0);
                    secondPlayer = players.get(1);
                }
                printPlayerStartMenu();
                break;
            case 2:
                board.printBoard();
                changePlayerMenu();
                break;
            case 3:
            	System.out.println("|-------------- Enter Your Message Please:          --------------|");
            	String message = input2.nextLine();
            	currentPlayer.sendMessage(message);
            	changePlayerMenu();
            	break;
            case 4:
                endGame();
                changePlayerMenu();
                break;
                
            default:
                System.out.println("\n|---------Invalid option!! Please choose again!!------|\n");
                changePlayerMenu();   
                
        }
    }
    
    public static int rollDice(){
            int die1,die2;
            
            die1 = (int)(Math.random()*6) + 1;
            die2 = (int)(Math.random()*6) + 1;
            System.out.println("|**************     First dice is  "+die1+"        **************|");
            System.out.println("|**************     Seconed dice is "+die2+"      **************|");
      
            return (die1+die2);
        }
           
    public static void printPlayerInformation(){
            currentPlayer.printPlayerInformation();
            System.out.println("\n|**************      Bank balance: " + Bank.getAmount()+"$      **************|\n");
    }    
    
    public static void endGame(){ //print player all information 
    
    Scanner input = new Scanner(System.in);
    for(int i = 0 ; i < players.size();i++){
        players.get(i).printPlayerInformation();
    }
    System.out.println("\n|---------Are you sure you want to end the game ?---------|\n ");
    System.out.println("\n|---------    		Enter yes or no    	  ---------|\n ");

    do{
            String answer = input.next();

    if (answer.equalsIgnoreCase("Yes")){
        System.out.println("\n|--------------       End of the game       --------------|\n");
        System.exit(0); 
    }
    if (answer.equalsIgnoreCase("No"))
        return;
    else
        System.out.println("\n|--------------     Invalid input, choose again     --------------|\n");
    }while(true);
    
    }
    
    public static void checkPassGo(){
        if (players.get(0).getPassGo()&&players.get(1).getPassGo()) {
        	      System.out.println("\n|--------------       End of the game       --------------|\n");
        	      System.exit(0);         }
        else
            return;
    }
    
    }
    
