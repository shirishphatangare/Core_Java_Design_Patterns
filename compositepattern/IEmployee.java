package compositepattern;

public abstract class IEmployee { // Main Component abstraction for composite pattern	
	
	int monthlySalary;
	String designation;
	String name;
	
	public IEmployee(String name,int monthlySalary,String designation){
		this.name = name;
		this.monthlySalary = monthlySalary;
		this.designation = designation;
	}
	
	public int getYearlySalary(){
		return monthlySalary * 12;
	}

	public String getDesignation() {
		return designation;
	}

	public String getName() {
		return name;
	}
}
