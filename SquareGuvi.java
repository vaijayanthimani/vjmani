package square;
import java.util.*;
public class SquareGuvi {
public static void main(String []args){
	Scanner s=new Scanner(System.in);
	int arr[][]=new int[4][2];
	int x[]=new int[4];
	int y[]=new int[4];
	System.out.println("Enter the values");
	for(int i=0;i<4;i++){
		for(int j=0;j<2;j++){
			arr[i][j]=s.nextInt();
			if(j!=1){
				x[i]=arr[i][j];
				}
				else
					y[i]=arr[i][j];
		}
	}
	int x1=0;
	int y1=0;
		for(int i=0;i<4;i++){
			x1+=x[i];
			y1+=y[i];
		}
		if((x1-y1)==0){
			System.out.println("square");
		}
		else
			System.out.println("not square");
}
}
