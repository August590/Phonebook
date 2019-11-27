package Project1;

import java.util.Arrays;

public class Phonebook {

	
	private Person[] myRecords = new Person[0];
	
	Phonebook(Person...persons) {
		myRecords = new Person[persons.length];
		for (int i = 0; i < myRecords.length; i++) {
			myRecords[i] = persons[i];
		}
		
		
	}
	
	
	public Person[] addingToTheRecord(Person[] myOldRecord, Person persons) {
		
		this.myRecords = new Person[myOldRecord.length + 1];
		
		for (int i = 0; i < myRecords.length; i++) {
			if( i > myOldRecord.length-1) {
				myRecords[i] = persons;
			}
			else {
				myRecords[i] = myOldRecord[i];
			}
		}
		return myRecords;
		
		
	}
	
	
	public Person[] removingFromTheRecord(Person[] myOldRecord, String input) {
	
		myRecords = new Person[myOldRecord.length-1];
		
		for (int i = 0; i < myOldRecord.length-1; i++) {
			if(myOldRecord[i].getTelephoneNumber().equals(input)) {
				myOldRecord[i] = myOldRecord[myOldRecord.length-1];
				myRecords[i] = myOldRecord[i];
			}
			myRecords[i] = myOldRecord[i];
		}
		return myRecords;
		
	}
	
	
	public int gettingReferenceForUpdate(String number) {
		for (int i = 0; i < myRecords.length; i++) {
			if(number.equals(myRecords[i].getTelephoneNumber())) {
				return i;
			}
		}
		return 0;
	}
	
	
	public void UpdatingRecord(Person person, int myPos) {
		
		myRecords[myPos] = person;
		
	}
	
	
	public Person gettingPersonFromTheRecord(Person[] myRecord, int input) {
		for (int i = 0; i < myRecord.length; i++) {
			if(i == input) {
				return myRecord[i];
			}
		}
		Person Broken = new Person();
		return Broken;
	}

	
	public Person[] getMyRecords() {
		return myRecords;
	}

	
	public void setMyRecords(Person[] myRecords) {
		this.myRecords = myRecords;
	}
	
	
	public Person[] searchingfirstName(String firstName) {
		int sizeOfPerson = 0;

		for(Person person : myRecords) {
			if(firstName.equals(person.getFirstName())){
				sizeOfPerson++;
			}
		}
		Person[] myNames = new Person[sizeOfPerson];
		int x = 0;
		for (int i = 0; i < myRecords.length; i++) {
			if(firstName.equals(myRecords[i].getFirstName())){
				myNames[x] = myRecords[i];
				x++;
			}
			
		}
		
		return myNames;
	}
	
	
	public Person[] searchinglastName(String lastName) {
			
		int sizeOfPerson = 0;

		for(Person person : myRecords) {
			if(lastName.equals(person.getLastName())){
				sizeOfPerson++;
			}
		}
		Person[] myNames = new Person[sizeOfPerson];
		int x = 0;
		for (int i = 0; i < myRecords.length; i++) {
			if(lastName.equals(myRecords[i].getLastName())){
				myNames[x] = myRecords[i];
				x++;
			}
			
		}
		
		return myNames;
			
	}
	public Person[] searchingfullName(String fullName) {
		
		int sizeOfPerson = 0;
		for(Person person : myRecords) {
			String personFullName = person.getFirstName() + " " + person.getMiddleName() + "" + person.getLastName();

			if(fullName.equals(personFullName)){
				sizeOfPerson++;
			}
		}
		Person[] myNames = new Person[sizeOfPerson];
		int x = 0;
		for (int i = 0; i < myRecords.length; i++) {
			if(fullName.equals(myRecords[i].getFirstName() + " " + myRecords[i].getMiddleName() + "" + myRecords[i].getLastName())){
				myNames[x] = myRecords[i];
				x++;
			}
			
		}
		
		return myNames;
		
	}
	public Person[] searchingtelephoneNumber(String telephoneNumber) {
		
		int sizeOfPerson = 0;

		for(Person person : myRecords) {
			if(telephoneNumber.equals(person.getTelephoneNumber())){
				sizeOfPerson++;
			}
		}
		Person[] myNames = new Person[sizeOfPerson];
		int x = 0;
		for (int i = 0; i < myRecords.length; i++) {
			if(telephoneNumber.equals(myRecords[i].getTelephoneNumber())){
				myNames[x] = myRecords[i];
				x++;
			}
			
		}
		
		return myNames;
		
	}
	public Person[] searchingCityState(String cityState) {
		
		int sizeOfPerson = 0;

		for(Person person : myRecords) {
			if(cityState.equals(person.getMyAddress().getCity())){
				sizeOfPerson++;
			}
			else if (cityState.equals(person.getMyAddress().getState())) {
				sizeOfPerson++;
			}
		}
		Person[] myNames = new Person[sizeOfPerson];
		int x = 0;
		for (int i = 0; i < myRecords.length; i++) {
			if(cityState.equals(myRecords[i].getMyAddress().getCity())){
				myNames[x] = myRecords[i];
				x++;
			}
			else if(cityState.equals(myRecords[i].getMyAddress().getState())) {
				myNames[x] = myRecords[i];
				x++;
			}
			
		}
		
		return myNames;
		
	}

	@Override
	public String toString() {
		return "Phonebook [myRecords=" + Arrays.toString(myRecords) + "]";
	}



	
	
	
}
