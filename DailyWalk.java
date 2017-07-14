package square;
import java.util.*;
public class DailyWalk {
public static void main(String []args){
	System.out.println("Enter the total number of students");
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	int c=0;
	for(int i=0;i<n*2;i++){
		for(int j=i+1;j<=n*2;j++){
			System.out.println(i+","+j);
			c++;
		}
	}
	System.out.println(c);
}
}
