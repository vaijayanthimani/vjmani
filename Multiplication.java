package Logics;
import java.util.*;
public class Multiplication {
	public static void main(String []args)
{
		Scanner s=new Scanner(System.in);
		String str1=s.nextLine();
		String str2=s.nextLine();
		int i1=Integer.parseInt(str1);
		int i2=Integer.parseInt(str2);
		int i3=i1*i2;
		String str3=Integer.toString(i3);
		System.out.println(str3);
		
	}
}
