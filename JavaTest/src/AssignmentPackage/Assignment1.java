package AssignmentPackage;

import AssignmentPackage.Assignment1;

public class Assignment1 {

	int age;
	int rollno;
	public void Display1()
	{
		System.out.println("Welcome to all of you");
	}
	public void Display2()
	{
		System.out.println("Automation is very easy");
	}
	 public static void main(String[] args) {
		
		 Assignment1 student = new Assignment1();
		 student.Display1();
		 student.Display2();
		 student.age=23;
		 student.rollno=10;
		 System.out.println("Age is"+student.age+"\nRoll no is"+student.rollno);
	}
	 
}
