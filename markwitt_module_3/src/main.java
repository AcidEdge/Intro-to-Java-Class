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
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*; 


public class main{  

static String playerChoice;
static String compsChoice = "";
static String result = "";
static String results = "";
static int playerChoiceInt;
static int compChoice;

    //create main game:
    public static void mainGame() {
    //create variable for player choice:
    playerChoice = "";
    //computer chooses rock/paper/scissor:
    Random rand = new Random();
    int compChoice = rand.nextInt(3);
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
    System.out.println(compChoice);
    System.out.println(compsChoice);
        
    // create game frame and elements:
    JFrame myFrame = new JFrame("Rock Paper Scissors!");
    JPanel myPanel = new JPanel();
    JPanel myPanel2 = new JPanel();    
    JLabel title = new JLabel("Lets Play! Choose:");    
    JButton rock = new JButton(new ImageIcon("img/rock.png"));
    JButton paper = new JButton(new ImageIcon("img/paper.png"));
    JButton scissors = new JButton(new ImageIcon("img/scissor.png"));
    title.setBounds(90, 50,150, 25);    
    rock.setBounds(100, 100, 100, 100);
    paper.setBounds(200, 200, 100, 100);
    scissors.setBounds(300, 300, 100, 100);
    rock.setActionCommand("rock");
    rock.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e) {
        String choice = e.getActionCommand();
        System.out.println(choice);
        String playerChoice = "rock";
        int playerChoiceInt = 0;
        gameResults(playerChoice, result, results, main.compsChoice, playerChoiceInt, compChoice);
        }});
    paper.setActionCommand("paper");
    paper.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e) {
        String choice = e.getActionCommand();
        System.out.println(choice);
        String playerChoice = "paper";
        int playerChoiceInt = 1;
        gameResults(playerChoice, result, results, main.compsChoice, playerChoiceInt, compChoice);
        }});
    scissors.setActionCommand("scissors");
    scissors.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e) {
        String choice = e.getActionCommand();
        System.out.println(choice);
        int playerChoiceInt = 2;
        String playerChoice = "scissors";
        gameResults(playerChoice, result, results, main.compsChoice, playerChoiceInt, compChoice);
        }});    
   
    
    // add elements to frame:
    myPanel.add(title);    
    myPanel2.add(rock);
    myPanel2.add(paper);
    myPanel2.add(scissors);
    //set frame specifics:
    myFrame.setSize(600,600);
    myFrame.setLayout(new FlowLayout(FlowLayout.CENTER, 25, 25));
    myFrame.setVisible(true);
    myFrame.setAlwaysOnTop(true);
    myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   // myFrame.setTitle("Rock, Paper, Scissors!");  
   myFrame.add(myPanel);
   myFrame.add(myPanel2);
    }

    public static void gameResults(String playerChoice, String result, String results, String compsChoice, int playerChoiceInt, int compChoice){
    //game outcome logic:
        if (playerChoiceInt == 0 && compChoice == 0){
            result = "Both chose Rock.";
            results = "It's a Tie.";
        }
        else if (playerChoiceInt == 0 && compChoice == 1){
            result ="Paper beats Rock.";
            results = "Computer Wins.";
        }
        else if (playerChoiceInt == 0 && compChoice == 2){
            result = "Rock beats Scissors.";
            results = "You Win!";
        }
        else if (playerChoiceInt == 1 && compChoice == 0){
            result = "Paper beats Rock.";
            results = "You Win!";
        }
        else if (playerChoiceInt == 1 && compChoice == 1){
            result = "Both chose Paper.";
            results = "It's a Tie.";
        }
        else if (playerChoiceInt == 1 && compChoice == 2){
            result = "Scissors beat Paper";
            results = "Computer Wins.";
        }
        else if (playerChoiceInt == 2 && compChoice == 0){
            result = "Rock beats Scissors";
            results = "Computer Wins.";
        }
        else if (playerChoiceInt == 2 && compChoice == 1){
            result = "Scissors beat Paper";
            results = "You Win!";
        }
        else if (playerChoiceInt == 2 && compChoice == 2){
            result = "Both chose Scissors.";
            results = "It's a Tie.";
        }
//insert output here.
    System.out.println("Computer chose: " + compsChoice);
    System.out.println("You Chose: " + playerChoice);
    System.out.println(result);
    System.out.println(results);
    
    }
    


    public static void main(String[] args){
        //main method...run program
        mainGame();
    }

    }






    
    

