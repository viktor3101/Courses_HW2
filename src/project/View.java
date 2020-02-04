package project;

import java.util.ArrayList;

public class View {
    private final String tryAgain = "Try again\n";

    public void numberIsExpected(int number) {
        System.out.println("Number " + number + " that you have entered is expected\n");
    }

    public void numberIsUnexpected() {
        System.out.println("Wrong number!\n");
    }

    public void isLower(int number) {
        System.out.println("Number " + number + " is lower\n" + tryAgain);
    }

    public void isHigher(int number) {
        System.out.println("Number " + number + "is higher\n" + tryAgain);
    }

    public void enterYouNumber() {
        System.out.println("Enter the number: ");
    }

    public void startGame() {
        System.out.println("Hi, let`s start:)\n");
    }

    public void endGame() {
        System.out.println("Congratulations, you did it!");
    }

    public void showHistoryOfNumbers(ArrayList<Integer> list) {
        for (int number : list) {
            System.out.print(number +" -> ");
        }
    }

    public void numberIsOutOfRange(){
        System.out.println("Alarm, number is out of range!");
    }

    public void spacer(){
        System.out.println("**************");
    }
}
