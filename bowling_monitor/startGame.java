import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;  
import java.util.ArrayList;

public class startGame {
    public static void main(String[] args) {
        otherGame g = new otherGame();
        
        System.out.print("Starting new bowling game\n");
        

        try {
            Scanner scanner = new Scanner(new File("/Users/ramonreyes/Desktop/my-repo/bowling_monitor/score.text"));

            ArrayList<Integer> userRolls = new ArrayList<>();
            
            while(scanner.hasNextInt()) {
                userRolls.add(scanner.nextInt());
            }

            scanner.close();

            if(userRolls.size() > 21 || userRolls.size() < 1) {
                System.out.print("Sorry, please try again with a valid score list. \n");
                return;
            }

            for(int i = 0; i < userRolls.size(); i++) {
                g.newRoll(userRolls.get(i));
            }

            g.showScore();
        }
        catch (FileNotFoundException e) {
            System.out.println("An error occurred. \n");
            e.printStackTrace();

        }
        
    }
}
