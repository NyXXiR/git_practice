import java.util.Scanner;
import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int testNum = sc.nextInt();
        
        for (int i = 0; i < testNum; i++) {
            int eachClassNum = sc.nextInt();
            
           ArrayList<Integer> score = new ArrayList<>();
           ArrayList<Integer> score_new = new ArrayList<>();
           double sum=0;
           double avg=0;
           for(int j=0; j<eachClassNum;j++) {
        	  score.add(sc.nextInt());
        	  sum+=score.get(j);
           }
           
       avg=sum/score.size();
       
       for(int j=0; j<score.size(); j++) {
    	   if(score.get(j)>avg) {
    		   score_new.add(score.get(j));
    	   }
       }
       
       
       double doublizedNew = score_new.size();
       double doublizedScore = score.size();
       
    	   

double result= doublizedNew /doublizedScore;
double amplifiedResult = result*100;
String resultS = String.format("%.3f", amplifiedResult);

System.out.println(resultS+"%");

        }
       
    }
   }

