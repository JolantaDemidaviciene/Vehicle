package Stream.VehicleClass;

import VehicleClass.Car.Car;
import VehicleClass.Motorcycle.Motorcycle;
import VehicleClass.Truck.Truck;
import VehicleClass.VehicleAbstract;

import java.io.*;
import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class WriteObjectToCSVFile {
    public static void  WriteObjectToCSVFileCar( ArrayList<Car> list) throws IOException {
        FileWriter fw = null;
        BufferedWriter bw = null;
            try {
                fw = new FileWriter("Car.csv");
                bw = new BufferedWriter(fw);
                bw.write("Brand;Model;First Registration Date; HorsePower; Price; Seats; NumberPlate\n");
                for (Car p: list){
                    bw.write(String.format("%s;%s;%s;%s;%s;%s;%s\n",p.getBrand()
                            ,p.getModel(), p.getFirstRegistrationDate(),p.getHorsePower(),
                            p.getPrice(), p.getSeats(), p.getNumberPlate() ));
                }

            } catch (Exception exc) {
                System.out.println(String.format("Ivyko klaida: %s", exc.getMessage()));
            }
                bw.close();
    }
    public static void  WriteObjectToCSVFileMotorcycle(ArrayList<Motorcycle> list) throws IOException {
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter("Motorcycle.csv");
            bw = new BufferedWriter(fw);
            bw.write("Brand;Model;First Registration Date; HorsePower; Price; Seats; NumberPlate\n");

            for (Motorcycle p: list){
                bw.write(String.format("%s;%s;%s;%s;%s;%s;%s\n", p.getBrand()
                        ,p.getModel(), p.getFirstRegistrationDate(),p.getHorsePower(),
                        p.getPrice(), p.getSeats(), p.getNumberPlate() ));
            }

        } catch (Exception exc) {
            System.out.println(String.format("Ivyko klaida: %s", exc.getMessage()));
        }
        bw.close();
    }
    public static void  WriteObjectToCSVFileTruck(ArrayList<Truck> list) throws IOException {
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter("Truck.csv");
            bw = new BufferedWriter(fw);
            bw.write("Brand;Model;First Registration Date; HorsePower; Price; Seats; NumberPlate\n");

            for (Truck p: list){
                bw.write(String.format("%s;%s;%s;%s;%s;%s;%s\n",p.getBrand()
                        ,p.getModel(), p.getFirstRegistrationDate(),p.getHorsePower(),
                        p.getPrice(), p.getSeats(), p.getNumberPlate() ));
            }

        } catch (Exception exc) {
            System.out.println(String.format("Ivyko klaida: %s", exc.getMessage()));
        }
        bw.close();
    }
}


