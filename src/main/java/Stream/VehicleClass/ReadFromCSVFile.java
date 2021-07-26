package Stream.VehicleClass;

import VehicleClass.Car.Car;
import VehicleClass.Motorcycle.Motorcycle;
import VehicleClass.Truck.Truck;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.ArrayList;

public class ReadFromCSVFile {
    public static ArrayList<Car>  ReadFromCSVFileCar() throws IOException {

        ArrayList<Car> list = new ArrayList<Car>();

        FileReader fr = null;
        BufferedReader br = null;
        try {

            fr = new FileReader("Car.csv");
            br = new BufferedReader(fr);

            String textLine;
            int counter = 0;
            while ((textLine = br.readLine()) != null){
                counter++;
                if(counter == 1){
                    continue;
                }
                String[] line = textLine.split(";");
                Car x = new Car(line[0], line[1], LocalDate.parse(line[2]), Integer.parseInt(line[3]), java.lang.Double.parseDouble(line[4]), Integer.parseInt(line[5]),line[6] );
                list.add(x);
                System.out.println(textLine);
            }
        } catch (Exception exc) {
            System.out.println(String.format("Ivyko klaida: %s", exc.getMessage()));
        } finally {
            br.close();
        }
        return list;
    }
    public static ArrayList<Motorcycle>  ReadFromCSVFileMotorcycle() throws IOException {

        ArrayList<Motorcycle> list = new ArrayList<Motorcycle>();

        FileReader fr = null;
        BufferedReader br = null;
        try {

            fr = new FileReader("Motorcycle.csv");
            br = new BufferedReader(fr);

            String textLine;
            int counter = 0;
            while ((textLine = br.readLine()) != null){
                counter++;
                if(counter == 1){
                    continue;
                }
                String[] line = textLine.split(";");
                Motorcycle x = new Motorcycle(line[0], line[1], LocalDate.parse(line[2]), Integer.parseInt(line[3]), java.lang.Double.parseDouble(line[4]), Integer.parseInt(line[5]),line[6] );
                list.add(x);
                System.out.println(textLine);
            }
        } catch (Exception exc) {
            System.out.println(String.format("Ivyko klaida: %s", exc.getMessage()));
        } finally {
            br.close();
        }
        return list;
    }
    public static ArrayList<Truck>  ReadFromCSVFileTruck() throws IOException {

        ArrayList<Truck> list = new ArrayList<Truck>();

        FileReader fr = null;
        BufferedReader br = null;
        try {

            fr = new FileReader("Car.csv");
            br = new BufferedReader(fr);

            String textLine;
            int counter = 0;
            while ((textLine = br.readLine()) != null){
                counter++;
                if(counter == 1){
                    continue;
                }
                String[] line = textLine.split(";");
                Truck x = new Truck(line[0], line[1], LocalDate.parse(line[2]), Integer.parseInt(line[3]), java.lang.Double.parseDouble(line[4]), Integer.parseInt(line[5]),line[6] );
                list.add(x);
                System.out.println(textLine);
            }
        } catch (Exception exc) {
            System.out.println(String.format("Ivyko klaida: %s", exc.getMessage()));
        } finally {
            br.close();
        }
        return list;
    }


}

