package Project1;

public class Person implements Comparable<Person> {
	private String[] fullName = new String[3];
	private String firstName = "";
	private String middleName = "";
	private String lastName = "";
	private String telephoneNumber = "";
	private Address myAddress = new Address();
	private String[] everything = new String[8];
	
	Person(){
		
	}
	Person(String fullName, Address myAdress, String telephoneNum){
		this.fullName = fullName.split(" ");
		//System.out.println(this.fullName[0] + this.fullName[1]);
		this.firstName = this.fullName[0];
		if(this.fullName.length > 2) {
			for (int i = 1; i < this.fullName.length; i++) {
				if(i != this.fullName.length-1) {
					this.middleName += this.fullName[i] + " ";
				}
				else {
					this.lastName = this.fullName[i];
				}
			}
		}
		else {
			this.lastName = this.fullName[1];
		}
		//System.out.println(this.lastName);
		this.telephoneNumber = telephoneNum.substring(1, telephoneNum.length());
		this.myAddress = myAdress;
		everything[0] = firstName + " ";
		everything[2] = lastName + ",";
		if(!middleName.equals("")) {
		everything[1] = middleName + "";
		}
		else {
			everything[2] = middleName + "";
			everything[1] = lastName + ",";
		}
		everything[7] = telephoneNum;
		everything[3] = myAdress.getStreet() + ", ";
		everything[4] = myAdress.getCity() + ", ";
		everything[5] = myAdress.getState() + ", ";
		everything[6] = myAdress.getZip() + ", ";
		
		
		
	}
	
	
	public String[] getFullName() {
		return fullName;
	}
	public void setFullName(String[] fullName) {
		this.fullName = fullName;
	}
	public String[] getEverything() {
		return everything;
	}
	public void setEverything(String[] everything) {
		this.everything = everything;
	}
	public String getMiddleName() {
		return middleName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getTelephoneNumber() {
		return telephoneNumber;
	}
	public void setTelephoneNumber(String telephoneNumber) {
		this.telephoneNumber = telephoneNumber;
	}
	
	public Address getMyAddress() {
		return myAddress;
	}
	public void setMyAddress(Address myAddress) {
		this.myAddress = myAddress;
	}
	@Override
	public int compareTo(Person o) {
		String fullNameString = "";
		for (int i = 0; i < this.fullName.length; i++) {
			fullNameString += fullName[i];
		}
		String compareNameString = "";
		for (int i = 0; i < o.fullName.length; i++) {
			compareNameString += o.fullName[i];
		}
		
		return fullNameString.compareTo(compareNameString);
	}
	
	
	
	
	
}
