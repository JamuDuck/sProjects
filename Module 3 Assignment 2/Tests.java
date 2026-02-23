import java.util.Scanner;

public class Tests {

    private double ave;
    private int count;
    private int score;

    public Tests() {

    }

    // Getters
    public double getAve() {
        return ave;
    }

    public int getCount() {
        return count;
    }

    public int getScore() {
        return score;
    }

    // Setter
    public void setScore(int newScore){
        score = newScore;
    }

    // Loop for avr
    public void getAverage(){
        Scanner input = new Scanner(System.in);
        int sum = 0;
        count = 0;

        System.out.print("Enter a test score (-1 to quit): ");
        score = input.nextInt();

        while (score != -1) {
            sum = sum +score;
            count = count + 1;
            System.out.print("Enter a test score (-1 to quit): ");
            score = input.nextInt();
        }
        ave = (double) sum / count;
    }


    // Avr display (text)
    public String toString(){
        return "The average of the " + count +
                " scores entered is " +
                String.format("%.2f", ave) + ".";

    }
}