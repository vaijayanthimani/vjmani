package square;
import java.util.*;
public class ReplaceGreatestElement {
public static void main(String []args){
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the size of the array");
	int size=s.nextInt();
	int arr[]=new int[size];
	System.out.println("Enter the elements of the array");
	for(int i=0;i<size;i++){
		arr[i]=s.nextInt();
	}
	int max=0;
	for(int i=0;i<size;i++){
		for(int j=i+1;j<size;j++){
			if(arr[j]>max){
				max=arr[j];
			}
		}
		arr[i]=max;
		max=0;
		System.out.println(arr[i]);
	}
}
}
