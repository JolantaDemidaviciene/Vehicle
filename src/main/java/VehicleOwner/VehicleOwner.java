package VehicleOwner;

import VehicleClass.VehicleAbstract;

import java.util.ArrayList;

public abstract class VehicleOwner  {
    private int id;
    private ArrayList<VehicleAbstract> Vehicles;
    private String RegistrationNumber;

    public abstract void CalculateVehicleTax();
}
