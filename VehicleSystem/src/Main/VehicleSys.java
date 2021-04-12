package Main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class VehicleSys {
	
private List<VehicleInfo> vehicles;
private List<CustomerInfo> customers;
private Map<CustomerInfo,VehicleInfo> OwnerInfo=new HashMap<CustomerInfo,VehicleInfo>();


public VehicleSys() {
	
	vehicles=new ArrayList<VehicleInfo>();
	customers=new ArrayList<CustomerInfo>();
	
}

public void InsertVehicle(VehicleInfo ve) {
	if(vehicles.contains(ve)) {
		System.out.println("Error Message:This vehicle information already be contained");
	}
	if(ve==null) {
		System.out.println("Error Message:Null vehicle information,Pleas input the information first");
	}
	else {
		vehicles.add(ve);
	}
}

public void DeleteVehicle(VehicleInfo ve) {
	if(!vehicles.contains(ve)) {
		System.out.println("Error Message:Not found the vehicle information,Please input the information first");
	}
	if(ve==null) {
		System.out.println("Error Message:Null vehicle information,Pleas input the information first");
	}
	else {
		vehicles.remove(ve);
	}
}

public void GetVehicle(VehicleInfo ve) {
	if(!vehicles.contains(ve)) {
		System.out.println("Error Message:Not found the vehicle information,Please input the information first");
	}
	if(ve==null) {
		System.out.println("Error Message:Null vehicle information,Pleas input the information first");
	}
	else {
		System.out.println(ve.toString());
	}
}

public void InsertCustomer(CustomerInfo cu) {
	if(customers.contains(cu)) {
		System.out.println("Error Message:This customer information already be contained");
	}
	if(cu==null) {
		System.out.println("Error Message:Null customer information,Pleas input the information first");
	}
	else {
		customers.add(cu);
	}
}

public void DeleteCustomer(CustomerInfo cu) {
	if(!customers.contains(cu)) {
		System.out.println("Error Message:Not found the customer information,Please input the information first");
	}
	if(cu==null) {
		System.out.println("Error Message:Null customer information,Pleas input the information first");
	}
	else {
		customers.remove(cu);
	}
}

public void GetCustomer(CustomerInfo cu) {
	if(!customers.contains(cu)) {
		System.out.println("Error Message:Not found the customer information,Please input the information first");
	}
	if(cu==null) {
		System.out.println("Error Message:Null customer information,Pleas input the information first");
	}
	else {
		System.out.println(cu.toString());
	}
}

public void Insertion(CustomerInfo cu,VehicleInfo ve) {
	OwnerInfo.put(cu, ve);
	InsertCustomer(cu);
	InsertVehicle(ve);
}

public void Deltetion(CustomerInfo cu) {
	OwnerInfo.remove(cu);
}

public void Search(CustomerInfo cu) {
	GetCustomer(cu);
	System.out.println(OwnerInfo.get(cu));
}

public void Entry() {
	System.out.println(OwnerInfo.entrySet());
}

}
