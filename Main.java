package Project1;

import java.util.Scanner;
import java.util.Arrays;

public class Main {
	
	public static void main(String[] args) {
		Phonebook myPhoneBook = new Phonebook();
		mainOne(myPhoneBook);
	}

	public static void mainOne(Phonebook myPhoneBook) {
		int actions = 0;
		Scanner in = new Scanner(System.in);
		System.out.println("What would you like to do \n 1. Add new record \n 2. Delete a record \n 3. Update a Record \n 4. Show record in ASC order "
				+ "\n 5. Search Record \n 6. Exit");
		actions = in.nextInt();
		switch(actions) {
		
		
		case 1:
			System.out.println("please fill out the Full Name, Address, TelephoneNumber");
			in.nextLine();
			String entry = in.nextLine();
			String[] myEntry = entry.split(",");
			//System.out.println(Arrays.toString(myEntry));
			Address aEntry = new Address(myEntry[1], myEntry[2], myEntry[3], myEntry[4]);
			Person pEntry = new Person(myEntry[0], aEntry, myEntry[5]);
			myPhoneBook.setMyRecords(myPhoneBook.addingToTheRecord(myPhoneBook.getMyRecords(), pEntry));
			PrintOutMyList(myPhoneBook.getMyRecords());
			break;
			
			
			
		case 2:
			System.out.println("Please give me the phone number of the person you want to remove.");
			String myInput = in.next();
			String thePhoneNumber = "";
			for (int i = 0; i < myInput.length(); i++) {
				char x = myInput.charAt(i);
				if(x == '(' || x ==')' || x == '-') {
					
				}
				else {
					thePhoneNumber += x;
				}
			}
			myPhoneBook.removingFromTheRecord(myPhoneBook.getMyRecords(), thePhoneNumber);
			PrintOutMyList(myPhoneBook.getMyRecords());
			break;
			
			
			
		case 3:
			System.out.println("Please give me a phone number so that you can update the record: ");
			in.nextLine();
			String numRef = in.next();
			int myRefIndex = myPhoneBook.gettingReferenceForUpdate(numRef);
			Arrays.stream(myPhoneBook.getMyRecords()[myRefIndex].getEverything()).forEach(System.out::print);
			in.nextLine();
			System.out.println("\nPlease give me the updated version of the record: ");
			String updatedEntry = in.nextLine();
			String[] myARREntry = updatedEntry.split(",");
			//System.out.println(Arrays.toString(myARREntry));
			Address aUpdatedEntry = new Address(myARREntry[1], myARREntry[2], myARREntry[3], myARREntry[4]);
			Person pUpdatedEntry = new Person(myARREntry[0], aUpdatedEntry, myARREntry[5]);
			myPhoneBook.UpdatingRecord(pUpdatedEntry, myRefIndex);
			PrintOutMyList(myPhoneBook.getMyRecords());
			break;
			
			
		case 4:
			Arrays.sort(myPhoneBook.getMyRecords());
			PrintOutMyList(myPhoneBook.getMyRecords());
			break;
			
			
		case 5:
			System.out.println("How would you like to search: \n 1. First Name \n 2. Last Name \n 3. Full Name \n 4. Telephone Number \n 5. City or State");
			int searching = in.nextInt();
			switch(searching) {
			
			
				case 1:
					System.out.println("What is there first name?");
					String sfirstName = in.next();
					Person[] mySearchRefFirst = myPhoneBook.searchingfirstName(sfirstName);
					PrintOutMyList(mySearchRefFirst);
					break;
					
					
				case 2:
					System.out.println("What is there last name?");
					String slastName = in.next();
					Person[] mySearchRefLast = myPhoneBook.searchinglastName(slastName);
					PrintOutMyList(mySearchRefLast);
					break;
					
					
				case 3:
					System.out.println("What is there full name?");
					in.nextLine();
					String sfullName = in.nextLine();
					Person[] mySearchRefFull = myPhoneBook.searchingfullName(sfullName);
					PrintOutMyList(mySearchRefFull);
					break;
					
					
				case 4:
					System.out.println("What is there number?");
					String sTele = in.next();
					Person[] mySearchRefTele = myPhoneBook.searchingtelephoneNumber(sTele);
					PrintOutMyList(mySearchRefTele);
					break;
					
					
				case 5:
					System.out.println("What is there City or State?");
					in.nextLine();
					String sCityState = in.nextLine();
					Person[] mySearchRefCityState = myPhoneBook.searchingCityState(sCityState);
					PrintOutMyList(mySearchRefCityState);
					break;
			}
		case 6:
			System.exit(0);
			in.close();
			break;
		}
		mainOne(myPhoneBook);
	}
	
	
	public static void PrintOutMyList(Person[] person) {
		for (int i = 0; i < person.length; i++) {
			Person refP = new Person();
			refP = person[i];
			//refP.setTelephoneNumber( "("+refP.getTelephoneNumber().substring(1,4)+")-"+refP.getTelephoneNumber().substring(4,7)+"-"+refP.getTelephoneNumber().substring(7,11));
			//Arrays.stream(refP.getEverything()).forEach(System.out::print);
			String strRef = "";
			
			for(int j = 0; j < refP.getEverything().length; j++) {
				String str = refP.getEverything()[j];
				if(j == refP.getEverything().length-1) {
					strRef += "("+refP.getTelephoneNumber().substring(0,3)+")-"+refP.getTelephoneNumber().substring(3,6)+"-"+refP.getTelephoneNumber().substring(6,10);
				}
				else {
					strRef += str;
				}
			}
			System.out.println(strRef);
			//System.out.println();
		}
	}
	
}
