package builderpattern;

import java.util.ArrayList;
import java.util.List;

public class JsonBuilder implements IBuilder{
	List<JsonElement> jsonElements = new ArrayList<>();
	
	public JsonBuilder(){
		
	}
	
	@Override
	public void addChild(String key,String value) {
		JsonElement element = new JsonElement(key,value);
		jsonElements.add(element);
	}
	
	public String toString(){
		StringBuilder sb = new StringBuilder();
		sb.append("{");
		for(JsonElement e: jsonElements){
			sb.append(e.toString());
			sb.append(",");
		}
		sb.deleteCharAt(sb.lastIndexOf(","));
		sb.append("}");
		return sb.toString();
	}

}
