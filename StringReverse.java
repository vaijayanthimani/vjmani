package Logics;
import java.util.*;
public class StringReverse {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String input=s.nextLine();
		String []temp1=input.split("\\s");
	for(String temp2:temp1)
		{
			
			StringBuffer temp3=new StringBuffer(temp2);
			System.out.print(temp3.reverse()+" ");
		}
	}
	}


