package Logics;
import java.util.*;
public class SumDigitPalindrome {
	public static void main(String []args){
		Scanner s=new Scanner(System.in);
		int num=s.nextInt();
		int rem=0;
		int sum=0;
		int reverse=0;
		while(num!=0){
		rem=num%10;
		num/=10;
		sum+=rem;
				}
		while(sum!=0){
			rem=sum%10;
			reverse=reverse*10+rem;
			sum/=10;
		}
		if(sum==reverse){
			System.out.println("The sum of the digits of the given number is palindrome");
		}
		else{
			System.out.println("The sum of the digits of the given number is not palindrome");
					}
		
		
	}

}
