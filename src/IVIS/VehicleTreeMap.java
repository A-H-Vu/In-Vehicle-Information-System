package IVIS;

import java.lang.management.ManagementFactory;
import java.lang.management.MemoryMXBean;
import java.lang.management.MemoryUsage;
import java.util.*;

public class VehicleTreeMap {

	private TreeMap<CustomerInfo, VehicleInfo> VTree;

	// Constructor to a empty Tree Map
	public VehicleTreeMap() {
		VTree = new TreeMap<>(new MyNameComp());
	}

	// Constructor and create n number of object
	public VehicleTreeMap(Integer n) {
		long start = System.currentTimeMillis();

		VTree = new TreeMap<>(new MyNameComp());
		for (int i = 0; i < n; i++) {
			CustomerInfo cu = new CustomerInfo();
			VehicleInfo ve = new VehicleInfo();
			VTree.put(cu, ve);
		}

		long end = System.currentTimeMillis();
		MemoryMXBean mem = ManagementFactory.getMemoryMXBean();
		MemoryUsage memoryUsage = mem.getHeapMemoryUsage();
		System.out.println("Construction took " + (end - start) + " millis second.");
		System.out.println("    Construction have size of " + n + " entries");
		System.out.println("    Construction took \n        " + memoryUsage);
	}

	// Insert method
	public void Insertion(CustomerInfo cu, VehicleInfo ve) {
		long start = System.currentTimeMillis();

		VTree.put(cu, ve);

		long end = System.currentTimeMillis();
		System.out.println("Inserted \n    Insertion took " + (end - start) + " millis second.");
	}

	// Delete method based on key
	public void Deletion(CustomerInfo cu) {
		long start = System.currentTimeMillis();

		VTree.remove(cu);

		long end = System.currentTimeMillis();
		System.out.println("Deleted \n    Deletion took " + (end - start) + " millis second.");
	}

	// Search method
	public VehicleInfo Search(CustomerInfo key) {
		long start = System.currentTimeMillis();

		VehicleInfo vi = VTree.get(key);

		long end = System.currentTimeMillis();
		System.out.println("Searched \n    Search took " + (end - start) + " millis second.");

		return vi;
	}

	// Print everything inside map
	public void Print() {
		Set<CustomerInfo> keys = VTree.keySet();
		int i = 0;
		for (CustomerInfo key : keys) {
			System.out.println(i++ + ": " + key + "\n    ==> " + VTree.get(key));
		}
	}
}

class MyNameComp implements Comparator<CustomerInfo> {
	@Override
	public int compare(CustomerInfo arg0, CustomerInfo arg1) {
		if (arg0.getPersonalID() > arg1.getPersonalID())
			return 1;
		else if (arg0.getPersonalID() < arg1.getPersonalID())
			return -1;
		else
			return 0;
	}
}