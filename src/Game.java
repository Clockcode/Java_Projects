import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Game {
    JFrame window;
    Container cont;
    JPanel titlePanel, startButtonPanel, mainTextPanel;
    JLabel titleLabel;
    JButton startButton;
    JTextArea mainTextArea;
    Font titleFont = new Font("Times New Roman", Font.PLAIN, 40);
    Font startFont = new Font("Times New Roman", Font.PLAIN, 20);
    TitleScreenHandler titleSHandler = new TitleScreenHandler();
    public Game(){

        //Title Panel
        titlePanel = new JPanel();
        titlePanel.setBounds(45, 50, 510, 50);
        titlePanel.setBackground(Color.black);

        //Title
        titleLabel = new JLabel("Adventure of the Meadows");
        titleLabel.setForeground(Color.white);
        titleLabel.setFont(titleFont);
        titlePanel.add(titleLabel);

        //Start Button Panel
        startButtonPanel = new JPanel();
        startButtonPanel.setBounds(250,250,100,40);
        startButtonPanel.setBackground(Color.black);

        //Start Label
        startButton = new JButton("Start");
        startButton.setForeground(Color.white);
        startButton.setBackground(Color.black);
        startButton.setFont(startFont);
        startButton.addActionListener(titleSHandler);
        startButtonPanel.add(startButton);

        //Window
        window = new JFrame();
        window.setSize(600, 400);
        // Enables us to close the window
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.getContentPane().setBackground(Color.black);
        window.setLayout(null);
        //Container on top pf window
        cont = window.getContentPane();
        cont.add(titlePanel);
        cont.add(startButtonPanel);
        //Without this line you can not see the screen
        window.setVisible(true);
    }

    public void createGameScreen(){
        //Without disabling current pannels next panel won't be visible
        titlePanel.setVisible(false);
        startButtonPanel.setVisible(false);
        mainTextPanel = new JPanel();
        mainTextPanel.setBounds(50,90,400,120);
        mainTextPanel.setBackground(Color.black);
        cont.add(mainTextPanel);

        mainTextArea = new JTextArea();
        mainTextArea.setBounds(50,90,400,120);
        mainTextArea.setBackground(Color.black);
        mainTextArea.setForeground(Color.white);
        mainTextArea.setFont(startFont);
        mainTextArea.setLineWrap(true);
        mainTextPanel.add(mainTextArea);
    }

    public class TitleScreenHandler implements ActionListener {
        public void actionPerformed(ActionEvent event){
            createGameScreen();
        }
    }
    public static void main(String[] args) {
        new Game();
    }
}
