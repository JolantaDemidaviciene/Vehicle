package VehicleOwner.Person;

import VehicleOwner.VehicleOwner;

public class Person extends VehicleOwner {
    private String FirstName;
    private String LasName;
    private int age;

    public Person(String FirstName,String LasName,int age){
        this.age =age;
        this.FirstName = FirstName;
        this.LasName = LasName;
    }

    @Override
    public void CalculateVehicleTax() {

    }
}
