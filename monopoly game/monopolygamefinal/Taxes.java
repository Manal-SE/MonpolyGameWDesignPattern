
//Group 5 
// Student 1 : Manal Fathi 		1706943
// Student 2 : Mashail Alghamdi 1876100
// Student 3 : Ashjan Alomar 	1809839


public class Taxes extends Cell{
    
	private double taxAmount; 
	
    public Taxes (String name,int cellNumberX,int cellNumberY, double taxAmount) {
        setName(name);
        setCellNumberX(cellNumberX);
        setCellNumberY(cellNumberY);
        this.taxAmount = taxAmount;
}

	public double getTaxAmount() {
		return taxAmount;
	}

	public void setTaxAmount(int taxAmount) {
		this.taxAmount = taxAmount;
	}
    
	public  void mmakeAction(Player currentPlayer, Player otherPlayer) {
		
		Player Player = currentPlayer;
	    Taxes cell = (Taxes)Player.getLocation();
		
	    if (cell.getName().equalsIgnoreCase("Luxury tax")) {
            int luxuryTax = (int) (Player.getBalance() * cell.getTaxAmount());
            if(Player.getBalance()<0)
                luxuryTax*=-1;
            Player.setBalance(Player.getBalance() - luxuryTax);
            Bank.setAmount(Bank.getAmount() + luxuryTax); 
            
        } else if (cell.getName().equalsIgnoreCase("Income Tax")) {
            int incomeTax = (int) (Player.getBalance() * cell.getTaxAmount());
            if(Player.getBalance()<0)
                incomeTax*=-1;
            Player.setBalance(Player.getBalance() - incomeTax);
            Bank.setAmount(Bank.getAmount() + incomeTax);
        }
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

