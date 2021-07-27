package Class;

public class Test {

	public static void main(String[] args) {
		int p = 0;
		for(int i=2; i<=10000; i++) {
			for(int j=2; j<=i; j++) {
				if(i%j==0)
				p++;
			}
			if(p==1) {
				System.out.println(i);
			}
			p = 0;
		}

	}

}
