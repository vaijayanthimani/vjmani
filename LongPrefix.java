package square;
import java.util.*;
public class LongPrefix {
public static void main(String []args){
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the size of the String array");
	int size=s.nextInt();
	String stringArray[]=new String[size];
	for(int i=0;i<size;i++){
		stringArray[i]=s.nextLine();
	}
	s.close();
	String longPrefix="";
	longPrefix=stringArray[0];
	for(int j=1;j<size;j++){
	for(int i=1;i<Math.min(longPrefix.length(),stringArray[j].length());i++){
		if(longPrefix.charAt(i)!=stringArray[i].charAt(i)){
			break;
		}
		longPrefix=stringArray[j].substring(0,i);
	}
	}
	System.out.println(longPrefix);
}
}
