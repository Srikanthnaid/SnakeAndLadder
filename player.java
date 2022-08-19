import java.util.Scanner;

public class player {
		public static String player_name;
		public static char[] id;
		public int position = 0;
		
		
	  public void getplayername()
	  {
		  System.out.println("enter player name");
			   	
	}
	  public void getposition()
	  {
		System.out.println("enter the player position");
		  
	  }
	  
	  public static void main(String[] args) {
		  	
		    player p=new player();
		    try (Scanner sc = new Scanner(System.in)) {
				System.out.println("please enter player name: ");
				player.player_name=sc.next();
			}
		  	@SuppressWarnings("unused")
			position a =new position();
			System.out.println(player.player_name);
			System.out.println(p.position);
			
			
			
		}
		
		
	}


