import java.util.ArrayList;


public class otherGame {
    private ArrayList<Integer> scoreCount = new ArrayList<>(10);
    private ArrayList<ArrayList<Integer>> rolls = new ArrayList<ArrayList<Integer>>(10);
    private int currentFrame = 0;
    private int currentRoll = 0;

    public void newRoll(int pins) {
        
        if(currentRoll == 0) {
            rolls.add(new ArrayList<Integer>());
        }
        
        while((currentRoll == 1 && (rolls.get(currentFrame).get(0) + pins > 10)) || pins > 10) {    //in case roll goes over the amount of pins still standing
            System.out.printf("CURRENT ROLL IS %d \n",currentRoll);
            System.out.printf("You don't have enough pins left to knock %d pins down!", pins);
            return;
        }

        rolls.get(currentFrame).add(pins);

        if((currentRoll == 1 && currentFrame != 9) || pins == 10) {     //checks current roll to determine whether frame is over
            currentFrame++;
            currentRoll = 0;
        } else {
            currentRoll++;
        }

    }

    public void calcScore() {
        int score = 0;

        for(int frame = 0; frame < rolls.size(); frame++) {
            if(isStrike(frame)) {
                score += 10 + strikeBonus(frame);
            } else if(isSpare(frame)) {
                score += 10 + spareBonus(frame);
            } else if(frame == 9) {
                for(int roll = 0; roll < rolls.get(9).size(); roll++) {
                    score += rolls.get(9).get(roll);
                }
            } else {
                score += rolls.get(frame).get(0) + rolls.get(frame).get(1);
            }
            scoreCount.add(frame, score);
        }
    }

    public Boolean isStrike(int frame) {
        return (rolls.get(frame).get(0) == 10 || rolls.get(frame).get(1) == 10);
    }

    public Boolean isSpare(int frame) {
        if(rolls.get(frame).size() > 1) {
            return (rolls.get(frame).get(0) + rolls.get(frame).get(1) == 10);
        }
        return false;
    }

    public int strikeBonus(int frame) {
        if(rolls.get(frame+1).size() < 2) {
            return rolls.get(frame+1).get(0) + rolls.get(frame+2).get(0);
        } else {
            return (rolls.get(frame+1).get(0) + rolls.get(frame+1).get(1));
        }
    }

    public int spareBonus(int frame) {
        if(frame == 9) {
            return rolls.get(frame).get(2);
        } else {
            return (rolls.get(frame+1).get(0));
        }
    }

    public void showRolls() {
        int frameCounter = 0;
        for(ArrayList<Integer> frame : rolls) {
            for(int roll = 0; roll < frame.size(); roll++) {
                System.out.printf("Frame %d, Roll %d = %d \n", frameCounter+1, roll, rolls.get(frameCounter).get(roll));
            }
            frameCounter++;
        }
    }

    public void showFrameRoll(int frame) {
        for(int roll = 0; roll < rolls.get(frame).size(); roll++) {
            if(rolls.get(frame).get(roll) == 10) {
                System.out.printf("Roll %d = %c \n", roll+1, 'X');
            } else if(isSpare(frame) && roll < 2) {
                System.out.printf("Roll %d = %d \n", roll+1, rolls.get(frame).get(roll));
                System.out.printf("Roll %d = %c \n", roll+2, '/');
                roll++;
            } else {
                System.out.printf("Roll %d = %d \n", roll+1, rolls.get(frame).get(roll));
            }
        }
    }

    public void showScore() {
        calcScore();

        System.out.print("=======================\n");
        for(int frame = 0; frame < scoreCount.size(); frame++) {
            
            System.out.printf("FRAME %d: \n", frame+1);

            showFrameRoll(frame);
            
            System.out.printf("*SCORE* = %d \n", scoreCount.get(frame));
            
            System.out.print("=======================\n");
        }
        
    }

    public int getFrame() {
        return currentFrame;
    }
}
