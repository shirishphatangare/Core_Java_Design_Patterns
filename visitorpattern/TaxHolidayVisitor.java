package visitorpattern;

public class TaxHolidayVisitor extends IVisitor {

	public TaxHolidayVisitor(double necessityTax, double liquorTax, double tobaccoTax){
		this.necessityTax = necessityTax;
		this.liquorTax = liquorTax;
		this.tobaccoTax = tobaccoTax;
	}
	
}
