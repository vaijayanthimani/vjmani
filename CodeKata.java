package square;
import java.util.*;
public class CodeKata {
public static void main(String []args){
	Scanner s=new Scanner(System.in);
	System.out.println("Enter two Strings");
	String str1=s.nextLine();
	char ch1[]=str1.toCharArray();
	String str2=s.nextLine();
	char ch2[]=str2.toCharArray();
	for(int i=0;i<str1.length();i++) {
		ch1[i]=(char) (ch1[i]+10);}
	for(int i=1;i<str2.length()-1;i++){
		ch2[i]=(char) (ch2[i]+10);
				if(ch2[i]+10>122){
			ch2[i]=(char) (122-ch2[i]);
			ch2[i]=(char) (97+10-ch2[i]-11);
		}
	}
	for(int i=0;i<str1.length();i++) 
		System.out.print(ch1[i]);
	System.out.println();
	for(int i=0; i<str2.length();i++)
	System.out.print(ch2[i]);
	}
}

