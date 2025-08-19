import java.awt.Font;
import  javax.swing.*;
public class RockPaperScissorGUI extends JFrame{
    JButton rockButton,paperButton,scissorButton;
    public RockPaperScissorGUI(){
        //invoke Jframe constructor and add title to the GUI
        super(/*Title*/ "Rock Paper Scissor Game");

        //set the size of the GUI
        setSize(/*width:*/ 450,/* height:*/ 574);

        //set layout to null to disable layout management, so we can use absolute positining for the elements
        //(i.e setting x,y coordinates and width/height values)
        setLayout(null);

        //terminate the java virtual machine when closing the GUI
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        //load GUI in the center of th screen every time we run the application
        setLocationRelativeTo(null);

        //add GUI components
        addGuiComponents();
    }

    private void addGuiComponents(){
        //create computer score label
        JLabel computerScoreLabel=new JLabel("Compuer:0");

        //set x,y coordinates and width/height values
        computerScoreLabel.setBounds(0,43,450,30);

        //set the font to have a font family of dialog, font-weight of bold and font size of 26
        computerScoreLabel.setFont(new Font("Dialog", Font.BOLD,26));

        //place the text in the center
        computerScoreLabel.setHorizontalAlignment(SwingConstants.CENTER);

        //add to GUI
        add(computerScoreLabel);

        //create computer choice
        JLabel computerChoice= new JLabel("?");
        computerChoice.setBounds(175,118,98,81);
        computerChoice.setFont(new Font("Dialog",Font.PLAIN,18));
        computerChoice.setHorizontalAlignment(SwingConstants.CENTER);

        //create a black border around
        computerChoice.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        add(computerChoice);

        //create player score label
        JLabel playerScoreLabel=new JLabel("Player:0");
        playerScoreLabel.setBounds(0,317,50,30);
        playerScoreLabel.setFont(new Font("Dialog",Font.BOLD,26));
        playerScoreLabel.setHorizontalAlignment(SwingConstants.CENTER);
        add(playerScoreLabel);

        //player buttons

        //rock button
        rockButton= new JButton("Rock");
        rockButton.setBounds(40,387,105,81);
        rockButton.setFont(new Font("Dialog",Font.PLAIN,18));
        add(rockButton);

        //paper button
        paperButton= new JButton("Paper");
        paperButton.setBounds(165,387,105,81);
        paperButton.setFont(new Font("Dialog",Font.PLAIN,18));
        add(paperButton);

        //scissor button
        scissorButton= new JButton("Scissor");
        scissorButton.setBounds(290,387,105,81);
        scissorButton.setFont(new Font("Dialog",Font.PLAIN,18));
        add(scissorButton);
    }

    //displays a message dialog which will show the winner and a try again button to play again
    private void showDialog(String message)
    {
        JDialog resultDialog= new JDialog(this,"Result",true);
        resultDialog.setSize(227,124);
        resultDialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        resultDialog.setResizable(false);

    }
}