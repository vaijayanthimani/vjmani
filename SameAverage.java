package Logics;
import java.util.*;
public class SameAverage {
public static void main(String []args){
	System.out.println("Enter the number of elements in the array");
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	int arr[]=new int[n];
	for(int i=0;i<n;i++){
		arr[i]=s.nextInt();
	}
	if(n%2==0){
		int len1=n/2;
		int arr1[]=new int[len1];
		int sum1=0;
		int c1=0;
		for(int i=0;i<len1;i++){
			arr1[i]=arr[i];
			sum1+=arr1[i];
			c1++;
		}
		int len2=n-(len1);
		int arr2[]=new int[len2];
		int sum2=0;
		int c2=0;
		for(int i=len1,j=0;i<n;i++,j++){
			arr2[j]=arr[i];
			sum2+=arr2[j];
			c2++;
					}
		if(sum1/c1==sum2/c2){
			System.out.print("[");
			for(int i=0;i<len1;i++){
			System.out.print(" "+arr1[i]+" ");}
			System.out.print("]"+"[");
			for(int i=0;i<len1;i++)
			System.out.print(" "+arr2[i]+" ");
			System.out.print("]");
		}
		else
			System.out.println("Not Possible");
		}
	else{
		int len1=(n/2)+1;
		int arr1[]=new int[len1];
		int sum1=0;
		int c1=0;
		for(int i=0;i<len1;i++){
			arr1[i]=arr[i];
			sum1+=arr1[i];
			c1++;
		}
		int len2=n-(len1);
		int arr2[]=new int[len2];
		int sum2=0;
		int c2=0;
		for(int i=len1,j=0;i<n;i++,j++){
			arr2[j]=arr[i];
			sum2+=arr2[j];
			c2++;
					}
		try{
		if(sum1/c1==sum2/c2){
			System.out.print("[");
			for(int i=0;i<len1+1;i++){
			System.out.print(" "+arr1[i]+" ");}
			System.out.print("]"+"[");
			for(int i=0;i<len1;i++){
			System.out.print(" "+arr2[i]+" ");			
			}
		}
		else
			System.out.println("Not Possible");
		}
	catch(ArrayIndexOutOfBoundsException e){}
		System.out.print("]");
	}
	}
	
}



