package StringBuffer;
import java.util.*;
public class Palindrome {
	public static void main(String []args)
	{
		int temp=0,r,sum=0;
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		StringBuffer str1=new StringBuffer(str);
				str1=str1.reverse();
					if((str1.toString()).equals(str))
					{
						System.out.println("the given string is palindrome");
					}
					else
						System.out.println("the given string is not palindrome");

		
	}
}
