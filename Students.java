package week3.day1;

public class Students {
	public static void main(String[] args) {
		int id = 398783;
		String name = "Test Leaf", email = "Testleaf@selenium.com";
		Long phone = 9876543210L;
		
		Students stud = new Students();	
		System.out.println("Student ID :" +stud.getStudentInfo(id));
		System.out.println("Student ID :" +id + " |" + " Student Name :" +name);
		System.out.println("Student Email :" +email + " |" + " Student Phone Number :" +phone);
	}
	public int getStudentInfo(int id) {
		return id;
	}
	
	public void getStudentInfo(int id, String name) {
	}
	
	public void getStudentInfo(String email, long phone) {
	}
	
}
