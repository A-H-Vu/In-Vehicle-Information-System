package Main;

public class VehicleInfo {
	private String brand;
	private String model;
	private String color;
	private String platNum;
	
	public VehicleInfo(String b,String m,String c,String p) {
	this.brand=b;
	this.model=m;
	this.color=c;
	this.platNum=p;
	}
	
	public void setBrand(String br) {
		this.brand=br;
	}
	
	public String getBrand() {
		return brand;
	}
	
	public void setModel(String mo) {
		this.model=mo;
	}
	
	public String getModel() {
		return model;
	}
	
	public void setColor(String co) {
		this.color=co;
	}
	
	public String getColor() {
		return color;
	}
	
	public void setPlatNum(String pn) {
		this.platNum=pn;
	}
	
	public String getPlatNum() {
		return platNum;
	}
	
	public String toString() {
		return "Brand: "+brand+"\tModel: "+model+"\tColor: "+color+"\tPlatNum: "+platNum;
	}
}
