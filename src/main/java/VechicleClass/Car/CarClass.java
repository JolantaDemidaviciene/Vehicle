package VechicleClass.Car;

import VechicleClass.VechicleAbstract;

import java.util.Date;

public class CarClass extends VechicleAbstract {
    private int Id;
    private String Brand;
    private String Model;
    private Date FirstRegistrationDate;
    private int HorsePower;
    private Double Price;
    private int Seats;
    private Double TaxRate;
    private String NumberPlate;

    public CarClass(int Id,String Brand,String Model,Date FirstRegistrationDate,int HorsePower,Double Price,int Seats,Double TaxRate,String NumberPlate){
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

    //#region get ir set

    public Double getPrice() {
        return Price;
    }

    public int getId() {
        return Id;
    }

    public Double getTaxRate() {
        return TaxRate;
    }

    public String getBrand() {
        return Brand;
    }

    public String getModel() {
        return Model;
    }

    public Date getFirstRegistrationDate() {
        return FirstRegistrationDate;
    }

    public int getHorsePower() {
        return HorsePower;
    }

    public int getSeats() {
        return Seats;
    }

    public String getNumberPlate() {
        return NumberPlate;
    }

    public void setPrice(Double price) {
        Price = price;
    }
    //#endregion

    public  void CalculateTax(){
       double Tax =  this.TaxRate * this.Price + (this.Seats * 500);
    }
}
