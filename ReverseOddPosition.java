package Logics;
import java.util.*;
public class ReverseOddPosition {
	public static void main(String []args){
	Scanner s=new Scanner(System.in);
	System.out.println("Enter a String");
	String str=s.nextLine();
	String []str1=str.split("\\s");
	String str2=" ";
	int i=0;
	String output="\0";
	String output1=" ";
	for(String str3:str1){
			if(i%2!=0){
				try{
				StringBuffer strbuf=new StringBuffer(str3);
				output1=strbuf.reverse()+" ";
				output=output.concat(output1);
						}
				
			catch(ArrayIndexOutOfBoundsException v){
				
			}
			}
			
			else{
				try{
		output1=str3+" ";
		output=output.concat(output1);
				}
				catch(ArrayIndexOutOfBoundsException e){
				
				}
	}
			i++;
			}
	
	
	System.out.println(output);
}}