package prototypepattern;

import java.util.HashMap;
import java.util.Map;

public class PersonFactory {
	private static Person person = null;
	private static Map<String,Person> personObjectMap = new HashMap<>();
	
	public static Person createPersonObject(){
		if(personObjectMap.get("person") == null){
			System.out.println("Creating a Person object..");
			person = new Person(new String[]{"Shirish", "Phatangare"}, new Address("Sweet Apple CV", 123));
			personObjectMap.put("person", person);
			return person;
		}else{
			System.out.println("Cloning a Person object..");
			Person clonedPerson = new Person(personObjectMap.get("person")); // Cloning using copy constructor
			return clonedPerson;
		}
	} 
}
