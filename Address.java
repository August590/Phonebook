package Project1;

public class Address {

	private String Street = "";
	private String City = "";
	private String State = "";
	private String Zip = "";
	
	
	Address(){
		
	}
	
	Address(String Street, String City, String State, String Zip){
		
		this.Street = Street.substring(1,Street.length());
		this.City = City.substring(1,City.length());
		this.State = State.substring(1,State.length());
		this.Zip = Zip.substring(1,Zip.length());
	}
	
	
	
	
	
	public String getStreet() {
		return Street;
	}
	public void setStreet(String street) {
		Street = street;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	public String getState() {
		return State;
	}
	public void setState(String state) {
		State = state;
	}
	public String getZip() {
		return Zip;
	}
	public void setZip(String zip) {
		Zip = zip;
	}
	
	
	
	
}
