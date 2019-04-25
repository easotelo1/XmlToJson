package Application;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JacksonXmlRootElement(localName="Street")
public class Street {
	
	private String name;
	private String type;
	
	public String getName() {
		return name;
	}
	public void setName(String streetName) {
		this.name = streetName;
	}
	public String getType() {
		return type;
	}
	public void setType(String streetType) {
		this.type = streetType;
	}
	
	

}
