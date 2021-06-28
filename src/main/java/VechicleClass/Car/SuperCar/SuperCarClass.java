package VechicleClass.Car.SuperCar;

import VechicleClass.Car.CarClass;

import java.util.Date;

public class SuperCarClass extends CarClass {
    public SuperCarClass(int Id, String Brand, String Model, Date FirstRegistrationDate, int HorsePower, Double Price, int Seats, Double TaxRate, String NumberPlate) {
        super(Id, Brand, Model, FirstRegistrationDate, HorsePower, Price, Seats, TaxRate, NumberPlate);
    }

   public void LuxuryTax(){
        this.setPrice(this.getPrice()*4);
   }

   @Override
    public void CalculateTax(){
       double Tax =  this.getTaxRate() * this.getPrice()+ (this.getSeats() * 500);
   }
}
