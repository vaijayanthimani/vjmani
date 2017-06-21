package Logics;
import java.util.*;
public class Tallest {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int h[]=new int[50];
		int h1[]=new int[50];
		for(int i=0;i<10;i++){
			h[i]=s.nextInt();
		}
		Arrays.sort(h);
		for(int i=9,j=0;i>=0;i--,j++){
		h1[j]=h[i];	
		}
		for(int i=0;i<10;i++){
			System.out.print(h1[i]+" ");
		}
		int k=s.nextInt();
		System.out.println("\n 4th tallest:"+h1[3]);
		System.out.println("kth tallest:"+h1[k-1]);

	}

}
