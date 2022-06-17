
import java.util.Scanner;

class Command extends Cell{
    
	
    public Command (String name,int cellNumberX,int cellNumberY) {
        setName(name);
        setCellNumberX(cellNumberX);
        setCellNumberY(cellNumberY);
        
}
   
    public void makeAction(Player currentPlayer, Player otherPlayer) {
          Player firstPlayer = currentPlayer;
          Player secondPlayer = otherPlayer;
          Command cell = (Command)firstPlayer.getLocation();
          
          if (cell.getName().equalsIgnoreCase("Go")) {
          	return;
              
          } else if (cell.getName().equalsIgnoreCase("Nothing") ){
              return;
          
          } else if (cell.getName().equalsIgnoreCase("Free Parking")) {
          	return;
          	
          } else if (cell.getName().equalsIgnoreCase("Roll again")) {
              int dice = MonopolyGame.rollDice();
              System.out.println("\n|**************          Dice is "+ dice+"          **************|\n");
              firstPlayer.changeLocation(dice);
              firstPlayer.getLocation().makeAction(firstPlayer, secondPlayer);
              return;
              
          } else if (cell.getName().equalsIgnoreCase("Go to Jail")) {
              firstPlayer.setLocation(OriginalBoard.getCellByIndex(9,0));

          } else if (cell.getName().equalsIgnoreCase("In Jail")) {
              firstPlayer.setLocation(OriginalBoard.getCellByIndex(0,0));
              int jailMoney = (int) (firstPlayer.getBalance() * 0.1);
              if(firstPlayer.getBalance()<0){
                  jailMoney*=-1;
              }
              firstPlayer.setBalance(firstPlayer.getBalance() - jailMoney);
              Bank.setAmount(Bank.getAmount() + jailMoney);
              firstPlayer.setPassGo(true);
              firstPlayer.setBalance(firstPlayer.getBalance() + 200);

                  
          } else if (cell.getName().equalsIgnoreCase("Give half of your money")) {
              int playerHalfMoney = (firstPlayer.getBalance())/2;
              firstPlayer.setBalance(playerHalfMoney);
              secondPlayer.setBalance(secondPlayer.getBalance() + playerHalfMoney);
 
          } else if (cell.getName().equals("Swap")) {

              Scanner input = new Scanner(System.in);

              if (!secondPlayer.getPlayerProperities().isEmpty() && !firstPlayer.getPlayerProperities().isEmpty()) {
                  System.out.println("|----------- List of second player properities:-----------|\n");
                  for (int i = 0; i < secondPlayer.getPlayerProperities().size(); i++) {
                      if (secondPlayer.getPlayerProperities().get(i).getName().equals("Utility") || secondPlayer.getPlayerProperities().get(i).getName().equals("Railroads")) {
                          System.out.println((i + 1) + ") ************** Properity Name :" + secondPlayer.getPlayerProperities().get(i).getName() + "\n************** Properity Cost : 100$");
                      } else {
                          System.out.println("************** Properity Name :" + secondPlayer.getPlayerProperities().get(i).getName() + "\n************** Properity Cost : 300$");
                      }
                  }
                  
                  System.out.println("|----- Enter the name of properity you want to take :-----|\n");
                  String properityTaken = input.nextLine();
                  for (int i = 0; i < secondPlayer.getPlayerProperities().size(); i++) {
                      if (properityTaken.equalsIgnoreCase(secondPlayer.getPlayerProperities().get(i).getName())) {
                          ((Purchased)secondPlayer.getPlayerProperities().get(i)).setOwner(firstPlayer);
                          firstPlayer.getPlayerProperities().add(secondPlayer.getPlayerProperities().get(i));
                          secondPlayer.getPlayerProperities().remove(i);
                          break;
                                       
                      }
                  }
                  
                  System.out.println("|--------------  List of your properities:  --------------|\n");
                  for (int i = 0; i < firstPlayer.getPlayerProperities().size(); i++) {
                      if (firstPlayer.getPlayerProperities().get(i).getName().equals("Utility") || firstPlayer.getPlayerProperities().get(i).getName().equals("Railroads")) {
                          System.out.println((i + 1) + ") Properity Name :" + firstPlayer.getPlayerProperities().get(i).getName() + ", Properity Cost : 100$");
                      } else {
                          
                          System.out.println("************** Properity Name :" + firstPlayer.getPlayerProperities().get(i).getName() + "\n ************** Properity Cost : 300$");
                      }
                  }
                  
                  System.out.println("|----Enter the name of properity you want to swap with:----|\n");
                  String properitySwapped = input.nextLine();
                  for (int i = 0; i < firstPlayer.getPlayerProperities().size(); i++) {
                      if (properitySwapped.equalsIgnoreCase(firstPlayer.getPlayerProperities().get(i).getName())) {
                          ((Purchased)firstPlayer.getPlayerProperities().get(i)).setOwner(secondPlayer);
                      }
                  }
                  
                  System.out.println("|----Your properties after the swap action----|");
                  for(int i=0; i<firstPlayer.getPlayerProperities().size(); i++){
                    System.out.println((i+1) +") "+firstPlayer.getPlayerProperities().get(i).getName());
                  }

                  System.out.println("|----Second Player properties after the swap action----|");
                  for(int i=0; i<secondPlayer.getPlayerProperities().size(); i++){
                    System.out.println((i+1) +") "+secondPlayer.getPlayerProperities().get(i).getName());
                  }

              } else {
                  System.out.println("|-- Player properities are empty cannot perform swap action\n");
              }

          } //end of swap

      } 
    
    

	@Override
	public void printCellInformation() {
		 System.out.println("\n|**************      Cell information:      **************|");
		    System.out.print("|--------------      Cell number ("+ getCellNumberX()+","+ getCellNumberY()+")");
		    System.out.print("      --------------|\n");
		    System.out.print("|--------------      Cell name : "+getName());
		    System.out.print(" --------------|\n");
		   
		    }
		    		
	}

    
    

