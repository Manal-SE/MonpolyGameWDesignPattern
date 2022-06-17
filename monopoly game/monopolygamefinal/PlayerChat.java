
public class PlayerChat {
		
	public PlayerChat() {}
	
    public static void showMessage(Player player, String message){
		
    	System.out.println(java.time.LocalTime.now()+ " [" + player.getName() + "] : " + 		message);
  	}

}
