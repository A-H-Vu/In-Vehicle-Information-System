package Main;

import java.util.*;
import java.util.Scanner;

public class Vehichsys {
	
	private static HashMap<String,VehicleInfo> sys;
	private static VehicleInfo v;
	private String Customer;
	private String brand;
	private String model;
	private String color;
	private String platNum;
	
	
	public Vehichsys(int n) {
		sys = new HashMap<String,VehicleInfo>(n);
	}
	
	public void SetVehicle(String b,String m,String c,String p) {
		v.setBrand(b);
		v.setModel(m);
		v.setColor(c);
		v.setPlatNum(p);
	}
	
	public void Insertion(String name) {
		this.Customer = name;
		sys.put(Customer, v);
	}
	
	public void Deletion(String name) {
		sys.remove(name);
	}
	
	public void Search(String name) {
		if(sys.containsKey(name)) {
			System.out.println(sys.get(name));
		}
		else {
			System.out.println("Sorry,the system did not find the "+name+"'s vehicle information");
		}
	}
	
	public static void main(String[] args) {

	}
	
	
}
