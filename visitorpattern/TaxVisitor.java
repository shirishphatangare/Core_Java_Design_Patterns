package visitorpattern;

public class TaxVisitor extends IVisitor{
	
	public TaxVisitor(double necessityTax, double liquorTax, double tobaccoTax){
		this.necessityTax = necessityTax;
		this.liquorTax = liquorTax;
		this.tobaccoTax = tobaccoTax;
	}
	
}
