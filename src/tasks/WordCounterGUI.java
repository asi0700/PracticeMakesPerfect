package tasks;

import javax.swing.*;
import java.awt.*;
import java.io.File;

public class WordCounterGUI {
    public static void main(String[] args) {
        JFrame frame = new JFrame("ПРИМЕР");
        frame.setSize(300, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);

        JPanel panel = new JPanel();

        JButton openButton = new JButton("Open");
        JButton runButton = new JButton("Run");

        openButton.addActionListener(e -> {


        });


        runButton.addActionListener(e -> {

                File inputFile = new File("E:\\JavaProjects\\practiceMakesPerfect\\src\\tasks\\avidreaders.ruDubrovskiy.txt");
                File outputFile = new File(inputFile.getParent(), "rezultat1.txt");


                try {
                    WordCounter.analiz(inputFile.getAbsolutePath(), outputFile.getAbsolutePath());
                    Thread.sleep(500);

                    if (outputFile.exists() && outputFile.length() > 0) {
                        Desktop.getDesktop().open(outputFile);
                        JOptionPane.showMessageDialog(frame, "Завершен!");
                    } else {
                        JOptionPane.showMessageDialog(frame, "Файл пустой или не создан!!!!");
                    }
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(frame, "Ошибка: " + ex.getMessage());
                    ex.printStackTrace();
                }

        });

        panel.add(openButton);
        panel.add(runButton);
        frame.add(panel);
        frame.setVisible(true);
    }
}