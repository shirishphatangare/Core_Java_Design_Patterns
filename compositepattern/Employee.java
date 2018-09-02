package compositepattern;

import java.util.ArrayList;
import java.util.List;

public class Employee extends IEmployee{

	List<IEmployee> subordinateList = new ArrayList<IEmployee>(); 
	
	public Employee(String name,int monthlySalary,String designation){
		super(name, monthlySalary, designation);
	}
	
	public void addSubordinate(IEmployee emp){
		subordinateList.add(emp);
	}
	
	public void removeSubordinate(IEmployee emp){
		if (subordinateList.contains(emp)){
			subordinateList.remove(emp);
		}
	}
	
	public List<IEmployee> getSubordinateList() {
		return subordinateList;
	}

	public List<IEmployee> getChilds(){
		return getSubordinateList();
	}
	
}
