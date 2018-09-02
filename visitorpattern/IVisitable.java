package visitorpattern;

public interface IVisitable {
	public Object accept(IVisitor visitor);
	
	
}
