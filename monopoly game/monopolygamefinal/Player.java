
//Group 5 
// Student 1 : Manal Fathi 		1706943
// Student 2 : Mashail Alghamdi 1876100
// Student 3 : Ashjan Alomar 	1809839
import java.util.*;
public class Player {

	private String name;
    private int balance;
    private Cell location;
    private ArrayList<Cell> playerProperities = new ArrayList<Cell>();
    private boolean passGo;
    
    public Player(String name) {
        this.name = name;
        this.balance = 1500;
        this.location = OriginalBoard.getCellByIndex(0,0);
        this.passGo = false;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public Cell getLocation() {
        return location;
    }

    public void setLocation(Cell location) {
        this.location = location;
    }

    public boolean getPassGo() {
        return passGo;
    }

    public void setPassGo(boolean passGo) {
        this.passGo = passGo;
    }
    
    public ArrayList<Cell> getPlayerProperities() {
        return playerProperities;
    }
  
    public void changeLocation(int dice){
    	int diceNumber = dice;
        int row = location.getCellNumberX();
        int col = location.getCellNumberY();
        int diceRow = diceNumber+row;
        int diceCol = diceNumber+col;
        int remain;
        
        if (row==0){          
            if(diceCol <= 9){
                col = diceCol;
                }
            else { //(diceCol > 9)
                
                if((diceCol-9)>9){
                    remain = (diceCol-9)%9;
                    row=9;
                    col=9-remain;
                    }
                else{// (diceCol-9<=9){
                    row= diceCol-9;
                    col=9;
                    }
                }
        }

        
        else if (col==9 && (row!=0 && row!=9)){

                switch(row){
                    case 1:
                        if(diceNumber==1){
                            col=9;
                            row=2;
                        }
                        else if (diceNumber==2){
                            col=9;
                            row=3;
                        }
                        else if (diceNumber==3){
                            col=9;
                            row=4;
                        }
                        else if (diceNumber==4){
                            col=9;
                            row=5;
                        }
                        else if (diceNumber==5){
                            col=9;
                            row=6;
                        }
                        else if (diceNumber==6){
                            col=9;
                            row=7;
                        }
                        else if (diceNumber==7){
                            col=9;
                            row=8;
                        }
                        else if (diceNumber==8){
                            col=9;
                            row=9;
                        }
                        else if (diceNumber==9){
                            col=8;
                            row=9;
                        }
                         else if (diceNumber==10){
                            col=7;
                            row=9;
                        }
                        else if (diceNumber==11){
                            col=6;
                            row=9;
                        }
                        else if (diceNumber==12){
                            col=5;
                            row=9;
                        }
                        break;
                        
                    case 2:
                        if(diceNumber==1){
                            col=9;
                            row=3;
                        }
                        else if (diceNumber==2){
                            col=9;
                            row=4;
                        }
                        else if (diceNumber==3){
                            col=9;
                            row=5;
                        }
                        else if (diceNumber==4){
                            col=9;
                            row=6;
                        }
                        else if (diceNumber==5){
                            col=9;
                            row=7;
                        }
                        else if (diceNumber==6){
                            col=9;
                            row=8;
                        }
                        else if (diceNumber==7){
                            col=9;
                            row=9;
                        }
                        else if (diceNumber==8){
                            col=8;
                            row=9;
                        }
                        else if (diceNumber==9){
                            col=7;
                            row=9;
                        }
                         else if (diceNumber==10){
                            col=6;
                            row=9;
                        }
                        else if (diceNumber==11){
                            col=5;
                            row=9;
                        }
                        else if (diceNumber==12){
                            col=4;
                            row=9;
                        }
                        break;
                    case 3:
                        if(diceNumber==1){
                            col=9;
                            row=4;
                        }
                        else if (diceNumber==2){
                            col=9;
                            row=5;
                        }
                        else if (diceNumber==3){
                            col=9;
                            row=6;
                        }
                        else if (diceNumber==4){
                            col=9;
                            row=7;
                        }
                        else if (diceNumber==5){
                            col=9;
                            row=8;
                        }
                        else if (diceNumber==6){
                            col=9;
                            row=9;
                        }
                        else if (diceNumber==7){
                            col=8;
                            row=9;
                        }
                        else if (diceNumber==8){
                            col=7;
                            row=9;
                        }
                        else if (diceNumber==9){
                            col=6;
                            row=9;
                        }
                         else if (diceNumber==10){
                            col=5;
                            row=9;
                        }
                        else if (diceNumber==11){
                            col=4;
                            row=9;
                        }
                        else if (diceNumber==12){
                            col=3;
                            row=9;
                        }
                        break;
                    case 4:
                        if(diceNumber==1){
                            col=9;
                            row=5;
                        }
                        else if (diceNumber==2){
                            col=9;
                            row=6;
                        }
                        else if (diceNumber==3){
                            col=9;
                            row=7;
                        }
                        else if (diceNumber==4){
                            col=9;
                            row=8;
                        }
                        else if (diceNumber==5){
                            col=9;
                            row=9;
                        }
                        else if (diceNumber==6){
                            col=8;
                            row=9;
                        }
                        else if (diceNumber==7){
                            col=7;
                            row=9;
                        }
                        else if (diceNumber==8){
                            col=6;
                            row=9;
                        }
                        else if (diceNumber==9){
                            col=5;
                            row=9;
                        }
                         else if (diceNumber==10){
                            col=4;
                            row=9;
                        }
                        else if (diceNumber==11){
                            col=3;
                            row=9;
                        }
                        else if (diceNumber==12){
                            col=2;
                            row=9;
                        }
                        break;
                    case 5:
                        if(diceNumber==1){
                            col=9;
                            row=6;
                        }
                        else if (diceNumber==2){
                            col=9;
                            row=7;
                        }
                        else if (diceNumber==3){
                            col=9;
                            row=8;
                        }
                        else if (diceNumber==4){
                            col=9;
                            row=9;
                        }
                        else if (diceNumber==5){
                            col=8;
                            row=9;
                        }
                        else if (diceNumber==6){
                            col=7;
                            row=9;
                        }
                        else if (diceNumber==7){
                            col=6;
                            row=9;
                        }
                        else if (diceNumber==8){
                            col=5;
                            row=9;
                        }
                        else if (diceNumber==9){
                            col=4;
                            row=9;
                        }
                         else if (diceNumber==10){
                            col=3;
                            row=9;
                        }
                        else if (diceNumber==11){
                            col=2;
                            row=9;
                        }
                        else if (diceNumber==12){
                            col=1;
                            row=9;
                        }
                        break;
                    case 6:
                        if(diceNumber==1){
                            col=9;
                            row=7;
                        }
                        else if (diceNumber==2){
                            col=9;
                            row=8;
                        }
                        else if (diceNumber==3){
                            col=9;
                            row=9;
                        }
                        else if (diceNumber==4){
                            col=8;
                            row=9;
                        }
                        else if (diceNumber==5){
                            col=7;
                            row=9;
                        }
                        else if (diceNumber==6){
                            col=6;
                            row=9;
                        }
                        else if (diceNumber==7){
                            col=5;
                            row=9;
                        }
                        else if (diceNumber==8){
                            col=4;
                            row=9;
                        }
                        else if (diceNumber==9){
                            col=3;
                            row=9;
                        }
                         else if (diceNumber==10){
                            col=2;
                            row=9;
                        }
                        else if (diceNumber==11){
                            col=1;
                            row=9;
                        }
                        else if (diceNumber==12){
                            col=0;
                            row=9;
                        }
                        break;
                    case 7:
                        if(diceNumber==1){
                            col=9;
                            row=8;
                        }
                        else if (diceNumber==2){
                            col=9;
                            row=9;
                        }
                        else if (diceNumber==3){
                            col=8;
                            row=9;
                        }
                        else if (diceNumber==4){
                            col=7;
                            row=9;
                        }
                        else if (diceNumber==5){
                            col=6;
                            row=9;
                        }
                        else if (diceNumber==6){
                            col=5;
                            row=9;
                        }
                        else if (diceNumber==7){
                            col=4;
                            row=9;
                        }
                        else if (diceNumber==8){
                            col=3;
                            row=9;
                        }
                        else if (diceNumber==9){
                            col=2;
                            row=9;
                        }
                         else if (diceNumber==10){
                            col=1;
                            row=9;
                        }
                        else if (diceNumber==11){
                            col=0;
                            row=9;
                        }
                        else if (diceNumber==12){
                            col=0;
                            row=8;
                        }
                        break;
                    case 8:
                        if(diceNumber==1){
                            col=9;
                            row=9;
                        }
                        else if (diceNumber==2){
                            col=8;
                            row=9;
                        }
                        else if (diceNumber==3){
                            col=7;
                            row=9;
                        }
                        else if (diceNumber==4){
                            col=6;
                            row=9;
                        }
                        else if (diceNumber==5){
                            col=5;
                            row=9;
                        }
                        else if (diceNumber==6){
                            col=4;
                            row=9;
                        }
                        else if (diceNumber==7){
                            col=3;
                            row=9;
                        }
                        else if (diceNumber==8){
                            col=2;
                            row=9;
                        }
                        else if (diceNumber==9){
                            col=1;
                            row=9;
                        }
                         else if (diceNumber==10){
                            col=0;
                            row=9;
                        }
                        else if (diceNumber==11){
                            col=0;
                            row=8;
                        }
                        else if (diceNumber==12){
                            col=0;
                            row=7;
                        }
                        break;
                        
                        default:
                        	break;
                        
                }
                        
        }    

        	
        else if (row == 9){
                if(diceNumber <= col){
                    row = 9 ;
                    col = col - diceNumber;
                }
                else{// if (diceNumber > col ){
                    if (diceNumber-col <= 9 ){
                    	int diceminuscol= diceNumber-col;
                        col = 0 ;
                        row = 9 - diceminuscol;  
                    	System.out.println("row = "+ row + " column= "+col);

                    }
                    else{ //diceNumber - col > 9
                    	int diceminuscol= diceNumber-col;

                        row = 0 ;
                        col = diceminuscol% 9 ;
                    }

                }
            }
        
        else if (col==0 && (row!=0 || row!=9)){
            if ( diceNumber <= row){
                col = 0 ;
                row = row -diceNumber;
            }
            else{//if(diceNumber>row){ 
                if(diceNumber-row <=9){ // in this case it will pass go
                    col = diceNumber - row;
                    row =0 ;
                    setPassGo(true);
                    setBalance(getBalance()+200);
                }
                else{ //diceNumber>9  in this case it will pass go
                    col = 9;
                    row = (diceNumber - row) % 9 ;
                    setPassGo(true);
                    setBalance(getBalance()+200);

                }
            }
        }
        else
            return;
        
        setLocation(OriginalBoard.getCellByIndex(row, col));
        location.printCellInformation();
        
    }

    public void printPlayerInformation(){
        System.out.println("\n|**************      Player information:    **************|\n");
        System.out.print("|--------------      Name:  "+ name);
        System.out.print("           --------------|\n");
        System.out.print("|--------------      Location: "+location.getName());
        System.out.print("           --------------|\n");
        System.out.print("|--------------      Cell number ("+location.getCellNumberX() +","+location.getCellNumberY()+")");
        System.out.print("      --------------|\n");
        System.out.print("|--------------      Balance: "+balance+"$");
        System.out.print("         --------------|\n");

    }
    
    public void checkBalance(){
        if (balance <= -200 ) {
            System.out.print("|--------------      Player "+getName()+" Has reached the minimum balance (-200)");
        	System.out.print("          --------------|\n");
            System.out.println("\n|--------------       End of the game       --------------|\n");

        	System.exit(0);
        	return;

        }
    }
      
    
    public void sendMessage(String message){
		PlayerChat.showMessage(this,message);}
    
    }
    
    
    


