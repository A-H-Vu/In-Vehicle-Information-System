package Main;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class MainSystem {
	static Scanner scan = new Scanner(System.in);
	public static VehicleSys sys = new VehicleSys();	
	public static  String firstName,lastName,country;
	public static  String brand,model,color,platNum;
	
	public static void main(String[] args) {
		printWelcome();
		sys.Entry();
		printOperation();
		int n=0;
		if(scan.hasNext()) {
			n=Integer.parseInt(scan.nextLine());
		}
		Operation(n);
	}
	
	public static void getInput() {
		if(scan.hasNext()) {
			System.out.println("============Please input the customer information:============");
			System.out.println("First Name:");
			firstName = scan.nextLine();
			System.out.println("Last Name:");
			lastName=scan.nextLine();
			System.out.println("Country:");
			country=scan.nextLine();
			System.out.println("============Please input the Vehicle information:============");
			System.out.println("Brand:");
			brand=scan.nextLine();
			System.out.println("Model:");
			model=scan.nextLine();
			System.out.println("Color:");
			color=scan.nextLine();
			System.out.println("Plate Number:");
			platNum=scan.nextLine();
		}
	}
	
	public static void getCus() {
		if(scan.hasNext()) {
			System.out.println("============Please input the customer information:============");
			System.out.println("First Name:");
			firstName = scan.nextLine();
			System.out.println("Last Name:");
			lastName=scan.nextLine();
			System.out.println("Country:");
			country=scan.nextLine();
		}
	}
	
	public static void Operation(int n) {
		switch(n) {
		case 1:
			getInput();
			VehicleInfo vi = new VehicleInfo(brand,model,color,platNum);
			CustomerInfo cus = new CustomerInfo(firstName,lastName,country);
			Set<VehicleInfo> vs = new HashSet<>();
			vs.add(vi);
			sys.Insertion(cus, vs);
			sys.Entry();
			break;
		case 2:
			sys.Entry();
			System.out.println("Which customer-vehicle informations you would wan to delete?");
			CustomerInfo cu = new CustomerInfo(firstName,lastName,country);
			sys.Deltetion(cu);
			break;
		case 3:
			sys.Entry();
			System.out.println("\"Which customer-vehicle informations you would wan to search?");
			CustomerInfo cu1 = new CustomerInfo(firstName,lastName,country);
			sys.Search(cu1);
			break;
		case 4:
			sys.Entry();
			break;
		}
	}
	
	private static void printWelcome() {
		System.out.println("============Welcome to Vehicle System============");
		System.out.println("There is all information in system:");
	}
	
	private static void printOperation() {
		System.out.println("============Select the operation:============");
		System.out.println("1.Insertion");
		System.out.println("2.Deltetion");
		System.out.println("3.Search");
		System.out.println("4.Entry");
	}
}
