/**
 * Mark Witt
 * Module 2 Assignment
 * 
 */

import javax.swing.*;
public class main {

    public static void main(String[] args) {
        JTextField waterMassField = new JTextField(5);
        JTextField initialTempField = new JTextField(5);
        JTextField finalTempField = new JTextField(5);
        double energyNeeded;
        
        JPanel myPanel = new JPanel();
        myPanel.add(new JLabel("Water Mass:"));
        myPanel.add(waterMassField);
        myPanel.add(Box.createHorizontalStrut(15));
        myPanel.add(new JLabel("Initial Temp: "));
        myPanel.add(initialTempField);
        myPanel.add(Box.createHorizontalStrut(15));
        myPanel.add(new JLabel("Final Temp: "));
        myPanel.add(finalTempField);
        
        Object[] buttons = {"Submit", "Cancel"};
        Object choices = buttons[0];
        int result = JOptionPane.showOptionDialog(null, myPanel, "Please enter values to calculate energy needed:", JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE,null, buttons, choices);
        if (result == JOptionPane.OK_OPTION){
            System.out.println("Water Mass: " + waterMassField.getText());
            System.out.println("Initial Temp: " + initialTempField.getText());
            System.out.println("Final Temp: " + finalTempField.getText());
            double waterMass = Double.parseDouble(waterMassField.getText());
            double initialTemp = Double.parseDouble(initialTempField.getText());
            double finalTemp = Double.parseDouble(finalTempField.getText());
            energyNeeded = waterMass * (finalTemp - initialTemp) * 4184; 
            String energyNeededText = String.format("Energy Needed:%n%,.2f Joules", energyNeeded);
            JOptionPane.showMessageDialog(null, energyNeededText, "Energy Needed", JOptionPane.INFORMATION_MESSAGE);
            System.out.println(energyNeededText);
        }
    }
    
}
