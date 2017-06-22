package Logics;
import java.util.*;
public class Add {
public static void main(String []args){
	int t=0;
	int t1=0;
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the size of the array:");
	int size=s.nextInt();
	System.out.println("Enter the target number:");
	int target=s.nextInt();
	System.out.println("Enter the elements in the array:");
	int arr[]=new int[size];
	for(int i=0;i<size;i++){
		arr[i]=s.nextInt();
	}
	for(int j=0;j<size;j++){
		for(int i=j+1;i<size;i++){
			if((arr[j]+arr[i])==target){
				t=arr[j];
				t1=arr[i];
			}
		}
	}
	System.out.println(t+" "+t1);
}
}
