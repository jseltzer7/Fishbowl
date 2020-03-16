import javax.swing.JOptionPane;
import java.util.Timer;
import java.util.TimerTask;

//Create option for user to set their house rules
public class Game {
	private static final String[] buttons1 = {"Correct", "Pass", "End Turn"};
	private static final String[] buttons2 = {"Correct", "End Turn"};
	
	
	public static void main(String[] args) {
		int score = 0;
		
		//Countdown();
		/*
		Create two threads, one for the timer and one for game play so that they can run at the same time
		*/
		int numPlayers = Integer.parseInt(getInput("How many people are playing? :)"));
		int numWords = Integer.parseInt(getInput("How many words per player?"));
		int myAmount = numWords * numPlayers;
		WordDeck myDeck = new WordDeck(myAmount);
		
		for (int i=0; i < myAmount; i++) {
			myDeck.addWord(new Word(getInput("Enter a word")));
		}
		
		/* for (int i=0; i < myDeck.getSize(); i++) {
			System.out.println(myDeck.getWord(i).getWord());
		} */
		
		while(myDeck.getSize() != 0) {
			int play = JOptionPane.showOptionDialog(null, myDeck.drawWord().getWord(), "Fishbowl", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, buttons1, buttons1[0]);
			if (play == 0) {
				score++;
				callPrint("Correct!");
			} else if (play == 1) {
				//Nothing for now
				callPrint("Not correct");
			} else if (play == 2) {
				System.out.println("Goodbye");
				System.exit(0);
			} else {
				System.out.println("Goodbye");
				System.exit(0);
			}
		}
	}
	
	//Need JOptionPane option box - correct, pass, end turn
	
	
	
	
	public static void callPrint(String s) {
		JOptionPane.showMessageDialog(null, s);
	}
	
	public static String getInput(String s) {
		return JOptionPane.showInputDialog(s);
	}
	
	
    public static void Countdown() {
        final Timer timer = new Timer();
        timer.scheduleAtFixedRate(new TimerTask() {
            int i = 30;
            public void run() {
				//int j = i--;
                System.out.println(Integer.toString(i--));
                if (i< 0)
                    timer.cancel();
            }
        }, 0, 1000);
    }

	
}