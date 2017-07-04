package Logics;
import java.util.*;
public class DecreaseOrder {
public static void main(String []args)
{
	System.out.println("Enter the number of elements in the array");
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	int arr[]=new int[n];
	System.out.println("Enter the elements in the array");
	for(int i=0;i<n;i++){
		arr[i]=s.nextInt();
	}
	int temp=0;
	for(int i=0;i<n;i++){
		for(int j=i+1;j<n;j++){
			if(arr[j]>arr[i]){
				temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
	}
	for(int i=0;i<n;i++){
		System.out.println(arr[i]);
	}
}
}
