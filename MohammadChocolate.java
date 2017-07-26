package square;
import java.util.*;
public class MohammadChocolate {
public static void main(String []args){
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the rows and columns of the array");
	int rows=s.nextInt();
	int columns=s.nextInt();
	int number1[][]=new int[3][2];
int output=1;
for(int i=0;i<rows;i++){
	for(int j=0;j<columns;j++){
		number1[i][j]=s.nextInt();
	}
}
	for(int i=0;i<rows;i++){
		output=1;
		for(int j=0;j<columns;j++){
	if(number1[i][j]==0){
		System.out.println("0");
	}
	else{
		output*=number1[i][j];
	}
	}
		System.out.println(output-1);
	}
}
}
