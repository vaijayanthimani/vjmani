package square;
import java.util.*;
public class RectangleOverlap {
public static void main(String []args){
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the size length of the Rectangle");
	int topLength1_1=s.nextInt();
	int topLength2_1=s.nextInt();
	int bottomLength1_1=s.nextInt();
	int bottomLength2_1=s.nextInt();
	int topLength1_2=s.nextInt();
	int topLength2_2=s.nextInt();
	int bottomLength1_2=s.nextInt();
	int bottomLength2_2=s.nextInt();
	if((topLength1_2>bottomLength1_1) || (topLength1_1>bottomLength1_2) || (topLength2_2>bottomLength2_1) || (topLength2_1>bottomLength2_2)){
		System.out.println("Does not Intersect");
	}
	else{
		System.out.println("Intersect");
	}
}
}
