package IVIS;

import java.util.*;

public class RandomInformation {
	
	public String randomLastName() {
		List<String> LN = new ArrayList<String>();
		LN.add("Smith");
		LN.add("Johnson");
		LN.add("Williams");
		LN.add("Brown");
		LN.add("Jones");
		LN.add("Johnson");	
		LN.add("Garcia");
		LN.add("Miller");
		LN.add("Davis");
		LN.add("Rodriguez");
		LN.add("Martinez");
		LN.add("Hernandez");	
		LN.add("Lopez");
		LN.add("Gonzalez");
		LN.add("Wilson");
		LN.add("Anderson");
		LN.add("Thomas");
		LN.add("Taylor");	
		LN.add("Moore");
		LN.add("Jackson");
		LN.add("Martin");
		LN.add("Lee");
		LN.add("Perez");
		LN.add("Thompson");
		int LNsize = LN.size();
		return LN.get((int)(Math.random()*LNsize));
	}
	
	public String randomFirstName() {
		List<String> LN = new ArrayList<String>();
		LN.add("James");
		LN.add("Mary");
		LN.add("John");
		LN.add("Patricia");
		LN.add("Robert");
		LN.add("Jennifer");
		LN.add("Michael");
		LN.add("Linda");
		LN.add("William");
		LN.add("Elizabeth");
		LN.add("David");
		LN.add("Barbara");
		int LNsize = LN.size();
		return LN.get((int)(Math.random()*LNsize));
	}
	
	public String randomCountryName() {
		List<String> LN = new ArrayList<String>();
		LN.add("Russia");
		LN.add("Canada");
		LN.add("United States");
		LN.add("China");
		LN.add("Brazil");
		LN.add("Australia");
		LN.add("India");
		LN.add("Argentina");
		LN.add("Kazakhstan");
		LN.add("Algeria");
		LN.add("Denmark");
		LN.add("Mexico");
		LN.add("Indonesia");
		LN.add("Sudan");
		LN.add("Libya");
		int LNsize = LN.size();
		return LN.get((int)(Math.random()*LNsize));
	}
	
	public long randomID() {		
		return (long)(Math.random() * (long)999999999999.);
	}
	
	public String randomCarBrandName() {
		List<String> LN = new ArrayList<String>();
		LN.add("Toyota");
		LN.add("Mercedes-Benz");
		LN.add("BMW GmbH");
		LN.add("Honda");
		LN.add("Hyundai");
		LN.add("Tesla");
		LN.add("Ford");
		LN.add("Audi");
		LN.add("Volkswagen");
		LN.add("Porsche");
		LN.add("Nissan");
		int LNsize = LN.size();
		return LN.get((int)(Math.random()*LNsize));
	}
	
	public String randomModelName() {
		List<String> LN = new ArrayList<String>();
		LN.add("Model A");
		LN.add("Model B");
		LN.add("Model C");
		LN.add("Model D");
		LN.add("Model E");
		LN.add("Model F");
		int LNsize = LN.size();
		return LN.get((int)(Math.random()*LNsize));
	}
	
	public String randomColourName() {
		List<String> LN = new ArrayList<String>();
		LN.add("Red");
		LN.add("Black");
		LN.add("Grey");
		LN.add("White");
		LN.add("Yellow");
		LN.add("DarkBlue");
		int LNsize = LN.size();
		return LN.get((int)(Math.random()*LNsize));
	}
	
	public String randomPlatName() {
		List<String> LN = new ArrayList<String>();
		
		for(int j = 0; j < 10; j ++) {
			int leftLimit = 65;
		    int rightLimit = 90;
		    int targetStringLength = 10;
		    Random random = new Random();
		    StringBuilder buffer = new StringBuilder(targetStringLength);
		    for (int i = 0; i < targetStringLength; i++) {
		    	if(i>=4) {
		    		leftLimit = 48;
		    		rightLimit = 57;
		    	}
		        int randomLimitedInt = leftLimit + (int) 
		          (random.nextFloat() * (rightLimit - leftLimit + 1));
		        buffer.append((char) randomLimitedInt);
		    }
		    String generatedString = buffer.toString();
		    
		    LN.add(generatedString);
		}
		
		int LNsize = LN.size();
		return LN.get((int)Math.random()*LNsize);
	}
}
