package Logics;
import java.util.*;
public class Guvi {
	public static void main(String []args){
		Scanner s=new Scanner(System.in);
		int weight=s.nextInt();
		int min=1111;
		for(int i=1;i<weight;i++){
						if((i+(i+1))==weight){
				if(((i+1)-i)<min){
					min=((i+1)-i);
				}
			}
		}
		System.out.println(min);
	}

}
