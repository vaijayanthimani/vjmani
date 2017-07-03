package Logics;
import java.util.*;
public class ReverseStringGuvi {
public static void main(String []args){
	System.out.println("Enter the String ");
	Scanner s=new Scanner(System.in);
	String str=s.nextLine();
	StringBuffer str1=new StringBuffer(str);
	str1=str1.reverse();
	str=str1.toString();
	int n=str.length();
	char ch[]=str.toCharArray();
	ch[0]=str.charAt(0);
	for(int i=0;i<n;i++){
		for(int j=i+1;j<n;j++){
			if(ch[i]==ch[j]){
				while(j<n-1){
					ch[j]=ch[j+1];
					j++;
				}
				n--;
			}
		}
	}
	for(int k=0;k<n;k++){
		System.out.print(ch[k]);
	}
}
}
