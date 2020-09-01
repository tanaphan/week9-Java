package week9;

public class Dog {
	//instance Variable
	String breed;
	String size; 
	int age; 
	String color; 
	
	//method1 
	/*public String getInfo() { 
		return("Breed is: "+ breed +" size "+ size +" Age m + age +" color is: " + color);
	}*/ 
	public void print() { 
		System.out.println("Breed is: " + breed); 
		System.out.println("Size is: " + size);
		System.out.println("Age is: " + age); 
		System.out.println("color is: " + color);
	}
		
	public static void main(String[]args) {
		Dog maltese = new Dog(); 
		Dog napoleon = new Dog();
		Dog chowchow = new Dog();
		
		maltese.breed="Maltese"; 
		maltese.size="Small"; 
		maltese.age=2; 
		maltese.color="white"; 
		maltese.print();
		System.out.println("=======");
		
		napoleon.breed="Napoleon"; 
		napoleon.size="Large"; 
		napoleon.age=5; 
		napoleon.color="white"; 
		napoleon.print();
		System.out.println("=======");
		
		chowchow.breed="Chowchow"; 
		chowchow.size="Middle"; 
		chowchow.age=3; 
		chowchow.color="brown"; 
		chowchow.print();
		System.out.println("=======");
	}

}
