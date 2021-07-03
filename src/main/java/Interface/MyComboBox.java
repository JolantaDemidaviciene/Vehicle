package Interface;

import javax.swing.*;
import Enum.EnumVehicleModel;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.time.DateTimeException;

public class MyComboBox {
    public MyComboBox(JPanel comboBoxVehicle) {
        JLabel vehicleMark = new JLabel();
        JLabel vehiclemarkModel = new JLabel();
        String[] VehicleMark = {EnumVehicleModel.BMW.name(), EnumVehicleModel.AUDI.name(), EnumVehicleModel.VW.name()};
        String[] VehicleModelBMW = {"X5", "X3", "MX5"};
        String[] VehicleModelAUDI = {"A3", "A4", "Q7", "Q5"};
        String[] VehicleModelVW = {"POLO", "GOLF", "PASSAT"};
        JComboBox VehicleMarkComboBox = new JComboBox(VehicleMark);
        JComboBox VehicleMarkModelComboBoxBMW = new JComboBox(VehicleModelBMW);
        JComboBox VehicleMarkModelComboBoxAUDI = new JComboBox(VehicleModelAUDI);
        JComboBox VehicleMarkModelComboBoxVW = new JComboBox(VehicleModelVW);
        comboBoxVehicle.add(VehicleMarkComboBox);
        comboBoxVehicle.add(VehicleMarkModelComboBoxBMW);
        comboBoxVehicle.add(VehicleMarkModelComboBoxAUDI);
        comboBoxVehicle.add(VehicleMarkModelComboBoxVW);
        VehicleMarkModelComboBoxBMW.setVisible(false);
        VehicleMarkModelComboBoxAUDI.setVisible(false);
        VehicleMarkModelComboBoxVW.setVisible(false);





        VehicleMarkComboBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                switch (VehicleMarkComboBox.getSelectedItem().toString()) {
                    case "BMW":
                        VehicleMarkModelComboBoxBMW.setVisible(true);
                        VehicleMarkModelComboBoxAUDI.setVisible(false);
                        VehicleMarkModelComboBoxVW.setVisible(false);
                        break;
                    case "AUDI":
                        VehicleMarkModelComboBoxBMW.setVisible(false);
                        VehicleMarkModelComboBoxAUDI.setVisible(true);
                        VehicleMarkModelComboBoxVW.setVisible(false);
                        break;
                    case "VW":
                        VehicleMarkModelComboBoxBMW.setVisible(false);
                        VehicleMarkModelComboBoxAUDI.setVisible(false);
                        VehicleMarkModelComboBoxVW.setVisible(true);
                        System.out.println(VehicleMarkModelComboBoxVW.getSelectedItem().toString());
                        break;
                }
            }
        });
        VehicleMarkModelComboBoxBMW.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println(VehicleMarkModelComboBoxBMW.getSelectedItem().toString());
            }

        });
        VehicleMarkModelComboBoxAUDI.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println(VehicleMarkModelComboBoxAUDI.getSelectedItem().toString());
            }

        });
        VehicleMarkModelComboBoxVW.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println(VehicleMarkModelComboBoxVW.getSelectedItem().toString());
            }

        });
    }
}
