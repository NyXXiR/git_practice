
public class AuthApp3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
//로그인 시스템을 만들고싶다
//	아이디 입력 배열
//	비밀번호 입력 배열
//	
//	아이디+비번 일치하면패스
//	else면후아유?
// egoing, lgh0334, nyxxir

String[] users = new String[3];
users[0]="egoing";
users[1]="lgh0334";
users[2]="nyxxir";

String inputID = args[0];

String[] pw = new String[3];
pw[0]="1234";
pw[1]="2345";
pw[2]="3456";

String inputPW = args[1];


boolean isLogined = false;
for(int i=0; i<users.length; i++)	{
String currentID = users[i];
String currentPW = pw[i];
if(currentID.equals(inputID)&&currentPW.equals(inputPW)) {
	isLogined = true;
	break;
	}

}
System.out.println("Hi.");
if(isLogined) {
	System.out.println("Master!");
}else {
	System.out.println("who are you?");
}







		
		
	}

}
