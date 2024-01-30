package questionFive;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class CLecturer implements ActionListener {

    JFrame frame;
    JLabel amount = new JLabel("Amount Requested");
    JTextField amountVal = new JTextField();

    JLabel period = new JLabel("Duration (Year)");
    JTextField periodVal = new JTextField();

    JLabel ret = new JLabel("Total to Return");
    JTextField retVal = new JTextField();

    JButton calculateButton = new JButton("Calculate");

    public CLecturer() {
        createWindow();
        setLocationAndSize();
        addComponentsToFrame();
        addActionEvent();
    }

    public void createWindow() {
        frame = new JFrame();
        frame.setTitle("Fill this form to calculate return based on period");
        frame.setSize(500, 400);
        frame.getContentPane().setBackground(Color.gray);
        frame.getContentPane().setLayout(null);
        frame.setVisible(true);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Added closing operation
    }

    public void setLocationAndSize() {
        Font labelFont = new Font("Times new roman", Font.PLAIN, 15);
        Font textFont = new Font("Times new roman", Font.PLAIN, 15);

        amount.setBounds(50, 50, 200, 30);
        amount.setFont(labelFont);
        amount.setBorder(BorderFactory.createLineBorder(Color.WHITE, 1, true));

        amountVal.setBounds(250, 50, 100, 30);
        amountVal.setFont(textFont);
        amountVal.setForeground(Color.BLACK);
        amountVal.setBorder(BorderFactory.createLoweredBevelBorder());
        amountVal.setEditable(false);

        period.setBounds(50, 100, 200, 30);
        period.setFont(labelFont);
        period.setBorder(BorderFactory.createLineBorder(Color.WHITE, 1, true));

        periodVal.setBounds(250, 100, 100, 30);
        periodVal.setFont(textFont);
        periodVal.setBorder(BorderFactory.createLoweredBevelBorder());
        periodVal.setForeground(Color.BLACK);

        ret.setBounds(50, 150, 200, 30);
        ret.setFont(labelFont);
        ret.setBorder(BorderFactory.createLineBorder(Color.WHITE, 1, true));

        retVal.setBounds(250, 150, 100, 30);
        retVal.setFont(new Font("Times new roman", Font.BOLD, 14)); // Adjusted font style
        retVal.setBorder(BorderFactory.createLoweredBevelBorder());
        retVal.setForeground(Color.BLUE);
        retVal.setEditable(false);

        calculateButton.setBounds(150, 200, 100, 30);
    }

    public void addComponentsToFrame() {
        frame.add(amount);
        frame.add(amountVal);
        frame.add(ret);
        frame.add(retVal);
        frame.add(period);
        frame.add(periodVal);
        frame.add(calculateButton);
    }

    public void addActionEvent() {
        calculateButton.addActionListener(this);
    }

    public void calculateReturnBasedOnPeriod() {
        try {
            double amount = Double.parseDouble(amountVal.getText());
            int period = Integer.parseInt(periodVal.getText());
            double returned = amount + ((amount * 0.05 / 100) * period);
            retVal.setForeground(Color.BLUE);
            retVal.setText(String.format("%.2f", returned)); // Format the result
        } catch (NumberFormatException ex) {
            retVal.setForeground(Color.RED);
            retVal.setText("Invalid input. Please enter valid numbers.");
        }

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == calculateButton) {
            calculateReturnBasedOnPeriod();
        }

    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new C();
        });
    }
}
