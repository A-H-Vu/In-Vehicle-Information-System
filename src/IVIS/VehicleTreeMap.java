package IVIS;

import java.util.*;

public class VehicleTreeMap {
	
	private TreeMap<CustomerInfo, VehicleInfo> VTree;
	
	public VehicleTreeMap() {
		VTree  = new TreeMap<>();
	}
	
	public void Insertion(CustomerInfo cu, VehicleInfo ve) {
		VTree.put(cu, ve);
	}
	
	public void Print() {
		System.out.println(VTree);
	}
	
//	public VehicleInfo Search(CustomerInfo key) {
//		return OwnerInfoTree.get(key);
//	}
	
}
