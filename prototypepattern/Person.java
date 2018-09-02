package prototypepattern;

import java.util.Arrays;

public class Person{
	String [] name;
	Address address;
	
	public Person(String [] name, Address address){
		this.name = name;
		this.address = address;
	}
	
	// Copy constructor is preferable to cloneable interface - because cloneable by default encourages shallow copying
	// Copy constructor solved problem of shallow copying and does deep copying
	public Person(Person otherPerson){ 
		this.name = otherPerson.name.clone();
		this.address = new Address(otherPerson.address);
	}

	@Override
	public String toString() {
		return "Person [name=" + Arrays.toString(name) + ", address=" + address.toString() + "]";
	}

}
