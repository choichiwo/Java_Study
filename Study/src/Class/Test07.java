package Class;

import java.util.ArrayList;

public class Test07 {

	public static void main(String[] args) {
		//Array = ��������  ArrayList = �������� 
		// Array[0] ArrayList.get(0)
		//CRUD Create/Read/Update/Delete
		ArrayList<String> studentName=new ArrayList<String>();
		studentName.add("Jone"); //C ����
		studentName.add("Jane");
		studentName.add("Jacob");
		studentName.add("Johanson");
		studentName.add("Jason");
		for(int i=0; i<studentName.size(); i++) {
			System.out.println(studentName.get(i)); //R ��ȸ
		}
		System.out.println("\n");
		studentName.set(3, "jefferson"); //U ����(replace)
		for(int i=0; i<studentName.size(); i++) {
			System.out.println(studentName.get(i)); //R ��ȸ
		}
		studentName.remove(3); //index�� ����¹� D ����
		studentName.remove("Jason");//value ������ ����¹�
		// delete data and reduce the length �����͸��ƴ϶� ���̵� ����
		System.out.println("\n");
		for(int i=0; i<studentName.size(); i++) {
			System.out.println(studentName.get(i)); //R ��ȸ
		}
		studentName.clear(); // delete all �� ����� �ε��� 0���·� ��ȯ
		System.out.println("\n");
		System.out.println(studentName);
		// method(�޼ҵ�) add, get...
		
//		for(int i=0;i<studentName.length;i++) {
//			System.out.println(studentName[i]);
//		}
 		
	}

}
