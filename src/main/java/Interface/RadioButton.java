package Interface;

import javax.swing.*;
import java.awt.*;

public class RadioButton extends JRadioButton{
    public RadioButton(JPanel radiobuttonpanel){
        ButtonGroup radioBtnGroup = new ButtonGroup();
        JRadioButton carRadio = new JRadioButton("Car");
        JRadioButton motorcycleRadio = new JRadioButton("Motorcycle");
        JRadioButton truckRadio = new JRadioButton("Truck");
        radioBtnGroup.add(carRadio);
        radioBtnGroup.add(motorcycleRadio);
        radioBtnGroup.add(truckRadio);
        radiobuttonpanel.add(carRadio);
        radiobuttonpanel.add(motorcycleRadio);
        radiobuttonpanel.add(truckRadio);

    }
}
