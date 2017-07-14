package square;
import java.util.*;
public class Thousands {
public static void main(String []args){
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the stock prices for next 10 days");
	int arr[]=new int[10];
	for(int i=0;i<10;i++){
		arr[i]=s.nextInt();
	}
	int temp=0;
	int value1=0;
	int value2=0;
	for(int i=0;i<10;i++){
		for(int j=0;j<10;j++){
			if(Math.abs(arr[i]-arr[j])>temp){
				temp=Math.abs(arr[i]-arr[j]);
				value1=i;
				value2=j;
			}
		}
	}
	System.out.println("Max benefit "+arr[value2]+" - "+arr[value1]+"= "+temp+" thousand");
}
}
