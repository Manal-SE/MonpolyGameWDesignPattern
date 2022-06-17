
//Group 5 
// Student 1 : Manal Fathi 		1706943
// Student 2 : Mashail Alghamdi 1876100
// Student 3 : Ashjan Alomar 	1809839

class Renting extends Cell {
	
	private int price;
	
    
    public Renting (String name,int cellNumberX,int cellNumberY , int price) {
        setName(name);
        setCellNumberX(cellNumberX);
        setCellNumberY(cellNumberY);
        this.price = price;

}

    public int getPrice() {
 			return price;
 		}
 	
    public void setPrice(int price) {
 			this.price = price;
 		}
    
    public  void makeAction(Player currentPlayer, Player otherPlayer){

    	Player Player = currentPlayer;
        Renting cell = (Renting) Player.getLocation();

        if (cell.getName().equalsIgnoreCase("Marvin Garden")) {
             Player.setBalance(Player.getBalance() - cell.getPrice());
             Bank.setAmount(Bank.getAmount() +  cell.getPrice());
         } else if (cell.getName().equalsIgnoreCase("City Park")) {
             Player.setBalance(Player.getBalance() -  cell.getPrice());
             Bank.setAmount(Bank.getAmount() +  cell.getPrice());
             
         } else if (cell.getName().equalsIgnoreCase("Blue Mosque") || cell.getName().equalsIgnoreCase("Mosque")) {
             Player.setBalance(Player.getBalance() -  cell.getPrice());
             Bank.setAmount(Bank.getAmount() +  cell.getPrice());
         }

     }// end of renting if

	@Override
	public void printCellInformation() {
		 System.out.println("\n|**************      Cell information:      **************|");
		    System.out.print("|--------------      Cell number ("+ getCellNumberX()+","+ getCellNumberY()+")");
		    System.out.print("      --------------|\n");
		    System.out.print("|--------------      Cell name : "+getName());
		    System.out.print(" --------------|\n");
		   
		    }
	
	
    }
    
