package builderpattern;


public class JsonElement {
	String key ;
	String value;
	
	
	
	public JsonElement(String key,String value){
		this.key=key;
		this.value=value;
	}
	
	public String toString(){
		StringBuilder sb = new StringBuilder();
		sb.append(key);
		sb.append(":");
		
		if(value instanceof String){
			sb.append("'");
			sb.append(value);
			sb.append("'");
		}
		
		
		return sb.toString();
	}

}
