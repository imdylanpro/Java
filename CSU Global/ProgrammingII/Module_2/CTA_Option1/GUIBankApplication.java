// Dylan Nelson
// January 26, 2025
// GUIBankApplication.java

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.GridBagConstraints;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUIBankApplication extends JFrame implements ActionListener{

    private JPanel GUIPanel;
    private JLabel currentBalanceLabel;
    private JLabel withdrawDepositLabel;
    private JTextField currentBalanceTextField;
    private JTextField withdrawDepositTextField;
    private JButton depositButton;
    private JButton withdrawButton;

    double currentBalance = 100.52;
    double withdrawalDepositAmount = 0;

    GUIBankApplication() {
        GridBagConstraints layoutConst = null;

        // Configure the panel settings.
        GUIPanel = new JPanel();
        GUIPanel.setBounds(0,0, 400, 200);
        GUIPanel.setBackground(Color.white);
        GUIPanel.setLayout(new GridBagLayout());
        add(GUIPanel);

        // Add the current balance label to the panel.
        currentBalanceLabel = new JLabel("Current Balance:");
        layoutConst = new GridBagConstraints();
        layoutConst.gridx = 0;
        layoutConst.gridy = 0;
        layoutConst.insets = new Insets(10,10,10,10);
        GUIPanel.add(currentBalanceLabel, layoutConst);

        // Add the current balance text field to the panel.
        currentBalanceTextField = new JTextField(15);
        currentBalanceTextField.setText(Double.toString(currentBalance));
        currentBalanceTextField.setEditable(false);
        layoutConst = new GridBagConstraints();
        layoutConst.gridx = 1;
        layoutConst.gridy = 0;
        layoutConst.insets = new Insets(10,10,10,10);
        GUIPanel.add(currentBalanceTextField, layoutConst);

        // Add the deposit / withdrawal label.
        withdrawDepositLabel = new JLabel("Amount: ");
        layoutConst = new GridBagConstraints();
        layoutConst.gridx = 0;
        layoutConst.gridy = 1;
        layoutConst.insets = new Insets(10,10,10,10);
        GUIPanel.add(withdrawDepositLabel, layoutConst);

        // Add the withdrawal / deposit field to the panel.
        withdrawDepositTextField = new JTextField(15);
        withdrawDepositTextField.setEditable(true);
        layoutConst = new GridBagConstraints();
        layoutConst.gridx = 1;
        layoutConst.gridy = 1;
        layoutConst.insets = new Insets(10,10,10,10);
        GUIPanel.add(withdrawDepositTextField, layoutConst);

        // Create button and constraints and add to panel.
        depositButton = new JButton("Deposit");
        layoutConst = new GridBagConstraints();
        layoutConst.gridx = 0;
        layoutConst.gridy = 2;
        layoutConst.insets = new Insets(10,10,10,10);
        GUIPanel.add(depositButton, layoutConst);
        depositButton.addActionListener(this);

        // Create button and constraints and add to panel.
        withdrawButton = new JButton("Withdraw");
        layoutConst = new GridBagConstraints();
        layoutConst.gridx = 1;
        layoutConst.gridy = 2;
        layoutConst.insets = new Insets(10,10,10,10);
        GUIPanel.add(withdrawButton, layoutConst);
        withdrawButton.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent event) { 

        // Get current balance value.
        String currentBalanceString = currentBalanceTextField.getText();
        currentBalance = Double.parseDouble(currentBalanceString);

        // Get the withdrawal / deposit amount.
        String withdrawalDepositAmountString = withdrawDepositTextField.getText();
        withdrawalDepositAmount = Double.parseDouble(withdrawalDepositAmountString);

        // Use a selection structure with the getActionCommand attribute of the event 
        //  to determine whether to add or subtract value.
        if (event.getActionCommand() == "Deposit") {
            currentBalance = currentBalance + withdrawalDepositAmount;
        }
        
        if (event.getActionCommand() == "Withdraw") {
            currentBalance = currentBalance - withdrawalDepositAmount;
        }

        // Display calculated salary
        currentBalanceTextField.setText(Double.toString(currentBalance));
   }
    public static void main(String[] args) {
        
        // Create the frame based on the Bank application 
        GUIBankApplication GUIBankFrame = new GUIBankApplication();

        // Configure the frame settings.
        GUIBankFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        GUIBankFrame.setTitle("Bank Application");
        GUIBankFrame.setSize(400,200);
        GUIBankFrame.pack();

        // Set the application to be visible.
        GUIBankFrame.setVisible(true);

    }
}
