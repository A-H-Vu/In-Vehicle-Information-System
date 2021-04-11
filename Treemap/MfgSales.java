package sample;



public class MfgSales {

    private String manufacturer;
    private int count;

    /**
     * Initialize a new MfgSales object given the following parameters
     * @param manufacturer - The manufacturer string
     * @param count - The number of vehicles produced by the manufacturer
     */
    public MfgSales(String manufacturer,int count) {
        this.count = count;
        this.manufacturer =  manufacturer;
    }

    /**
     * Return the count of vehicles produced by the manufacturer
     * @return - The number of vehicles sold by the manufacturer
     */
    public int getCount() {
        return count;
    }

    /**
     * Set the count of vehicles sold by the manufacturer
     * @param count - Set the current manufacturer's number of vehicles produced to the new count
     */
    public void setCount(int count) {
        this.count = count;
    }

    /**
     * Returns the manufacturer name
     * @return - The name of the manufacturer
     */
    public String getManufacturer() {
        return manufacturer;
    }

    /**
     * Updates the manufacturer property with a new string parameter
     * @param manufacturer - The name of the manufacturer
     */
    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }
}
