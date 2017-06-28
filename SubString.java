package Logics;
import java.util.*;
public class SubString {
	public static void main(String []args){
		Scanner s=new Scanner(System.in);
		String str1=s.nextLine();
		String str2=s.nextLine();
		if(str1.contains(str2)){
			System.out.println(str1.indexOf(str2));
		}
		else
			System.out.println("1");
	}

}
