// Dylan Nelson
// February 02, 2025
// GUIMenu.java

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Random;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class GUIMenuApplication extends JFrame implements ActionListener {

    private JMenu mainMenu;
    private JMenuBar mainMenuBar;
    private JMenuItem menuOptionOne, menuOptionTwo, menuOptionThree, menuOptionFour;
    private JTextArea mainTextArea;
    private JLabel textAreaLabel;
    private JScrollPane textAreaScrollPane;

    GUIMenuApplication() {
        
        // Define a layout constraint.
        GridBagConstraints layoutConst = null;

        // Set the layout for the frame.
        setLayout(new GridBagLayout());

        // Create the menu that will house the options.
        mainMenu = new JMenu("Menu");

        // Create the menu bar.
        mainMenuBar = new JMenuBar();

        // Create the menu items.
        menuOptionOne = new JMenuItem("Date and Time");
        menuOptionTwo = new JMenuItem("Log Text Box Contents");
        menuOptionThree = new JMenuItem("Change Background Color");
        menuOptionFour = new JMenuItem("Exit Program");

        // Add Action Listeners to the menu options.
        menuOptionOne.addActionListener(this);
        menuOptionTwo.addActionListener(this);
        menuOptionThree.addActionListener(this);
        menuOptionFour.addActionListener(this);

        // Add the items to the menu.
        mainMenu.add(menuOptionOne);
        mainMenu.add(menuOptionTwo);
        mainMenu.add(menuOptionThree);
        mainMenu.add(menuOptionFour);

        // Add the menu to the menu bar.
        mainMenuBar.add(mainMenu);

        // Add the menu bar to the frame.
        setJMenuBar(mainMenuBar);

        // Add a label for the text area.
        textAreaLabel = new JLabel("Text Output");

        // Create a text area with a scroll pane.
        mainTextArea = new JTextArea(15,40);
        textAreaScrollPane = new JScrollPane(mainTextArea);

        mainTextArea.setBackground(Color.white);
        mainTextArea.setEditable(false);

        // Define the layour constraints for all components and add them to frame.
        layoutConst = new GridBagConstraints();
        layoutConst.gridx = 0;
        layoutConst.gridy = 0;
        layoutConst.insets = new Insets(10,10,10,10);
        add(textAreaLabel, layoutConst);
        
        layoutConst = new GridBagConstraints();
        layoutConst.gridx = 0;
        layoutConst.gridy = 1;
        layoutConst.insets = new Insets(10,10,10,10);
        add(textAreaScrollPane, layoutConst);
    }


    @Override
    public void actionPerformed(ActionEvent event) { 
        
        // Handles when the Date and Time menu option is selected.
        if (event.getActionCommand() == "Date and Time") {
            LocalDate dateNow = LocalDate.now();
            LocalTime timeNow = LocalTime.now();

            mainTextArea.append("The current date is: " + dateNow + " . The current time is: " + timeNow + "\n");

        }
        
        // Handles when the Log Text Box Contents menu option is selected.
        if (event.getActionCommand() == "Log Text Box Contents") {

            // Get the current contents of the mainTextArea into a String object.
            String areaContent = mainTextArea.getText();

            // Create the file if it hasn't already been created, and print to terminal to let user know.
            try {
                File myLogContents = new File("log.txt");
                
                if (myLogContents.createNewFile()) {
                    System.out.println("File Created Successfully: " + myLogContents.getName());
                } else {
                    System.out.println("File already exists.");
                }
            } catch (IOException e) {
                System.out.println("An error occured while trying to make file.");
            }

            // Write the contents of areaContent into the file and properly close down the file.
            try {
                FileWriter myFileWriter = new FileWriter("log.txt");
                myFileWriter.write(areaContent);
                myFileWriter.close();
                System.out.println("Wrote to file successfully!");
            } catch (Exception e) {
                System.out.println("An error occurred while trying to write to file.");
            }
        }
        
        // Handles when the Change Background Color menu option is selected.
        if (event.getActionCommand() == "Change Background Color") {
            
            // Create a random number for red and blue.
            Random randRed = new Random();
            Random randBlue = new Random();

            // Here the random integers are multiplied by 32 because this generates the standard hues.
            int randIntRed = randRed.nextInt(3) * 32;
            int randIntBlue = randBlue.nextInt(3) * 32;

            // Create a Color object and set the green color portion to 128 and 
            //  the red and blue to the variables created previously.
            Color newGreen = new Color(randIntRed, 128, randIntBlue);

            // Display the color that was selected into the text area so the user can see the RGB value.
            mainTextArea.append("The color applied was RGB hue value: " + randIntRed + ", 128, " + randIntBlue + "\n");
            
            // Here is where the background color is changed to the random value.
            getContentPane().setBackground(newGreen);
        }

        // Handles when the Exit Program menu option is selected.
        if (event.getActionCommand() == "Exit Program") {

            // This will make the program not visible anymore, and then it will close because
            //  of the EXIT_ON_CLOSE that was defined previously.
            setVisible(false);
            dispose();
        }
   }

   public static void main(String[] args) {
    
    // Create the frame based on the GUIMenuApplication class.
    GUIMenuApplication myGUIMenuFrame = new GUIMenuApplication();

    // Configure the settings for the frame.
    myGUIMenuFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    myGUIMenuFrame.setTitle("Menu GUI Application");
    myGUIMenuFrame.setSize(600,400);
    myGUIMenuFrame.setVisible(true);
    }
}
