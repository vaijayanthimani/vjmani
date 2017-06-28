package Guvi;
import java.util.*;
public class SmCloseToZero {
public static void main(String []args){
	System.out.println("Enter the number of elements in the Array");
		Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	int arr[]=new int[n];
	int min=0;
	System.out.println("Enter the elements in the Array");
	for(int i=0;i<n;i++){
		arr[i]=s.nextInt();
	}
	int min1=0;
	int sum=0;
	for(int i=0;i<n;i++){
		for(int j=0;j<n;j++){
			if(arr[i]!=arr[j]){
			if(arr[i]+arr[j]<sum){
				sum=arr[i]+arr[j];
				min=arr[i];
				min1=arr[j];
			}
		}}
	}
	System.out.println(min+" "+min1);
	
}
}
