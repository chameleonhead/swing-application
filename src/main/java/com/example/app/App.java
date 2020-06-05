package com.example.app;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

/**
 * Hello world!
 *
 */
public class App {
    /**
     * Create the GUI and show it. For thread safety, this method should be invoked
     * from the event-dispatching thread.
     */
    private static void createAndShowGUI() {
        // Create and set up the window.
        final JFrame frame = new JFrame("Title");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        final JPanel panel = new JPanel();
        frame.getContentPane().add(panel);

        // Add the ubiquitous "Hello World" label.
        final JLabel label = new JLabel("");
        panel.add(label);

        final JButton button = new JButton("BUTTON");
        button.addActionListener(e -> label.setText("Hello, World"));
        panel.add(button);

        // Display the window.
        frame.pack();
        frame.setVisible(true);
    }

    public static void main(final String[] args) {
        // Schedule a job for the event-dispatching thread:
        // creating and showing this application's GUI.
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
}
