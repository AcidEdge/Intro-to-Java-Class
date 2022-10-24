/*
 * Mark Witt
 * CSD320-345A
 * Module 3
 * Assignment 1
 * 10/24/2022
 */

/**
 *
 * @author markw
 */
import java.nio.BufferOverflowException;

import javax.swing.*;
public class main {

  
    public static void main(String[] args) {
        JFrame myFrame = new JFrame();

        JButton rock = new JButton(new ImageIcon("img/rock.png"));
        JButton paper = new JButton(new ImageIcon("img/paper.png"));
        JButton scissors = new JButton(new ImageIcon("img/scissor.png"));
        rock.setBounds(100, 100, 100, 100);
        paper.setBounds(100, 200, 100, 100);
        scissors.setBounds(100, 300, 100, 100);

        myFrame.add(rock);
        myFrame.add(paper);
        myFrame.add(scissors);

        myFrame.setSize(300,550);
        myFrame.setLayout(null);
        myFrame.setVisible(true);



    }
    
}
