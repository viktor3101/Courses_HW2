package project;

import java.util.ArrayList;

public class Model {
    private int min;
    private int max;
    private int expectedNumber;
    private int currentNumber;
    private ArrayList<Integer> numbersHistory;

    public boolean isExpected() {
        return currentNumber == expectedNumber;
    }

    public void isLowerThenExpected() {
        if (currentNumber < expectedNumber) {
            min = currentNumber;
        } else {
            max = currentNumber;
        }
        numbersHistory.add(currentNumber);
    }

    public boolean numberIsValid(int number) {
        return number < max || number > min;
    }

    public ArrayList<Integer> getNumbersHistory() {
        return numbersHistory;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public int getExpectedNumber() {
        return expectedNumber;
    }

    public void setExpectedNumber(int expectedNumber) {
        this.expectedNumber = expectedNumber;
    }

    public int getCurrentNumber() {
        return currentNumber;
    }

    public void setCurrentNumber(int currentNumber) {
        this.currentNumber = currentNumber;
    }

    public void setNumbersHistory(ArrayList<Integer> numbersHistory) {
        this.numbersHistory = numbersHistory;
    }

    public void addNumberToHistory(int number) {
        numbersHistory.add(number);
    }
}
