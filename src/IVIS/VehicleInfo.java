package IVIS;

public class VehicleInfo{ 
	private String brand;
	private String model;
	private String color;
	private String platNum;
	
	public VehicleInfo() {	
		RandomInformation ri = new RandomInformation();
		setBrand(ri.randomCarBrandName());
		setModel(ri.randomModelName());
		setColor(ri.randomColourName());
		setPlatNum(ri.randomPlatName());
	}
	
	public VehicleInfo(String b,String m,String co,String p) {
		setBrand(b);
		setModel(m);
		setColor(co);
		setPlatNum(p);
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

	@Override
	public String toString() {
		return "VehicleInfo [brand=" + brand + ", model=" + model + ", color=" + color + ", platNum=" + platNum + "]";
	}

}
