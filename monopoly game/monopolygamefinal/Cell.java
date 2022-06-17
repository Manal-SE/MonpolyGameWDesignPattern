//Group 5 
// Student 1 : Manal Fathi 		1706943
// Student 2 : Mashail Alghamdi 1876100
// Student 3 : Ashjan Alomar 	1809839
public abstract class Cell {

    private String name;
    private int cellNumberX;
    private int cellNumberY;
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
 
    public void setCellNumberX(int cellNumberX) {
        this.cellNumberX = cellNumberX;
    }
    
    public void setCellNumberY(int cellNumberY) {
        this.cellNumberY = cellNumberY;
    }

    public int getCellNumberX() {
        return cellNumberX;
    }

    public int getCellNumberY() {
        return cellNumberY;
    }
    
    public void makeAction(Player currentPlayer, Player otherPlayer) {};
    public abstract void printCellInformation();
   
       

}
 
