// File   : gui-tutorial/DogYears2.java
// Purpose: Use textfields and button to convert dog to human years.
//          A button listener has been added in this version.
//          No error checking on input values.
// Author : Fred Swartz, 2006-11-09,  Placed in public domain.

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;  // Needed for ActionListener

//////////////////////////////////////////////////////// class DogYears2
class DogYears2 extends JFrame {
    //======================================================== constants
    private static final int DOG_YEARS_PER_HUMAN_YEAR = 7;      //Note 1

    //=============================================== instance variables
    private JTextField _humanYearsTF = new JTextField(3);       //Note 2
    private JTextField _dogYearsTF   = new JTextField(3);

    //====================================================== constructor
    public DogYears2() {                                        //Note 3
        // 1... Create/initialize components
        JButton convertBtn = new JButton("Convert");  //Note 4
        convertBtn.addActionListener(new ConvertBtnListener()); //Note 5

        _dogYearsTF.addActionListener(new ConvertBtnListener());
        _humanYearsTF.setEditable(false);


        // 2... Create content panel, set layout
        JPanel content = new JPanel();
        content.setLayout(new FlowLayout());

        // 3... Add the components to the content panel.
        content.add(new JLabel("Dog Years"));
        content.add(_dogYearsTF);              // Add input field
        content.add(convertBtn);               // Add button
        content.add(new JLabel("Human Years"));
        content.add(_humanYearsTF);            // Add output field

        // 4... Set this window's attributes, and pack it.
        setContentPane(content);
        pack();                               // Layout components.
        setTitle("Dog Year Converter");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);          // Center window.
    }

    ////////////////////////////////////////////////// ConvertBtnListener
    class ConvertBtnListener implements ActionListener {         //Note 6
        public void actionPerformed(ActionEvent e) {
            //... Get the value from the dog years textfield.
            String dyStr = _dogYearsTF.getText();                //Note 7
            int dogYears = Integer.parseInt(dyStr);              //Note 8

            //... Convert it - each dog year is worth 7 human years.
            int humanYears = dogYears * DOG_YEARS_PER_HUMAN_YEAR; //Note 9

            //... Convert to string and set human yrs textfield
            _humanYearsTF.setText("" + humanYears);              //Note 10
        }
    }

    //====================================================== method main
    public static void main(String[] args) {
        DogYears2 window = new DogYears2();
        window.setVisible(true);
    }
}
