package IVIS;

import java.util.*;

public class VehicleTreeMap {
	
	private List<VehicleInfo> vehicles;
	private List<CustomerInfo> customers;
	private Map<CustomerInfo,Set<VehicleInfo>> OwnerInfo=new HashMap<CustomerInfo,Set<VehicleInfo>>();
	
}
