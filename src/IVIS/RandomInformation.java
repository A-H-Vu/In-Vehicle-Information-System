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
