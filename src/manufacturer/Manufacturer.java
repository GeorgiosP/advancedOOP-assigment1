package manufacturer;

/**
 * Created by gpsar on 10/9/2016.
 */
public class Manufacturer {
    /*
    * String Name
    * String Location
    * String Shipping agreement CIF or FOB */
    private String name, location, shippingAgreement;
    public Manufacturer(String name, String location, String shippingAgreement){
        this.name = name;
        this.location = location;
        this.shippingAgreement = shippingAgreement;
    }

    public String getLocation() {
        return location;
    }

    public String getName() {
        return name;
    }

    public String getShippingAgreement() {
        return shippingAgreement;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setShippingAgreement(String shippingAgreement) {
        this.shippingAgreement = shippingAgreement;
    }

    public String toString() {
        String manufacturerInfo = "";

        /* add the following
            manufacturer name
            manufacturer location
            manufacturer shipping agreement
         */
        manufacturerInfo += "\nManufacturer: " + getName();
        manufacturerInfo += "\nLocation: " + getLocation();
        manufacturerInfo += "\nShipping Agreement: " + getShippingAgreement();

        return manufacturerInfo;
    }
}
