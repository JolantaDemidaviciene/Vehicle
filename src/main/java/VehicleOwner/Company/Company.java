package VehicleOwner.Company;

import VehicleOwner.VehicleOwner;

public class Company extends VehicleOwner {
    private String Title;
    private double TaxDeduction;
    public Company( String Title,double TaxDeduction){
        this.TaxDeduction = TaxDeduction;
        this.Title = Title;
    }
    @Override
    public void CalculateVehicleTax() {

    }

}
