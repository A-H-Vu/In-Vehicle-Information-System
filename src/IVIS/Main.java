package IVIS;

public class Main {

	public static void main(String[] args) {
		System.out.println("Hello");
		
		VehicleTreeMap vh = new VehicleTreeMap();
		
		CustomerInfo cu = new CustomerInfo("Tom","Ruby","America");
		VehicleInfo ve = new VehicleInfo("Ford","Model-T","Red","A1231");
		
		vh.Print();
		vh.Insertion(cu, ve);
		
		//System.out.println(vh.Search(cu));
	}

}
