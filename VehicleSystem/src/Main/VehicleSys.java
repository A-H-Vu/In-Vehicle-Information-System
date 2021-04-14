package Main;

import java.util.HashMap;
import java.util.Map;

public class VehicleSys {

private VehicleInfo vehicles=new VehicleInfo();
private CustomerInfo customers=new CustomerInfo();
private Map<CustomerInfo,VehicleInfo> OwnerInfo=new HashMap<CustomerInfo,VehicleInfo>();

public VehicleSys() {
	
}

public void InsertVehicle(VehicleInfo ve) {
		this.vehicles=ve;
	}

public VehicleInfo GetVehicle() {
  return vehicles; 	
}

public void InsertCustomer(CustomerInfo cu) {
	this.customers=cu;
}

public CustomerInfo GetCustomer() {
	return customers;
}
public void Insertion(CustomerInfo cu,VehicleInfo ve) {
	OwnerInfo.put(cu, ve);
}

public void Deltetion(CustomerInfo cu) {
	OwnerInfo.remove(cu);
}

public void Search(CustomerInfo cu) {
	OwnerInfo.get(cu);
}
public void Entry() {	
	for(CustomerInfo i:OwnerInfo.keySet()) {
			System.out.println("CustomerInfo "+i+"\tVehicleInfo "+OwnerInfo.get(i));
	}
}

public boolean equals(Object obj) {
	if(this==obj) {
		return true;
	}
	if(obj==null) {
		return false;
	}
	if(getClass()!=obj.getClass()) {
		return false;
	}
	VehicleSys other=(VehicleSys)obj;
	if(vehicles!=other.vehicles) {
		return false;
	}
	return true;
}

}
