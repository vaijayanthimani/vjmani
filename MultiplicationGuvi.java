package square;
import java.util.*;
public class MultiplicationGuvi {
public static void main(String []args){
	Scanner s=new Scanner(System.in);
	int number1=s.nextInt();
	int number2=s.nextInt();
	int output=2;
	while(output>=1){
		output=number1-number2;
		number1-=number2;
	}
	System.out.println(Math.abs(output-2));
}
}
