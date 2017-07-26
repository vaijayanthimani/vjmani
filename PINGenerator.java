package square;
import java.util.*;
public class PINGenerator {
public static void main(String []args){
	Scanner s=new Scanner(System.in);
	System.out.println("Enter two Strings ");
	String string1=s.nextLine();
	String string2=s.nextLine();
	String number=s.nextLine();
	System.out.println("Enter the digit");
	int n=s.nextInt();
	String pin="";
	int count=0;
	if(string1.length()>string2.length()){
		pin=string1.charAt(0)+string2;
	}
	else if(string1.length()<string2.length()){
		pin=string2.charAt(0)+string1;
	}
	else{
		for(int i=0;i<string1.length();i++){
			if(count==0){
			if(!((string1.substring(i,i+1)).equals(string2.substring(i,i+1)))){
				count++;
				if((int)(string1.charAt(i))>(int)(string2.charAt(i))){
					pin=string1.charAt(0)+string2;
			}
				else{
					pin=string2.charAt(0)+string1;
				}
		}
	}
		}
}
	pin=pin+number.charAt(n-1)+number.charAt((number.length())-n);
	System.out.println(pin);
}
}