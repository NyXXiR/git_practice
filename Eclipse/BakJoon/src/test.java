import java.util.Arrays;
import java.util.Scanner;
import java.lang.String;


public class test {
	
public static void main(String[] args)  {

	Scanner sc = new Scanner(System.in);
	
	int N = 5;
	
	String[] OX = new String[N];

	OX[0]= "OOOXXXOO";
	OX[1]= "OOOXXXXO";
	OX[2]= "OOOXXXOX";
	OX[3]= "XOOXXXOO";
	OX[4]= "OOOXXXOO";
	

	 int count = 0;
	 int sum = 0;

	 
for(int i=0; i<N; i++) {

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






