import java.util.Scanner;

public class HelloWorld {

	public static void main(String[] args) {
		int x;
		x=10;
		x=010; //8진수10= 10진수8
		x=0xfff; // 16진수fff
		float f;
		f=3.14f;
		char sch='x';
		String str ="x"; 
		// 문자데이터는 작은따움표로 묶는다. 'x','1'
		// 문자열데이터는 큰따움표로 묶는다. "x","1","Hello"
		// /n => new line
		// /t => tab공간
		int n=(int)x;// ()casting
		
		int m =128;
		float p=m;
		// && and
		// || or
		// ! not
		if(1==1)
			System.out.println("같다");
		
		//Scanner s = new Scanner(System.in); 빈공간을 만들어서 입력하면 출력하는 기능
		
		// 문자열비교는 == 예외임 .equals 사용해야됨
		
//		switch(조건/표현식) {
//		case 값/표현식:
//			~~~~;
//			break;
//		case 값2/표현식2:
//			~~~~;
//			break;
//		case 값3/표현식3:
//			~~~~;
//			break;
//		default:
//			~~~~~;
//			break;
//		}
		
	}

}
