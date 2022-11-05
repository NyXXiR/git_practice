import java.io.FileWriter;
import java.io.IOException;

public class OthersOOP {

	public static void main(String[] args) throws IOException {
	//뭐가 클래스고 뭐가 인스턴스인지 살펴본다
		
		
		System.out.println(Math.PI);
		FileWriter f1=new FileWriter("data.txt");
		
		f1.write("Hello");
		f1.write(" Java");
		f1.close();
		
	}

}
