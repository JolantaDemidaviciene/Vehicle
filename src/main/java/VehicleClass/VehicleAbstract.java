package VehicleClass;

import VehicleOwner.VehicleOwner;

import java.util.Date;

public abstract class VehicleAbstract {
    private int Id;
    private String Brand;
    private String Model;
    private Date FirstRegistrationDate;
    private int HorsePower;
    private Double Price;
    private int Seats;
    private Double TaxRate;
    private String NumberPlate;
    private VehicleOwner Owner;


    public abstract void CalculateTax();
}
