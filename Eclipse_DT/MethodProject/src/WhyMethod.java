import java.io.FileWriter;

public class WhyMethod {

	public static void main(String[] args)  throws Exception {

	int i;
	
	int num =10000;
	for(i = 0; i< num; i++ ) {

System.out.println(twoTimes("a", "b"));
	writeFileTwoTimes("a", "b");
	FileWriter fw = new FileWriter("out.txt");
	
	fw.write(twoTimes("a","b"));
	fw.close();
	



	}
	}
	
	public static String twoTimes(String text, String mid) {
		String out  = "";
		out = out  + mid +"\n";
		out = out + text +"\n";
		out = out + text +"\n";
return out;

	}

	public static void extracted(String	text, String mid) {
		
		System.out.println("-");
		System.out.println(text + mid);
		System.out.println(text + mid);
	}

}
