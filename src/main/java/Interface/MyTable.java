package Interface;

import VehicleClass.Car.Car;
import VehicleClass.Motorcycle.Motorcycle;
import VehicleClass.Truck.Truck;

import javax.swing.*;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class MyTable extends JTable {
        JFrame f;
        JTable j;
       public MyTable(ArrayList<Car> cars, ArrayList<Motorcycle> motorcycles, ArrayList<Truck> trucks, String name) {
            f = new JFrame();
            f.setTitle("Paieskos rezultatai");
            ArrayList<Car> FindCar = cars.stream().filter(c->c.getNumberPlate().contains(name)).collect(Collectors.toCollection(ArrayList<Car>::new));
            ArrayList<Motorcycle> Findmotorcycle = motorcycles.stream().filter(c->c.getNumberPlate().contains(name)).collect(Collectors.toCollection(ArrayList<Motorcycle>::new));
            ArrayList<Truck> Findtruck = trucks.stream().filter(c->c.getNumberPlate().contains(name)).collect(Collectors.toCollection(ArrayList<Truck>::new));
            String[] columnNames = { "Brand", "Model", "NumberPlace" };
            long l = FindCar.stream().count();
            int i = (int)l;
            if(i>0){
                String [][] data = new String[](i);}

                data = {c.getBrand(), c.getModel(), c.getNumberPlate()};

                    j = new JTable(data, columnNames);


                }
            }




            j.setBounds(30, 40, 200, 300);
            JScrollPane sp = new JScrollPane(j);
            f.add(sp);
            f.setSize(500, 200);
            f.setVisible(true);
        }

}
