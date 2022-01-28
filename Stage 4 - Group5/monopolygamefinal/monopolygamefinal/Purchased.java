
//Group 5 
// Student 1 : Manal Fathi 		1706943
// Student 2 : Mashail Alghamdi 1876100
// Student 3 : Ashjan Alomar 	1809839
import java.util.Scanner;

public class Purchased extends Cell {
	   
	private Player owner;
	private int price;
	
   
	public Purchased (String name,int cellNumberX,int cellNumberY, Player owner, int price) {
        setName(name);
        setCellNumberX(cellNumberX);
        setCellNumberY(cellNumberY);
        this.owner = owner;
        this.price = price;
        
}
	
   public Player getOwner() {
		return owner;
	}

   public void setOwner(Player ownerName) {
		this.owner = ownerName;
	} 
	 
   public int getPrice() {
			return price;
		}
	
   public void setPrice(int price) {
			this.price = price;
		}
   
   public static int purchaseOffer(int price) {

       Scanner input = new Scanner(System.in);
       System.out.println("|---Do you want to buy it? It costs "+price+" ---|");
       System.out.println("|---Enter 1 for yes, and 2 for no ---|\\n");
       int answer = input.nextInt();
       return answer;
   }
   
   public  void makeAction(Player currentPlayer, Player otherPlayer) {
	   int answer;
       Player firstPlayer = currentPlayer;
       Player secondPlayer = otherPlayer;
       Purchased cell = (Purchased) firstPlayer.getLocation();
       
       if (cell.getOwner() == null) {
           do {
               answer = purchaseOffer(cell.getPrice());
               if (answer == 1) {
               		if (firstPlayer.getBalance()< cell.getPrice()){
                           System.out.print("|-------------- Sorry your balance doesnt allow you to pay --------------|\n");
                           return;
                           }
               		else {
               			firstPlayer.setBalance(firstPlayer.getBalance() -  cell.getPrice());
               			firstPlayer.getPlayerProperities().add(cell);
	               		cell.setOwner(firstPlayer);  
	               		System.out.println("******Congrats you own the " + cell.getName() + " now!!******");
	                    return;
               		}
               	           
               } else if (answer == 2) {
                   return;
               } else 
                   System.out.println("|-------------- You entered invalid number! --------------|\n");
               
           } while (answer != 1 || answer != 2);
           
       } else if (cell.getOwner()!= null) { // if it has owner
           if (cell.getOwner().equals(secondPlayer) ) {
               if (cell.getPrice()==100) {  //utility or Railroads
                       firstPlayer.setBalance(firstPlayer.getBalance() - 50);
                       secondPlayer.setBalance(secondPlayer.getBalance() + 50);
                       
               } else {
                           //property 
                           firstPlayer.setBalance(firstPlayer.getBalance() - 200);
                           secondPlayer.setBalance(secondPlayer.getBalance() + 200);               
                  }
               
           } else {
                   System.out.println("|--------------      You own this cell.      --------------|\n");
                   return;
               }

           }

       } // end of purchased if

	@Override
	public void printCellInformation() {
		 System.out.println("\n|**************      Cell information:      **************|");
		    System.out.print("|--------------      Cell number ("+ getCellNumberX()+","+ getCellNumberY()+")");
		    System.out.print("      --------------|\n");
		    System.out.print("|--------------      Cell name : "+getName());
		    System.out.print(" --------------|\n");
		    if (getOwner()==null)
		    	return;
		    else {
		        System.out.print("|--------------      Owner name : ");
		    	System.out.print(getOwner().getName());
		    	System.out.print("      --------------|\n");
		    }
		    }
		    
		    }
	


	
