/*
 * Mark Witt
 * CSD320-345A
 * Module 3
 * Assignment 1
 * 10/24/2022
 */

 //imports:
import java.util.Random;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*; 

public class main{  
//create gloabl variables:
static String playerChoice;
static String compsChoice = "";
static String result = "";
static String results = "";
static int playerChoiceInt;
static int compChoice;
static String paperBeatsRock = "Paper beats Rock.";
static String scissorBeatsPaper = "Scissors beat Paper.";
static String rockBeatsScissor = "Rock beats Scissors";
static String compWins = "Computer Wins.";
static String playerWins = "You Win!";
static String tie = "It's a Tie.";
static JFrame myFrame = new JFrame("Rock Paper Scissors!");

//create main game:
public static void mainGame() {
    //clear variable for player choice:
    playerChoice = "";
    //computer chooses rock/paper/scissor:
    String[] choices = {"rock", "paper", "scissors"};
    compsChoice = choices[new Random().nextInt(choices.length)];
         
    // create game frame and elements:
    JPanel myPanel = new JPanel();
    JPanel myPanel2 = new JPanel();    
    JLabel title = new JLabel("Lets Play! Choose:");
    title.setFont(new Font("Arial", Font.PLAIN, 25));    
    JButton rock = new JButton(new ImageIcon("img/rock.png"));
    JButton paper = new JButton(new ImageIcon("img/paper.png"));
    JButton scissors = new JButton(new ImageIcon("img/scissor.png"));
    //setup action commands/listener for game buttons:
    rock.setActionCommand("rock");
    rock.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e) {
        String playerChoice = e.getActionCommand();
        gameResults(playerChoice, result, results, main.compsChoice, compChoice);
        }});
    paper.setActionCommand("paper");
    paper.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e) {
        String playerChoice = e.getActionCommand();
        gameResults(playerChoice, result, results, main.compsChoice, compChoice);
        }});
    scissors.setActionCommand("scissors");
    scissors.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e) {
        String playerChoice = e.getActionCommand();
        gameResults(playerChoice, result, results, main.compsChoice, compChoice);
        }});    
    
    //add elements to frame:
    myPanel.add(title);    
    myPanel2.add(rock);
    myPanel2.add(paper);
    myPanel2.add(scissors);
    //set frame specifics:
    myFrame.setSize(650,400);
    myFrame.setLayout(new FlowLayout(FlowLayout.CENTER, 25, 25));
    myFrame.setVisible(true);
    myFrame.setAlwaysOnTop(true);
    myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    myFrame.setLocationRelativeTo(null);
    myFrame.add(myPanel);
    myFrame.add(myPanel2);
    }
 
    //method for game results:
    public static void gameResults(String playerChoice, String result, String results, String compsChoice, int compChoice){
        //lock frame so player can only click button once before results given(clears game screen/frame):
        myFrame.getContentPane().removeAll();
        SwingUtilities.updateComponentTreeUI(myFrame);
         
        //game outcome logic:
    if (playerChoice.equals(compsChoice)){
        result = "Both chose " + compsChoice;
        results = tie;
        }
    else if (playerChoice.equals("rock")){
        if (compsChoice.equals("paper")){
            result = paperBeatsRock;
            results = compWins;
            }
        else if (compsChoice.equals("scissors")){
            result = rockBeatsScissor;
            results = playerWins;
            }
        }
    else if (playerChoice.equals("paper")){
        if (compsChoice.equals("rock")){
            result = paperBeatsRock;
            results = playerWins;
            }
        else if (compsChoice.equals("scissors")){
            result = scissorBeatsPaper;
            results = compWins;
            }
        }
    else if (playerChoice.equals("scissors")){
        if (compsChoice.equals("rock")){
            result = rockBeatsScissor;
            results = compWins;
            }
        else if (compsChoice.equals("paper")){
                result = scissorBeatsPaper;
                results = playerWins;
            }
        }    
    //Output game results to panel, draw play again and exit buttons, redraw panel:
    String choiceResults = "Computer chose: " + compsChoice;
    String playerMove = "You Chose: " + playerChoice;
    JPanel playchoices = new JPanel();
    JLabel playchoicesLabel = new JLabel(playerMove);
    playchoicesLabel.setFont(new Font("Arial", Font.PLAIN, 25));
    playchoices.add(playchoicesLabel);
    myFrame.add(playchoices);
    JPanel choices = new JPanel();
    JLabel choicesLabel = new JLabel(choiceResults);
    choicesLabel.setFont(new Font("Arial", Font.PLAIN, 25));
    choices.add(choicesLabel);
    myFrame.add(choices);
    JPanel resultPanel = new JPanel();
    JLabel resultLabel = new JLabel(result);
    resultLabel.setFont(new Font("Arial", Font.PLAIN, 25));
    resultPanel.add(resultLabel);
    myFrame.add(resultPanel);
    JPanel resultsPanel = new JPanel();
    JLabel resultsLabel = new JLabel(results);
    resultsLabel.setFont(new Font("Arial", Font.BOLD, 25));
    resultsPanel.add(resultsLabel);
    myFrame.add(resultsPanel);
     
    //provide options to play again or exit:
    JButton playAgain = new JButton(new ImageIcon("img/playagain.png"));
    JButton exit = new JButton(new ImageIcon("img/exit.png"));
    JPanel again = new JPanel();
    again.add(playAgain);
    again.add(exit);
    myFrame.add(again);
 
    //action listener for play again/exit buttons:
    SwingUtilities.updateComponentTreeUI(myFrame);
    exit.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e) {
        System.exit(0);
        }}); 
    playAgain.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e) {
        myFrame.getContentPane().removeAll();
        SwingUtilities.updateComponentTreeUI(myFrame);
        mainGame();
        }});     
    }
     
    public static void main(String[] args){
        //main method...run game
        mainGame();
    }
}