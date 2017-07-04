package Logics;
import java.util.*;
public class Deletedigits {
public static void main(String []args){
	System.out.println("Enter the number");
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	System.out.println("Enter the number of digits to be deleted");
	int d=s.nextInt();
	String str=Integer.toString(n);
	char ch[]=str.toCharArray();
    Arrays.sort(ch);
    char ch1[]=new char[ch.length-d];
    for(int i=0;i<ch.length-d;i++){
    
ch1[i]=ch[i];    	
    	}
    n=Integer.parseInt(new String(ch1));
    System.out.print(n);
 }
}
