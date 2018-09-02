package visitorpattern;

public class NecessityVisitable implements IVisitable{
	double price;
	
	public NecessityVisitable(double price){
		this.price = price;
	}
	
	
	
	public double getPrice() {
		return price;
	}



	public void setPrice(double price) {
		this.price = price;
	}



	@Override
	public Object accept(IVisitor visitor) {
		return visitor.visit(this);
	}

}
