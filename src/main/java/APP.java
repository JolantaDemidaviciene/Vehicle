import Interface.MenuBar;
import Interface.MyComboBox;
import Interface.MyFrame;
import Interface.RadioButton;
import Enum.EnumVehicleModel;


import javax.swing.*;
import java.awt.*;

public class APP {
    public static void main (String [] args){
        JFrame frame = new MyFrame();
        frame.setLayout(new GridLayout(9,1));
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
        frame.add(programLabel);
        new MenuBar(frame);
        new RadioButton(vehiclemarkRadio);
        frame.add(vehiclemarkRadio);
        new MyComboBox(vehiclemarkCombobox);
        markmodel.setLayout(new GridLayout(2,1));
        markmodel.add(vehiclemarklabel);
        markmodel.add(vehiclemarkCombobox);
        frame.add(markmodel);
        JLabel first = new JLabel("First registration date");
        JTextField metai = new JTextField("YYYY");
        JTextField menuo = new JTextField("MM");
        JTextField diena = new JTextField("DD");
        JPanel dataText = new JPanel();
        dataText.add(metai);
        dataText.add(menuo);
        dataText.add(diena);
        frame.add(first);
        frame.add(dataText);
        frame.add(new JLabel("Horse power"));
        ame.add(new JTextField().setLayou;)









        frame.setVisible(true);
    }
}
