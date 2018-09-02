package compositepattern;


public class CompositeMain {

	public static void main(String[] args) {
		// composite nodes - ceo, director, manager (Employee Class)
		Employee ceo = new Employee("Andy", 15000, "chief Executing Officer"); 
		Employee director1 = new Employee("Keith", 11000, "Delivery Director");
		Employee director2 = new Employee("Smith", 11000, "Delivery Director");
		Employee manager1 = new Employee("Brandon", 10000, "Manager");
		Employee manager2 = new Employee("Swamy", 10000, "Manager");
		Employee manager3 = new Employee("Fatima", 10000, "Manager");
		Employee manager4 = new Employee("Gary", 10000, "Manager");

		// Leaf nodes - developer and tester (DevTestOps class)
		DevTestOps devoloper1 = new DevTestOps("Shirish", 5000, "Software Developer");
		DevTestOps devoloper2 = new DevTestOps("Baba", 5000, "Software Developer");
		DevTestOps devoloper3 = new DevTestOps("Tom", 5000, "Software Developer");
		DevTestOps tester1 = new DevTestOps("Shreyas", 4000, "Software Tester");
		DevTestOps tester2 = new DevTestOps("Jolly", 4000, "Software Tester");
		
		ceo.addSubordinate(director1);
		ceo.addSubordinate(director2);
		director1.addSubordinate(manager1);
		director1.addSubordinate(manager2);
		director2.addSubordinate(manager3);
		director2.addSubordinate(manager4);
		
		manager1.addSubordinate(devoloper1);
		manager2.addSubordinate(devoloper2);
		manager3.addSubordinate(devoloper3);
		manager4.addSubordinate(tester1);
		manager1.addSubordinate(tester2);
		manager3.removeSubordinate(devoloper3);
		
		System.out.println("Getting whole Company Employee Hierarchy with yearly salary of each Employee");
		printCompanyHierarchy(ceo);
	}	
	
	private static void printCompanyHierarchy(IEmployee emp){
		if(emp instanceof Employee){
			System.out.println(emp.getName() + "--" + emp.getDesignation() + "--" + emp.getYearlySalary());
			for(IEmployee emp1:((Employee) emp).getSubordinateList()){
				printCompanyHierarchy(emp1);
			}
		}else{
			System.out.println(emp.getName() + "--" + emp.getDesignation() + "--" + emp.getYearlySalary());
		}
	}

}
