package visitorpattern;

public class IVisitor {
	
	protected double liquorTax;
	protected double tobaccoTax;
	protected double necessityTax;
	
	
	
	protected Object visit(IVisitable visitable) {
		if(visitable instanceof NecessityVisitable){
			double necessityPrice = ((NecessityVisitable) visitable).getPrice();
			double nTax = necessityTax * necessityPrice;
			return (Double) necessityPrice + nTax;
		} else if(visitable instanceof TobaccoVisitable){
			double tobaccoPrice = ((TobaccoVisitable) visitable).getPrice();
			double tTax = tobaccoTax * tobaccoPrice;
			return (Double) tobaccoPrice + tTax;
		} else if(visitable instanceof LiquorVisitable){
			double liquorPrice = ((LiquorVisitable) visitable).getPrice();
			double lTax = liquorTax * liquorPrice;
			return (Double) liquorPrice + lTax;
		} else{
			return null;
		}
	}
}
