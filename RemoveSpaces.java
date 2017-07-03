package Logics;
import java.util.*;
public class RemoveSpaces {
public static void main(String []args){
	System.out.println("Enter the String ");
	Scanner s=new Scanner(System.in);
	String str=s.nextLine();
	StringBuffer str1=new StringBuffer(str);
	str=str.replaceAll("\\s{2,}"," ").trim();
	System.out.println(str);
	
}
}
