package Class;

import java.util.Scanner;

public class Test02 {

	public static void main(String[] args) {
		// 최소 공배수 최대 공약수
		Scanner s = new Scanner(System.in);
		int num1 = s.nextInt();
		int num2 = s.nextInt();
		int min = (num1 < num2) ? num1 : num2;
		int gcd = 0;
		for (int i =1; i <= min; i++) {
			if (num1%i ==0 && num2%i==0) {
				gcd=i;
			}		
		}
		System.out.println("최대공약수 : " + gcd);
		System.out.println("최소공배수: " + num1*num2 / gcd);
		}
	
}
