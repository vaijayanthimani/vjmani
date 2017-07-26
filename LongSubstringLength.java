package square;
import java.util.*;
public class LongSubstringLength {
public static void main(String []args){
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the String");
	String string=s.nextLine();
	String output="";
	int count=0;
	for(int i=0;i<string.length();i++){
		if(count==0){
		if(!(output.contains(string.substring(i,i+1)))){
			output+=string.substring(i,i+1);
		}
		else{
			count++;
		}
	}
		}
	System.out.println(output+" "+output.length());
}
}
