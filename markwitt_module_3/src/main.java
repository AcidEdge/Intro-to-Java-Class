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

static String playerChoice;
static String compsChoice;
static String result;
static String results;
static int playerChoiceInt;
static int compChoice;

    //create main game:
    public static void mainGame() {
    //create variable for player choice:
    playerChoice = "";
    //computer chooses rock/paper/scissor:
    Random rand = new Random();
    int compChoice = rand.nextInt(3);
    String compsChoice = "";
    String result = "";
    String results = "";
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
    
        
    // create game frame and elements:
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
        String playerChoice = "rock";
        int playerChoiceInt = 0;
        gameResults(playerChoice, result, results, main.compsChoice, playerChoiceInt);
        }});
    paper.setActionCommand("paper");
    paper.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e) {
        String choice = e.getActionCommand();
        System.out.println(choice);
        String playerChoice = "paper";
        int playerChoiceInt = 1;
        gameResults(playerChoice, result, results, main.compsChoice, playerChoiceInt);
        }});
    scissors.setActionCommand("scissors");
    scissors.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e) {
        String choice = e.getActionCommand();
        System.out.println(choice);
        int playerChoiceInt = 2;
        String playerChoice = "scissors";
        gameResults(playerChoice, result, results, main.compsChoice, playerChoiceInt);
        }});    
   
    
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

    }

    public static void gameResults(String playerChoice, String result, String results, String compsChoice, int playerChoiceInt){
        switch(playerChoiceInt){
            case 0:
                switch(compChoice){
                    case 0:
                        result = "It's a Tie!";
                        results = "Both chose Rock.";
                        break;
                    case 1:
                        result = "Computer Wins!";
                        results = "Paper beats Rock!";
                        break;
                    case 2:
                        result = "You Win!";
                        results = "Rock beats Scissors!";
                        break;
                    }
            case 1:
                switch(compChoice){
                    case 0:
                        result = "You Win!";
                        results = "Paper beats Rock!";
                        break;
                    case 1:
                        result = "It's a Tie!";
                        results = "Both chose Paper.";
                        break;
                    case 2:
                        result = "Computer Wins!";
                        results = "Scissors beat Paper!";
                        break;
                    }
            case 2:
                switch(compChoice){
                    case 0:
                        result = "Computer Wins!";
                        results = "Rock beats Scissors!";
                        break;
                    case 1:
                        result = "You Win!";
                        results = "Scissors beats Paper!";
                        break;
                    case 2:
                        result = "It's a Tie!";
                        results = "Both chose Scissors.";
                        break;
                    }
        }
//insert output here.
    
    }
    


    public static void main(String[] args){
        //main method...run program
        mainGame();
    }

    }






    
    

