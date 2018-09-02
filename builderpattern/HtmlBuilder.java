package builderpattern;

public class HtmlBuilder implements Builder{

	HtmlElement rootElement;
	
	public HtmlBuilder(HtmlElement rootElement) {
		this.rootElement = rootElement;
	}
	
	@Override
	public void addChild(String childName, String childText) {
		HtmlElement e = new HtmlElement(childName, childText); 
		rootElement.elements.add(e);
	}
	
	public String toString() {
		return rootElement.toString();
	}
	

}
