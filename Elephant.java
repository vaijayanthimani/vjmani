package square;
import java.util.*;
public class Elephant {
public static void main(String []args){
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the number of elephants");
	int numberOfElephants=s.nextInt();
	System.out.println("Enter the Maximum capacity");
	int maximumCapacity=s.nextInt();
	System.out.println("Enter the weight");
	int weight[]=new int[numberOfElephants];
	for(int i=0;i<numberOfElephants;i++){
		weight[i]=s.nextInt();
	}
	int count=0;
	int sum=0;
	Arrays.sort(weight);
	for(int i=0;i<numberOfElephants;i++){
		sum+=weight[i];
		if(sum>maximumCapacity){
			break;
		}
		count++;
		}
	System.out.println(count);
}
}
