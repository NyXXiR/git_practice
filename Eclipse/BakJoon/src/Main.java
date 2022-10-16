import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	
public static void main(String[] args) throws Exception {

BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

int max = 0;
int count = 0;

for(int i=0; i<9; i++) {
		int input = Integer.parseInt(br.readLine());
		if(input>max) {
		max = input;
		count = i+1;
	}
}
		bw.write(max+"\n");
		bw.write(""+count);
		bw.flush();
		bw.close();
}
}



