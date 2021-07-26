package VehicleClass.Car.SuperCar;

import VehicleClass.Car.Car;

import java.time.LocalDate;
import java.util.Date;

public class SuperCar extends Car {
    public SuperCar(String Brand, String Model, LocalDate FirstRegistrationDate, int HorsePower, Double Price, int Seats,String NumberPlate) {
        super(Brand, Model, FirstRegistrationDate, HorsePower, Price, Seats, NumberPlate);
    }

   public double LuxuryTax(){
        return this.getPrice()*4;
   }

   @Override
    public void CalculateTax(){
       double Tax =  this.getTaxRate() * this.LuxuryTax()+ (this.getSeats() * 500);
   }
}
