package square;
import java.util.*;
public class AppearsTwice {
public static void main(String []args){
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the size of the array");
	int size=s.nextInt();
	int array[]=new int[size];
	System.out.println("Enter the elements of the array");
	for(int i=0;i<size;i++){
		array[i]=s.nextInt();
	}
	int count=0;
	int output=0;
	for(int i=0;i<size;i++){
		count=0;
		for(int j=0;j<size;j++){
			if((array[i]==array[j])){
				if(i!=j){
				count++;
			//	System.out.print(array[i]+" ");
				}	}}
		if(count!=1)
		output=array[i];
			
			
		
		}
	System.out.println(output);
}
}
