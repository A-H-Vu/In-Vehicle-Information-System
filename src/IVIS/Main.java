package IVIS;

public class Main {

	public static void main(String[] args) {
		System.out.println("Program started");

		// Object of n numbers and time it took
		VehicleTreeMap vh1 = new VehicleTreeMap(20000000);

		// Create the key and value for insert and time it took
		CustomerInfo cu = new CustomerInfo("T", "Z", "Canada", 1323123);
		VehicleInfo ve = new VehicleInfo("Ford", "Model-T", "Red", "A1231");
		vh1.Insertion(cu, ve);

		// Search tree by using key, return the value, print the result and print the
		// time it took
		vh1.Search(cu);

		// use key for delete and time it took
		vh1.Deletion(cu);
	}

}
