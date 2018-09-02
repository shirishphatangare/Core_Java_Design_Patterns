package prototypepattern;

public class PrototypeMain {

	public static void main(String[] args) {
		Person person = PersonFactory.createPersonObject(); 
		System.out.println("Original Person object: " + person);
		
		Person clonedPerson1 = PersonFactory.createPersonObject(); 
		System.out.println("Cloned Person object: " + clonedPerson1);
		
		Person clonedPerson2 = PersonFactory.createPersonObject(); 
		System.out.println("Updating Cloned Person object: " + clonedPerson2);
		clonedPerson2.name[0] = "Raja";
		clonedPerson2.address.streetAddress = "67 Iron Creek N";
		System.out.println("Cloned Person object: " + clonedPerson2);
		
		Person clonedPerson3 = PersonFactory.createPersonObject(); 
		System.out.println("Cloned Person object: " + clonedPerson3);

	}

}
