package square;
import java.util.*;
public class Pyramid {
public static void main(String []args){
	Scanner s=new Scanner(System.in);
	String string=s.nextLine();
	String []string1=string.split("/");
	int output=0;
	for(int i=0;i<string1.length;i++){
		int maximum=0;
		String []string2=string1[i].split(" ");
		for(int j=0;j<string2.length;j++){
			if(!(string2[j].equals("/") || string2[j].equals(""))){
				if(Integer.parseInt(string2[j])>maximum){
					maximum=Integer.parseInt(string2[j]);
				}
			}
		}
		output+=maximum;
	}
	System.out.println(output);
}
}
