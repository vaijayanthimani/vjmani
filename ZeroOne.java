package Logics;
import java.util.*;
public class ZeroOne {
	public static void main(String []args){
		int count=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number of Strings in the array ");
		int n=s.nextInt();
		String str[]=new String[n+1];
		System.out.println("Enter the Strings in the array ");
		for(int i=0;i<n+1;i++){
			str[i]=s.nextLine();
		}
		for(int i=0;i<n+1;i++){
			if(str[i].length()>2){
				if((str[i].charAt(0)=='0' && str[i].charAt(1)=='1') || (str[i].charAt(0)=='1' && str[i].charAt(1)=='0')){
					count++;
				}
			}
		}
		System.out.println(count);
	}

}
