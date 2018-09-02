package builderpattern;

import java.util.ArrayList;
import java.util.List;

public class HtmlElement {
	
	String tagName;
	String tagContents;
	List<HtmlElement> elements = new ArrayList<>();
	
	public HtmlElement(String tagName,String tagContents) {
		this.tagName = tagName;
		this.tagContents = tagContents;
	}

	public String getTagName() {
		return tagName;
	}

	public void setTagName(String tagName) {
		this.tagName = tagName;
	}

	public String getTagContents() {
		return tagContents;
	}

	public void setTagContents(String tagContents) {
		this.tagContents = tagContents;
	}

	public List<HtmlElement> getElements() {
		return elements;
	}

	public void setElements(List<HtmlElement> elements) {
		this.elements = elements;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(String.format("<%s>", tagName));
		
		if(tagContents != null || !tagContents.isEmpty()) {
			sb.append(tagContents);
		}	
		
		for(HtmlElement e: elements) {
			sb.append(e.toString());
		}
		
		sb.append(String.format("</%s>", tagName));
		return sb.toString();
	}
	
}
