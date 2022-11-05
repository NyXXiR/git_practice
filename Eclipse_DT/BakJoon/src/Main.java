import java.util.Arrays;
import java.util.Scanner;
import java.lang.String;
public class Main {
	
public static void main(String[] args)  {

	Scanner sc = new Scanner(System.in);
	
	String n = sc.nextLine();
	int N = Integer.parseInt(n);
	
	String[] OX = new String[N];


	 int count = 0;
	 int sum = 0;

	 
for(int i=0; i<N; i++) {
	OX[i] =sc.next();
	String[] OXslice = OX[i].split("");
	 
 
 for(int j=0; j<OX[i].length(); j++) {

	 if(OXslice[j].equals("O")) {
		 count++;
		 sum+=count;
	 }else {
	 count= 0;}
	 
 }
 System.out.println(sum); 
 sum=0; count=0;
}

}
}






