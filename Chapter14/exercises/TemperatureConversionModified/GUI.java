/*
 *       Filename:  GUI.java
 *
 *    Description:  14.13 - Enhance the temperature-conversion application of
 *                  Exercise 14.12 by adding the Kelvin temperature scale. The
 *                  application should allow the user to make conversions
 *                  between any two scales. Use the following formula for the
 *                  conversion between Kelvin and Celsius (in addition to the
 *                  formula in Exercise 14.12):
 *                  Kelvin = Celsius + 273.15
 *
 *        Created:  23/01/16 21:54:23
 *       Revision:  24/01/16 17:48:57
 *
 *        @Author:  Siidney Watson - siidney.watson@gmail.com
 *       @Version:  1.0
 *
 * =====================================================================================
 */
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import java.awt.BorderLayout;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.SwingConstants;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;

public class GUI extends JFrame{
    private JPanel container;
    private JPanel conversionPane;
    private JPanel radioPane;

    private Font f;

    private JTextField inputField;
    private JLabel outputLabel;
    private JLabel titleLabel;
    private JRadioButton fahrenCelsiusRB;
    private JRadioButton celsiusKelvinRB;
    private ButtonGroup radioGroup;

    private TemperatureConversionModified tc = new TemperatureConversionModified();

    // CONSTRUCTOR
    public GUI(){
        super("Temperature Converter");

        createElements();

        add(container);
    }
    // create GUI elements and add to container
    private void createElements(){
        container = new JPanel(new BorderLayout(5, 5));
        conversionPane = new JPanel();
        radioPane = new JPanel();

        f = new Font("Sans-Serif", Font.PLAIN, 30);

        // title
        titleLabel = new JLabel("Fahrenheit to Celsius", SwingConstants.CENTER);

        // input
        inputField = new JTextField(3);
        inputField.setFont(f);

        // register event handler
        TextFieldHandler handler = new TextFieldHandler();
        inputField.addActionListener(handler);

        outputLabel = new JLabel("??");
        outputLabel.setFont(f);

        conversionPane.add(inputField);
        conversionPane.add(outputLabel);

        // radio buttons
        fahrenCelsiusRB = new JRadioButton("Fahrenheit to Celsius", true);
        celsiusKelvinRB = new JRadioButton("Celsius to Kelvin", false);

        fahrenCelsiusRB.addItemListener(new RadioButtonHandler("Fahrenheit to Celsius"));
        celsiusKelvinRB.addItemListener(new RadioButtonHandler("Celsius to Kelvin"));

        radioGroup = new ButtonGroup();
        radioGroup.add(fahrenCelsiusRB);
        radioGroup.add(celsiusKelvinRB);

        radioPane.add(fahrenCelsiusRB);
        radioPane.add(celsiusKelvinRB);

        container.setBorder(BorderFactory.createEmptyBorder(30, 10, 30, 10));
        container.add(titleLabel, BorderLayout.PAGE_START);
        container.add(conversionPane, BorderLayout.CENTER);
        container.add(radioPane, BorderLayout.PAGE_END);
    }
    // private inner event handling classes
    private class TextFieldHandler implements ActionListener{
        // process text field events
        public void actionPerformed(ActionEvent event){
            // conversion result
            double baseTemp = 0.0f;
            double conversion = 0.0f;

            // user pressed enter
            if(event.getSource() == inputField){
                // ensure input is double
                try{
                    baseTemp = Double.parseDouble(event.getActionCommand());
                }catch(NumberFormatException e){
                    JOptionPane.showMessageDialog(null, e);
                }
                if(fahrenCelsiusRB.isSelected())
                    conversion = tc.fahrenheitToCelsius(baseTemp);
                else if(celsiusKelvinRB.isSelected())
                    conversion = tc.celsiusToKelvin(baseTemp);

                outputLabel.setText(String.format("%.2f", conversion));
            }
        }
    }
    private class RadioButtonHandler implements ItemListener{
        private String labelText;
        // constructor sets font of listener
        public RadioButtonHandler(String s){
            labelText = s;
        }
        // process radio button events
        public void itemStateChanged(ItemEvent event){
            titleLabel.setText(labelText);
        }
    }
}
