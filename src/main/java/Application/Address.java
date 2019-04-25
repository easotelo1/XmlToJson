package Application;

import java.util.ArrayList;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JacksonXmlRootElement(localName="Address")
public class Address {
	
	private String city;
	private String state;
	private int postalCode;
	
//	@JacksonXmlElementWrapper(localName="Street")
	@JacksonXmlProperty(localName="Street")
	@JacksonXmlElementWrapper(useWrapping = false)
	private ArrayList<Street> street;

	

	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getPostalCode() {
		return postalCode;
	}
	public void setPostalCode(int postalCode) {
		this.postalCode = postalCode;
	}
	public ArrayList<Street> getStreet() {
		return street;
	}
	public void setStreet(ArrayList<Street> street) {
		this.street = street;
	}



}
