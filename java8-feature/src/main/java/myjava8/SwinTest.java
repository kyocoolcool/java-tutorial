package myjava8;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLOutput;

/**
 * @ClassName SwinTest
 * 
 * @Author chris
 * @Date 2019-02-15 11:39
 * @Version 1.0
 **/

public class SwinTest {
    public static void main(String[] args) {

        JFrame myJFrame = new JFrame("my JFrame");
        JButton myJButton = new JButton("my JButton");
        myJButton.addActionListener((ActionEvent event) -> {
            System.out.println("button pressed1");
            System.out.println("button pressed2");
            System.out.println("button pressed3");
        });
        myJFrame.add(myJButton);
        myJFrame.pack();
        myJFrame.setVisible(true);
        myJFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}