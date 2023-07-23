package package1;

public class Student 
{ //{} Boundary of the class
 
	int age, rollno;
 
	public void automation() 
	{
	 System.out.println("Automation is very easy");
	}
	
	public void abc() // method name abc () indicates its a method
	{
	 System.out.println("Welcome to all of you");
	}
	public static void main(String[] args) 
	{
	Student obj=new Student();
	obj.age =28;
	obj.rollno=11;
	obj.automation();
	obj.abc();
	System.out.println("Student age is "+obj.age);
	System.out.println("Student Roll Number is "+obj.rollno);
	
	}
}
