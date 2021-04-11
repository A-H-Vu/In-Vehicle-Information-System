package IVIS;

import java.util.*;

public class VehicleTreeMap {

	private TreeMap<CustomerInfo, VehicleInfo> VTree;

	//Constructor to a empty Tree Map
	public VehicleTreeMap() {
		VTree = new TreeMap<>(new MyNameComp());
	}
	
	//Constructor and create n number of object
	public VehicleTreeMap(Integer n) {
		VTree = new TreeMap<>(new MyNameComp());
		
		for(int i = 0 ; i < n; i ++) {
			CustomerInfo cu = new CustomerInfo();
			VehicleInfo ve = new VehicleInfo();
			Insertion(cu,ve);
		}
	}

	//Insert method
	public void Insertion(CustomerInfo cu, VehicleInfo ve) {
		VTree.put(cu, ve);
	}
	
	//Delete method based on key
	public void Deletion(CustomerInfo cu) {
		VTree.remove(cu);
	}
	
	//Print everything inside map
	public void Print() {
		Set<CustomerInfo> keys = VTree.keySet();
		int i = 0;
		for (CustomerInfo key : keys) {
			System.out.println(i++ + ": " + key + "\n    ==> " + VTree.get(key));
		}
	}

//	public VehicleInfo Search(CustomerInfo key) {
//		return OwnerInfoTree.get(key);
//	}

}

class MyNameComp implements Comparator<CustomerInfo> {
	@Override
	public int compare(CustomerInfo arg0, CustomerInfo arg1) {
		  if(arg0.getPersonalID() > arg1.getPersonalID()) return 1;
		  else if(arg0.getPersonalID() < arg1.getPersonalID()) return -1;
		  else return 0; 
	}
}