package Logics;
import java.util.*;
public class Rotate {
	public static void main(String args[]){
		System.out.println("Enter the number of elements in the array");
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		System.out.println("Enter the number of elements to rotate");
		int d=s.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++){
			arr[i]=s.nextInt();
		}
		int arr1[]=new int[d];
		for(int i=0;i<d;i++){
			arr1[i]=arr[i];
			arr[i]=0;
		}
		
		for(int i=d,j=0;i<n;i++,j++){
			arr[j]=arr[i];
		}
		for(int i=d+1,j=0;i<n;i++,j++){
			arr[i]=arr1[j];
		}
		for(int i=0;i<n;i++){
			System.out.print(arr[i]+" ");
		}
	}

}
