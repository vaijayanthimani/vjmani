package Logics;
import java.util.*;
public class GuviSeed {
public static void main(String []args){
	System.out.println("Enter the number");
	Scanner s=new Scanner(System.in);
	int num=s.nextInt();
	int pro=1;
	int num1=num;
	int temp=0;
	while(num1!=0){
		temp=num1%10;
		pro=pro*temp;
		num1/=10;
	}
	pro=pro*num;
	System.out.println(pro);
}
}
