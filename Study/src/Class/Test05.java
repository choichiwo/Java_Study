package Class;

import java.util.Scanner;

public class Test05 {

	public static void main(String[] args) {
		// ���丮�� Factorial : n!
		// 4! = 4x3x2x1
		// ���� ������ �Է¹޴´�. �� 10������ ����
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		int f = 1;
		for(int i=1; i<=num; i++) {		
				f = f*i;	
		}
		System.out.println(f);
	}

}
