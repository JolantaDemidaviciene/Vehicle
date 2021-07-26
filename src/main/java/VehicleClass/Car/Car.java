package VehicleClass.Car;

import VehicleClass.VehicleAbstract;

import java.text.Format;
import java.time.LocalDate;
import java.util.Date;

import static Helpers.Helpers.FunctionId;

public class Car extends VehicleAbstract {
    private int Id;
    private String Brand;
    private String Model;
    private LocalDate FirstRegistrationDate;
    private int HorsePower;
    private Double Price;
    private int Seats;
    private Double TaxRate = 1.00;
    private String NumberPlate;

    public Car(String Brand, String Model, LocalDate FirstRegistrationDate, int HorsePower, Double Price, int Seats,  String NumberPlate){
        this.Id = FunctionId();
        this.Brand = Brand;
        this.Model = Model;
        this.FirstRegistrationDate = FirstRegistrationDate;
        this.HorsePower = HorsePower;
        this.Price = Price;
        this.Seats = Seats;
        this.NumberPlate = NumberPlate;
    }




    //#region get ir set

    public Double getPrice() {
        return Price;
    }

    public int getId() {
        return Id;
    }

    public LocalDate getFirstRegistrationDate() {
        return FirstRegistrationDate;
    }

    public void setId(int id) {
        Id = id;
    }

    public void setBrand(String brand) {
        Brand = brand;
    }

    public void setModel(String model) {
        Model = model;
    }

    public void setFirstRegistrationDate(LocalDate firstRegistrationDate) {
        FirstRegistrationDate = firstRegistrationDate;
    }

    public void setHorsePower(int horsePower) {
        HorsePower = horsePower;
    }

    public void setSeats(int seats) {
        Seats = seats;
    }

    public void setNumberPlate(String numberPlate) {
        NumberPlate = numberPlate;
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

    public int getHorsePower() {
        return HorsePower;
    }

    public int getSeats() {
        return Seats;
    }

    public String getNumberPlate() {
        return this.NumberPlate;
    }

    public void setPrice(Double price) {
        Price = price;
    }
    //#endregion
    @Override
    public  void CalculateTax(){
       double Tax =  this.TaxRate * this.Price + (this.Seats * 500);
    }
}
