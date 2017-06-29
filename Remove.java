package Guvi;
import java.util.*;
public class Remove {
public static void main(String []args){
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the number of elements in the array");
	int n=s.nextInt();
	System.out.println("Enter the elements in the array");
	int arr[]=new int[n];
	for(int i=0;i<n;i++){
		arr[i]=s.nextInt();
			}
	System.out.println("Enter the element to remove in the given array");
	int remove=s.nextInt();
	int count=1;
	for(int i=0;i<n;i++){
		if(arr[i]!=remove){
			count++;
					}
	}
		int arr1[]=new int[count+1];
	for(int i=0,j=0;i<n;i++,j++){
		if(arr[i]!=remove){
			arr1[i]=arr[i];
			System.out.print(arr1[i]+" ");
					}
}}
}
