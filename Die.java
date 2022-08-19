import java.util.Random;
import java.util.Scanner;

public class  Die{

	private static Random random; 
	public Die(){
		random = new Random();
	}
	public int rollDie()
	{
		return random.nextInt(6)+1;
	}
	public static void main(String[] args) 
	{
		Die d=new Die();
		
		System.out.println(Die.random.nextInt(6)+1);
		
	}
}