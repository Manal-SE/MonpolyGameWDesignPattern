//Group 5 
// Student 1 : Manal Fathi 		1706943
// Student 2 : Mashail Alghamdi 1876100
// Student 3 : Ashjan Alomar 	1809839


public class Bank {
	
	private static int amount = 2000;
    private static Bank bank = null;
    
    private Bank() {
        this.amount = 2000;
    }
    
    public static Bank getBank() {
    	if (bank == null)
    		return new Bank();
    	else
    		return bank;
    }
    
    public static int getAmount() {
        return Bank.amount;
    }

    public static void setAmount(int amount) {
            Bank.amount = amount;
    }
    
    
    public void addAmount(int money){
        amount+=money;
        
        
    }
    
}
