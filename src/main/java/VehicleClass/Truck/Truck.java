package VehicleClass.Truck;

import VehicleClass.VehicleAbstract;

import java.time.LocalDate;
import java.util.Date;

import static Helpers.Helpers.FunctionId;

public class Truck extends VehicleAbstract {

    private int Id;
    private String Brand;
    private String Model;
    private LocalDate FirstRegistrationDate;
    private int HorsePower;
    private Double Price;
    private int Seats;
    private Double TaxRate= 1.5;
    private String NumberPlate;

    public Truck(String Brand, String Model, LocalDate FirstRegistrationDate, int HorsePower, Double Price, int Seats, String NumberPlate){
        this.Id = FunctionId();
        this.Brand = Brand;
        this.Model = Model;
        this.FirstRegistrationDate = FirstRegistrationDate;
        this.HorsePower = HorsePower;
        this.Price = Price;
        this.Seats = Seats;
        this.NumberPlate = NumberPlate;
    }

    public int getId() {
        return Id;
    }

    public String getBrand() {
        return Brand;
    }

    public void setBrand(String brand) {
        Brand = brand;
    }

    public String getModel() {
        return Model;
    }

    public void setModel(String model) {
        Model = model;
    }

    public LocalDate getFirstRegistrationDate() {
        return FirstRegistrationDate;
    }

    public void setFirstRegistrationDate(LocalDate firstRegistrationDate) {
        FirstRegistrationDate = firstRegistrationDate;
    }

    public int getHorsePower() {
        return HorsePower;
    }

    public void setHorsePower(int horsePower) {
        HorsePower = horsePower;
    }

    public Double getPrice() {
        return Price;
    }

    public void setPrice(Double price) {
        Price = price;
    }

    public int getSeats() {
        return Seats;
    }

    public void setSeats(int seats) {
        Seats = seats;
    }

    public String getNumberPlate() {
        return NumberPlate;
    }

    public void setNumberPlate(String numberPlate) {
        NumberPlate = numberPlate;
    }

    @Override
    public  void CalculateTax(){
        double Tax =  this.TaxRate * this.Price + (this.Seats * 500);
    }
}
