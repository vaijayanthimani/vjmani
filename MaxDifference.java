package Logics;
import java.util.*;
public class MaxDifference {
	public static void main(String []args){
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number of elements in the array");
		int n=s.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the elements in the array");
		int max=-111;
		for(int i=0;i<n;i++){
			arr[i]=s.nextInt();
		}
		int c=0;
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				if(arr[i]-arr[j]>max){
					max=arr[i]-arr[j];
					c=i;
				}
			}
		}
		System.out.println(c);
	}

}
