package com.example.app;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class App {

    private static void createAndShowGUI() {
        // Window を作成する
        final JFrame frame = new JFrame("Title");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // パネルの追加
        // (JFrame に直接ラベル・ボタンを設定するとどちらかしか表示されないのでパネルを追加する)
        final JPanel panel = new JPanel();
        frame.getContentPane().add(panel);

        // ラベルの追加
        final JLabel label = new JLabel("");
        panel.add(label);

        // ボタンの追加
        final JButton button = new JButton("BUTTON");
        button.addActionListener(e -> label.setText("Hello, World"));
        panel.add(button);

        // Windowを表示する
        frame.setBounds(100, 100, 300, 200);
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
