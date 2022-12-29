import javax.swing.*;
import java.awt.*;

public class MyGUI {
  public static void main(String[] args) {
    // Create a JFrame
    JFrame frame = new JFrame("My GUI");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    // Create a JPanel
    JPanel panel = new JPanel();
    panel.setLayout(new FlowLayout());

    // Create some components
    JLabel label = new JLabel("Enter your name:");
    JTextField textField = new JTextField(20);
    JButton button = new JButton("Click me!");

    // Add the components to the panel
    panel.add(label);
    panel.add(textField);
    panel.add(button);

    // Add the panel to the frame
    frame.add(panel);

    // Set the size and display the frame
    frame.setSize(300, 100);
    frame.setVisible(true);
  }
}
