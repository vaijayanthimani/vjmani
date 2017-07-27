package square;
import java.util.*;
public class Game {
public static void main(String []args){
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the number of coins");
	int number=s.nextInt();
	int player1=0;
	int player2=0;
	for(int i=0;i<number;i++){
		int coin=s.nextInt();
		if(i%2==0){
			player1+=coin;
		}
		else{
			player2+=coin;
		}
	}
	if(player1>player2){
		System.out.println("player1 is the winner and the value is "+player1);
	}
	else if(player2>player1){
		System.out.println("player2 is the winner and the value is "+player2);
	}
	else{
		System.out.println("Match ended up with tie ");
	}
}
}
