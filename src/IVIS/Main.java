package IVIS;

public class Main {

	public static void main(String[] args) {
		System.out.println("Hello");
		
//		VehicleTreeMap vh = new VehicleTreeMap();
//		CustomerInfo cu = new CustomerInfo("Teng","Zhang","China");
//		VehicleInfo ve = new VehicleInfo("Ford","Model-T","Red","A1231");
//		CustomerInfo cu1 = new CustomerInfo("TTTTeng","Zhang","China");
//		
//		vh.Print();
//		System.out.println("========");
//		vh.Insertion(cu, ve);
//		vh.Insertion(cu1, ve);
//		System.out.println("========");
//		vh.Print();
//		vh.Deletion(cu);
//		System.out.println("========");
//		vh.Print();
//		System.out.println("==============");
		
		VehicleTreeMap vh1 = new VehicleTreeMap(100000);
		vh1.Print();
	}

}
