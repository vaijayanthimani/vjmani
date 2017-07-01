package Guvi;
import java.util.*;
public class SmallElementNext {
public static void main(String []args){
	System.out.println("Enter the number of elements in the array");
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	int arr[]=new int[n];
	System.out.println("Enter the elements in the array");
	for(int i=0;i<n;i++){
		arr[i]=s.nextInt();
	}
	try{
	for(int i=0;i<n+2;i++){
				if(arr[i]>arr[i+1]){
				System.out.print(arr[i+1]+" ");
			}
			else if(arr[i]<arr[i+1]){
				System.out.print("-1"+" ");
			}
		}
	}
	catch(ArrayIndexOutOfBoundsException e){
		System.out.println("-1"+" ");
	}
}
}
