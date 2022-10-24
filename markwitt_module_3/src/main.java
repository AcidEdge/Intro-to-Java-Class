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

 //imports:

import java.util.Random;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*; 

public class main{  
      
    //create main game:
    public static void mainGame() {
    //create variable for player choice:
    String playerChoice = "";
    //computer chooses rock/paper/scissor:
    Random rand = new Random();
    int compChoice = rand.nextInt(3);
    String compsChoice = "";
    switch (compChoice){
        case 0:
            compsChoice = "rock";
            break;
        case 1:
            compsChoice = "paper";
            break;
        case 2:
            compsChoice = "scissors";
            break;
    }
        
    // create frame and elements:
    JFrame myFrame = new JFrame();
    JLabel title = new JLabel("Rock Paper Scissors!");
    JLabel title2 = new JLabel("Choose:");
    JButton rock = new JButton(new ImageIcon("img/rock.png"));
    JButton paper = new JButton(new ImageIcon("img/paper.png"));
    JButton scissors = new JButton(new ImageIcon("img/scissor.png"));
    title.setBounds(90, 50,150, 25);
    title2.setBounds(125, 75, 75, 25);
    rock.setBounds(100, 100, 100, 100);
    paper.setBounds(100, 200, 100, 100);
    scissors.setBounds(100, 300, 100, 100);
    rock.setActionCommand("rock");
    rock.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e) {
        String choice = e.getActionCommand();
        System.out.println(choice);
        }
        String playerChoice = "rock";
        });
    paper.setActionCommand("paper");
    paper.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e) {
        String choice = e.getActionCommand();
        System.out.println(choice);
        //playerChoice = "paper";
        }
        });
    scissors.setActionCommand("scissors");
    scissors.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e) {
        String choice = e.getActionCommand();
        System.out.println(choice);
        //playerChoice = "scissors";
        }
        });    
    System.out.println("computers choice: " + compsChoice);
    
    // add elements to frame:
    myFrame.add(title);
    myFrame.add(title2);
    myFrame.add(rock);
    myFrame.add(paper);
    myFrame.add(scissors);
    //set frame specifics:
    myFrame.setSize(300,550);
    myFrame.setLayout(null);
    myFrame.setVisible(true);
    myFrame.setAlwaysOnTop(true);
    myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    myFrame.setTitle("Rock, Paper, Scissors!");  
    String result = "";
    String results = "";
        
    if (playerChoice == "rock"){
        switch(compsChoice){
            case "rock":
                result = "It's a Tie!";
                break;
            case "paper":
                result = "Computer Wins!";
                results = "Paper beats Rock!";
                break;
            case "scissors":
                result = "You Win!";
                results = "Rock beats Scissors!";
                break;
        }}
    else if (playerChoice == "paper"){
        switch(compsChoice){
            case "rock":
                result = "You Win!";
                results = "Paper beats Rock!";
                break;
            case "paper":
                result = "It's a Tie!";
                break;
            case "scissors":
                result = "Computer Wins!";
                results = "Scissors beat Paper!";
                break;
        }}
    else {
        switch(compsChoice){
            case "rock":
                result = "Computer Wins!";
                results = "Rock beats Scissors";
                break;
            case "paper":
                result = "You Win!";
                results = "Scissors beat Paper!";
                break;
            case "scissors":
                result = "It's a Tie!";
                break;
        }}
    
    }


    public static void main(String[] args){
        //main method...run program
        mainGame();
    }

    }






    
    

