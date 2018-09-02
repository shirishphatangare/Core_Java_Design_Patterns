package prototypepattern;

public class Address{
	String streetAddress;
	int apartmentNumber;
	
	public Address(String streetAddress,int apartmentNumber){
		this.streetAddress = streetAddress;
		this.apartmentNumber = apartmentNumber;
	}
	
	// Copy constructor is preferable to cloneable interface - because cloneable by default encourages shallow copying
	// Copy constructor solved problem of shallow copying and does deep copying
	public Address(Address otherAddress){
		this.streetAddress = otherAddress.streetAddress;
		this.apartmentNumber = otherAddress.apartmentNumber;
	}

	@Override
	public String toString() {
		return "Address [streetAddress=" + streetAddress + ", apartmentNumber=" + apartmentNumber + "]";
	}

}
