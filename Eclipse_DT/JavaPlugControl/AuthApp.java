
public class AuthApp {

	public static void main(String[] args) {

		String id = "lgh0334";
		String inputID  = args[0];
		
		String pw = "dla254890*";
		String inputPW=args[1];
		
		System.out.println("Hi.");
		
//		if(inputID.equals(id)) {
//			if(inputPW.equals(pw)) {
//			System.out.println("Welcome.");
//			}
//		}else  {
//			System.out.println("Who are you?");
		
		if(inputID.equals(id) && inputPW.equals(pw)) {
			
			System.out.println("Welcome.");
			
		}else{
			System.out.println("Who are you?");
		}
		
	}
}

// 학습 url 입력 생활코딩 홈페이지 "https://www.opentutorials.org/course/3975/26781"

