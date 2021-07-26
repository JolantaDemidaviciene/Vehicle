import Interface.*;
import Enum.EnumVehicleModel;
import Stream.VehicleClass.ReadFromCSVFile;
import VehicleClass.Car.Car;
import VehicleClass.Motorcycle.Motorcycle;
import VehicleClass.Truck.Truck;
import VehicleClass.VehicleAbstract;


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

import static Stream.VehicleClass.ReadFromCSVFile.*;
import static Stream.VehicleClass.WriteObjectToCSVFile.*;

public class APP {
    public static void main (String [] args) throws IOException {
        ArrayList<Car> vehiclecarlist = ReadFromCSVFileCar();
        ArrayList<Motorcycle> vehiclemotorcyclelist = ReadFromCSVFileMotorcycle();
        ArrayList<Truck> vehicletrucklist = ReadFromCSVFileTruck();
        JPanel findVehiclePanel = new JPanel();
        JButton find = new JButton("Find");
        JLabel findMark = new JLabel("Pasirinkite Mašinos markę");


        JFrame frame = new MyFrame();
        frame.setLayout(new GridLayout(2,1));
        //#region JMenuBar
        JMenuBar menuBar = new JMenuBar();
        JMenu menu = new JMenu("Menu");
        JMenu about = new JMenu("About");
        //JMenu setFind = new JMenu();
        JMenu menuItemVehicle = new JMenu("Vehicle");
        JMenu menuItemVehicleOwner = new JMenu("Owner");
        JMenuItem setVehicle = new JMenuItem("Set");
        JMenuItem findVehicle = new JMenuItem("Find");
        JMenuItem setVehicleOwner = new JMenuItem("Set");
        JMenuItem findVehicleOwner = new JMenuItem("Find");
        menuItemVehicle.add(setVehicle);
        menuItemVehicle.add(findVehicle);
        menuItemVehicleOwner.add(setVehicleOwner);
        menuItemVehicleOwner.add(findVehicleOwner);
        menu.add(menuItemVehicleOwner);
        menu.add(menuItemVehicle);
        menuBar.add(menu);
        menuBar.add(about);
        frame.setJMenuBar(menuBar);
        //#endregion
        //#region vehicleregistration
        JPanel vehicleregistrationpanel = new JPanel();
        vehicleregistrationpanel.setLayout(new GridLayout(10,1));
        JPanel vehiclemarkRadio = new JPanel();
        JPanel vehiclemarklabel = new JPanel();
        JPanel markmodel = new JPanel();
        JLabel vehiclemark = new JLabel("Mark");
        JLabel vehiclemodel = new JLabel("Model");
        vehiclemarklabel.add(vehiclemark);
        vehiclemarklabel.add(vehiclemodel);
        JPanel vehiclemarkCombobox = new JPanel();
        JLabel programLabel = new JLabel("Vehicle registration");
        programLabel.setFont(new Font("labas",Font.ITALIC,30));
        vehicleregistrationpanel.add( programLabel);
        ButtonGroup radioBtnGroup = new ButtonGroup();
        JRadioButton carRadio = new JRadioButton("Car");
        JRadioButton motorcycleRadio = new JRadioButton("Motorcycle");
        JRadioButton truckRadio = new JRadioButton("Truck");
        radioBtnGroup.add(carRadio);
        radioBtnGroup.add(motorcycleRadio);
        radioBtnGroup.add(truckRadio);
        vehiclemarkRadio.add(carRadio);
        vehiclemarkRadio.add(motorcycleRadio);
        vehiclemarkRadio.add(truckRadio);
        vehicleregistrationpanel.add(vehiclemarkRadio);
        String[] VehicleMark = {EnumVehicleModel.BMW.name(), EnumVehicleModel.AUDI.name(), EnumVehicleModel.VW.name()};
        String[] VehicleModelBMW = {"X5", "X3", "MX5"};
        String[] VehicleModelAUDI = {"A3", "A4", "Q7", "Q5"};
        String[] VehicleModelVW = {"POLO", "GOLF", "PASSAT"};
        JComboBox VehicleMarkComboBox = new JComboBox(VehicleMark);
        JComboBox VehicleMarkModelComboBox= new JComboBox(VehicleModelBMW);
        vehiclemarkCombobox.add(VehicleMarkComboBox);
        vehiclemarkCombobox.add(VehicleMarkModelComboBox);
        VehicleMarkModelComboBox.setVisible(true);
        vehicleregistrationpanel.setVisible(false);
        VehicleMarkComboBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                switch (VehicleMarkComboBox.getSelectedItem().toString()) {
                    case "BMW":
                        VehicleMarkModelComboBox.setModel(new DefaultComboBoxModel<String> (VehicleModelBMW));;
                        break;
                    case "AUDI":
                        VehicleMarkModelComboBox.setModel(new DefaultComboBoxModel<String> (VehicleModelAUDI));
                        break;
                    case "VW":
                        VehicleMarkModelComboBox.setModel(new DefaultComboBoxModel<String> (VehicleModelVW));
                        break;
                }
            }
        });
        markmodel.setLayout(new GridLayout(2,1));
        markmodel.add(vehiclemarklabel);
        markmodel.add(vehiclemarkCombobox);
        vehicleregistrationpanel.add(markmodel);
        JPanel datapanel = new JPanel();
        datapanel.setLayout(new GridLayout(3,1));
        //#region firstData
        JLabel first = new JLabel("First registration date");
        JLabel datamessage = new JLabel();
        JTextField metai = new JTextField("YYYY", 5);
        metai.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                char caracter = e.getKeyChar();
                if (((caracter < '0') || (caracter > '9'))
                        && (caracter != '\b')) {
                    e.consume();
                }
            }
        });
        JTextField menuo = new JTextField("MM", 5);
        menuo.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                char caracter = e.getKeyChar();
                if (((caracter < '0') || (caracter > '9'))
                        && (caracter != '\b')) {
                    e.consume();
                }
            }
        });
        JTextField diena = new JTextField("DD",5);
        diena.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                char caracter = e.getKeyChar();
                if (((caracter < '0') || (caracter > '9'))
                        && (caracter != '\b')) {
                    e.consume();
                }
            }
        });
        //#endregion
        JPanel dataText = new JPanel();
        datapanel.add(first);
        dataText.add(metai);
        dataText.add(menuo);
        dataText.add(diena);
        datapanel.add(dataText);
        datapanel.add(datamessage);
        vehicleregistrationpanel.add(datapanel);
        JPanel horsePanel = new JPanel();
        JLabel horselabel = new JLabel("Horse power");
        JTextField horsefield = new JTextField(10);
        horsePanel.setLayout(new GridLayout(2,1));
        horsePanel.add(horselabel);
        horsePanel.add(horsefield);
        vehicleregistrationpanel.add(horsePanel);
        JPanel pricepanel = new JPanel();
        JLabel pricelabel = new JLabel("Price");
        JTextField pricefield = new JTextField(10);
        pricepanel.setLayout(new GridLayout(2,1));
        pricepanel.add(pricelabel);
        pricepanel.add(pricefield);
        vehicleregistrationpanel.add(pricepanel);
        JPanel seatspanel = new JPanel();
        JLabel seatlabel = new JLabel("Seats");
        JTextField seatfield = new JTextField(10);
        seatspanel.setLayout(new GridLayout(2,1));
        seatspanel.add(seatlabel);
        seatspanel.add(seatfield);
        vehicleregistrationpanel.add(seatspanel);
        JPanel numberpanel = new JPanel();
        JLabel numberlabel = new JLabel("Number plate");
        JTextField numberfield = new JTextField(10);
        numberpanel.setLayout(new GridLayout(2,1));
        numberpanel.add(numberlabel);
        numberpanel.add(numberfield);
        vehicleregistrationpanel.add(numberpanel);
        JPanel buttonpanel = new JPanel();
        JPanel buttonpanel1 = new JPanel();
        buttonpanel1.setLayout(new GridLayout(1,2));
        JButton creat = new JButton("Creat");
        JButton clear = new JButton("Clear");
        buttonpanel1.add(creat);
        buttonpanel1.add(clear);
        buttonpanel.add(buttonpanel1);

        vehicleregistrationpanel.add(buttonpanel);
        frame.add(vehicleregistrationpanel);
        //#endregion

        findVehiclePanel.add(findMark);
        findVehiclePanel.add(VehicleMarkComboBox);
        findVehiclePanel.add(find);
        frame.add(findVehiclePanel);




        //#region JMenubARclick
        String vehicletype = " ";
        setVehicle.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                vehicleregistrationpanel.setVisible(true);
                findVehiclePanel.setVisible(false);

            }

        });
        findVehicle.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                vehicleregistrationpanel.setVisible(false);
                findVehiclePanel.setVisible(true);


            }

        });
        setVehicleOwner.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                vehicleregistrationpanel.setVisible(false);
                findVehiclePanel.setVisible(false);


            }

        });
        findVehicleOwner.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                vehicleregistrationpanel.setVisible(false);
                findVehiclePanel.setVisible(false);


            }

        });
        //#endregion
        //#region Button action
        creat.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int horsespower = Integer.parseInt(horsefield.getText());
                int seats =Integer.parseInt(seatfield.getText());
                double price = Double.parseDouble(pricefield.getText());
                String model = VehicleMarkComboBox.getSelectedItem().toString();
                String mark = VehicleMarkModelComboBox.getSelectedItem().toString();
                String number = numberfield.getText();
                LocalDate  registration = LocalDate.of(Integer.parseInt(metai.getText()),Integer.parseInt(menuo.getText()), Integer.parseInt(diena.getText()));
               if(Integer.parseInt(metai.getText()) <= LocalDate.now().getYear()) {
                   datamessage.setText(registration.toString());

                   if (vehiclecarlist.stream().anyMatch(h -> h.getNumberPlate().contains(number)) || vehiclemotorcyclelist.stream().anyMatch(h -> h.getNumberPlate().contains(number))
                           || vehicletrucklist.stream().anyMatch(h -> h.getNumberPlate().contains(number))) {
                       JOptionPane.showMessageDialog(frame,
                               "Transporto priemone tokiu numeriu uzregistruota pasirinkite kita numeri",
                               "Klaida",
                               JOptionPane.WARNING_MESSAGE);
                   } else {

                       if (carRadio.isSelected()) {
                           vehiclecarlist.add(new Car(carRadio.getText(), model, registration, horsespower, price, seats, number));

                       }
                       if (motorcycleRadio.isSelected()) {
                           vehiclemotorcyclelist.add(new Motorcycle(motorcycleRadio.getText(), model, registration, horsespower, price, seats, number));


                       }
                       if (truckRadio.isSelected()) {
                           vehicletrucklist.add(new Truck(truckRadio.getText(), model, registration, horsespower, price, seats, number));

                       }
                       try {
                           WriteObjectToCSVFileCar(vehiclecarlist);
                           WriteObjectToCSVFileMotorcycle(vehiclemotorcyclelist);
                           WriteObjectToCSVFileTruck(vehicletrucklist);


                       } catch (IOException ioException) {
                           ioException.printStackTrace();
                       }

                   }
               }
               else {
                   JOptionPane.showMessageDialog(frame,
                           "Blogai ivesta registracijos data",
                           "Klaida",
                           JOptionPane.WARNING_MESSAGE);
               }

            }

        });

        clear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                metai.setText("YYYY");
                menuo.setText("MM");
                diena.setText("DD");
                horsefield.setText(null);
                seatfield.setText(null);
                pricefield.setText(null);
                numberfield.setText((null));
                datamessage.setText(null);

            }
        });
        find.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


            }

        });



        //#endregion





        frame.setVisible(true);
    }

}
