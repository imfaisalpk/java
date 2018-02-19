package firstproject;
import java.io.*;

public class FirstJavaClass {

	public static void main(String[] args) {
		
		/* Create two objects using constructor */
		Employee empOne = new Employee("James Smith");
		Employee empTwo = new Employee("Mary Anne");
		// Invoking methods for each object created
		empOne.empAge(26);
		empOne.empDesignation("Senior Software Engineer");
		empOne.empSalary(1000);
		empOne.printEmployee();
		empTwo.empAge(21);
		empTwo.empDesignation("Software Engineer");
		empTwo.empSalary(500);
		empTwo.printEmployee();

//		Singleton s= Singleton.getInstance();
//		s.demo();
		
		
//		Dog dog = new Dog();
//		dog.color="Black";
//		dog.getColor();
//		
		
		
		// TODO Auto-generated method stub
//		System.out.println("Hello Pakistan");
		
//		TestClass t = new TestClass();
//		t.phone = TestClass.SmartPhones.SAMSUNG;
//		System.out.println("phone: "+t.phone);
		
	}

}
