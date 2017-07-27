package square;
import java.util.*;
public class CheckSubstring {
public static void main(String []args){
	Scanner s=new Scanner(System.in);
	System.out.println("Enter two Strings");
	String string1=s.nextLine();
	String string2=s.nextLine();
	String output="";
	for(int i=0;i<string1.length()-1;i++){
		if(string2.contains(string1.substring(i,i+2))){
			output=(string1.substring(i,i+2));
		}
	}
	System.out.println(output);
}
}
