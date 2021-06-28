package VechicleClass.Car.SuperCar;

import VechicleClass.Car.Car;

import java.util.Date;

public class SuperCar extends Car {
    public SuperCar(int Id, String Brand, String Model, Date FirstRegistrationDate, int HorsePower, Double Price, int Seats, Double TaxRate, String NumberPlate) {
        super(Id, Brand, Model, FirstRegistrationDate, HorsePower, Price, Seats, TaxRate, NumberPlate);
    }

   public double LuxuryTax(){
        return double LuxuryTax =  this.getPrice()*4;
   }

   @Override
    public void CalculateTax(){
       double Tax =  this.getTaxRate() * this.LuxuryTax()+ (this.getSeats() * 500);
   }
}
