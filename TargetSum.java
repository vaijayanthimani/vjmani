package square;
import java.util.*;
public class TargetSum {
public static void main(String args[]){
	System.out.println("Enter the size of the array");
	Scanner s=new Scanner(System.in);
	int size =s.nextInt();
	int arr[]=new int[size];
	System.out.println("Enter the value of m");
	int m=s.nextInt();
	System.out.println("Enter the target value");
	int target=s.nextInt();
	System.out.println("Enter the elements of the array");
	for(int i=0;i<size;i++){
		arr[i]=s.nextInt();
	}
	int sum=0;
	for(int i=0;i<m;i++){
		sum+=arr[i];
	}
	if(sum==target){
		System.out.println("TRUE");
	}
	else
		System.out.println("FALSE");
}
}
