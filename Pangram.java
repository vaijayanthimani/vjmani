package square;
import java.util.*;
public class Pangram {
public static void main(String []args){
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the string");
	String string=s.nextLine();
	String output="";
	for(int i=0;i<string.length();i++){
		if(!(output.contains(string.substring(i,i+1)))){
			output+=string.substring(i,i+1);
		}
	}
if(output.length()==26){
	System.out.println("The Given is Pangram");
}
else{
	System.out.println("The Given is Not Pangram");
}
}
}
