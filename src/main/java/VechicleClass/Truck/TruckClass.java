package VechicleClass.Truck;

import VechicleClass.VechicleAbstract;

import java.util.Date;

public class TruckClass extends VechicleAbstract {

    private int Id;
    private String Brand;
    private String Model;
    private Date FirstRegistrationDate;
    private int HorsePower;
    private Double Price;
    private int Seats;
    private Double TaxRate;
    private String NumberPlate;

    public TruckClass(int Id,String Brand,String Model,Date FirstRegistrationDate,int HorsePower,Double Price,int Seats,Double TaxRate,String NumberPlate){
        this.Id = Id;
        this.Brand = Brand;
        this.Model = Model;
        this.FirstRegistrationDate = FirstRegistrationDate;
        this.HorsePower = HorsePower;
        this.Price = Price;
        this.Seats = Seats;
        this.TaxRate = TaxRate;
        this.NumberPlate = NumberPlate;
    }

    public  void CalculateTax(){
        double Tax =  this.TaxRate * this.Price + (this.Seats * 500);
    }
}
