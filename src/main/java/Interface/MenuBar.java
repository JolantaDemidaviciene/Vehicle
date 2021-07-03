package Interface;

import javax.swing.*;

public class MenuBar extends JMenuBar {
    public MenuBar(JFrame frame){
        JMenuBar menuBar = new JMenuBar();
        JMenu menu = new JMenu("Menu");
        JMenu about = new JMenu("About");
        JMenu setFind = new JMenu();
        JMenu menuItemVehicle = new JMenu("Vehicle");
        JMenu menuItemVehicleOwmer = new JMenu("Owner");
        JMenuItem setVehicle = new JMenuItem("Set");
        JMenuItem findVehicle = new JMenuItem("Find");
        JMenuItem setVehicleOwner = new JMenuItem("Set");
        JMenuItem findVehicleOwner = new JMenuItem("Find");
        menuItemVehicle.add(setVehicle);
        menuItemVehicle.add(findVehicle);
        menuItemVehicleOwmer.add(setVehicleOwner);
        menuItemVehicleOwmer.add(findVehicleOwner);
        menu.add(menuItemVehicleOwmer);
        menu.add(menuItemVehicle);
        menuBar.add(menu);
        menuBar.add(about);
        frame.setJMenuBar(menuBar);
    }
}
