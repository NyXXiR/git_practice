import java.util.ArrayList;
import java.util.Scanner;

public class abc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub



ArrayList<Integer> score = new ArrayList<>();
score.add(30);
score.add(60);
score.add(80);

ArrayList<Integer> score_new = new ArrayList<>();

double sum=0;
double avg=0;


for(int i=0;i<score.size(); i++) {
	sum+= score.get(i);
}
avg=sum/score.size();

for(int i=0;i<score.size(); i++) {
	if(score.get(i)>=avg) {
		score_new.add(score.get(i));
	}

}
System.out.println(score_new.size());

System.out.println(score.size());

double doublizednew = score_new.size();
double doublizedscore=score.size();

double result= doublizednew /doublizedscore;

double realResult= Math.round(result*1000)/1000.0;

System.out.println(realResult);

}
}

	

 