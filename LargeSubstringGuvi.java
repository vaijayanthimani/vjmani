package square;
import java.util.*;
public class LargeSubstringGuvi {
public static void main(String []args){
	Scanner s=new Scanner(System.in);
	String string=s.nextLine();
	String largeString="";
	for(int i=1;i<string.length();i++){
		if((string.charAt(i)-string.charAt(i-1))>0){
			largeString=string.substring(i);
			break;
		}
	}
	if(largeString.length()==0){
		System.out.println("there is no large substring");
	}
	else{
		System.out.println("the large substring is"+largeString);
	}
}
}
