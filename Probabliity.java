package square;
import java.util.*;
public class Probabliity {
public static void main(String []args){
	System.out.println("Enter the range");
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	int i;
	System.out.println("Enter the divider");
	int divider=s.nextInt();
	int c=0;
	if(n>1){
	for(i=1;i<n;i++){
	if((i/divider)==0){
System.out.println(i);		
		c++;
	}
	}
	double d=(double)c/(double)i;
	System.out.println("the probability is"+d);
		}
	else{
		System.out.println("Input Invalid");
	}
}
}
