package week9;
import java.util.Date;

public class employee {
	String name;
	String address;
	Date DateOfJoin;
	int age;
	double salary;
	public void print() {
		System.out.println("Name:" + name);
		System.out.println("Address:" + address);
		System.out.println("Date of Join: " + DateOfJoin);
		System.out.println("Age; " + age);
		System.out.println("Saraly : " + salary);
		}
	
	public static void main(String[]args) {
		employee Ice = new employee();//object1 variable)
		employee Ice2 = new employee();//object2 variable)
		
		Ice.name="Jhon";
		Ice.address="Neansai";
		Ice.DateOfJoin=new Date();
		Ice.age=20;
		Ice.salary=1999;
		Ice.print();
		System.out.println("=======");
		Ice2.name="Jhon";
		Ice2.address="Neansai";
		Ice2.DateOfJoin=new Date();
		Ice2.age=20;
		Ice2.salary=1999;
		Ice2.print();
	}

}
