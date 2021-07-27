package Class;

import java.util.ArrayList;

public class Test07 {

	public static void main(String[] args) {
		//Array = 고정길이  ArrayList = 가변길이 
		// Array[0] ArrayList.get(0)
		//CRUD Create/Read/Update/Delete
		ArrayList<String> studentName=new ArrayList<String>();
		studentName.add("Jone"); //C 생성
		studentName.add("Jane");
		studentName.add("Jacob");
		studentName.add("Johanson");
		studentName.add("Jason");
		for(int i=0; i<studentName.size(); i++) {
			System.out.println(studentName.get(i)); //R 조회
		}
		System.out.println("\n");
		studentName.set(3, "jefferson"); //U 수정(replace)
		for(int i=0; i<studentName.size(); i++) {
			System.out.println(studentName.get(i)); //R 조회
		}
		studentName.remove(3); //index로 지우는법 D 삭제
		studentName.remove("Jason");//value 값으로 지우는법
		// delete data and reduce the length 데이터만아니라 길이도 지움
		System.out.println("\n");
		for(int i=0; i<studentName.size(); i++) {
			System.out.println(studentName.get(i)); //R 조회
		}
		studentName.clear(); // delete all 다 지우고 인덱스 0상태로 변환
		System.out.println("\n");
		System.out.println(studentName);
		// method(메소드) add, get...
		
//		for(int i=0;i<studentName.length;i++) {
//			System.out.println(studentName[i]);
//		}
 		
	}

}
