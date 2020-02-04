package project;

import java.util.ArrayList;
import java.util.Scanner;

public class Controller {
    private View view;
    private Model model;

    public Controller(View view, Model model) {
        this.model = model;
        this.view = view;
    }

    public void runApp() {
        Scanner scanner = new Scanner(System.in);
        startPlay(scanner);
        scanner.close();
    }

    public void startPlay(Scanner scanner) {
        view.startGame();

        model.setNumbersHistory(new ArrayList<>());
        model.setExpectedNumber((int) (Math.random() * 100));
        model.setMin(0);
        model.setMax(100);

        while (!model.isExpected()) {
            view.enterYouNumber();
            model.setCurrentNumber(scanner.nextInt());

            if (model.numberIsValid(model.getCurrentNumber())) {
                if (model.isExpected()) {
                    model.addNumberToHistory(model.getCurrentNumber());
                    view.numberIsExpected(model.getCurrentNumber());
                } else {
                    if (model.getCurrentNumber() < model.getExpectedNumber()) {
                        view.numberIsUnexpected();
                        view.isLower(model.getCurrentNumber());
                    } else {
                        view.numberIsUnexpected();
                        view.isHigher(model.getCurrentNumber());
                    }
                    model.isLowerThenExpected();
                }
            }
            else{
                view.numberIsOutOfRange();
            }
            view.spacer();
        }

        view.showHistoryOfNumbers(model.getNumbersHistory());
        view.endGame();
    }
}
