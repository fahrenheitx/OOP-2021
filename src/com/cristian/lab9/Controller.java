package com.cristian.lab9;

import javafx.scene.control.*;

public class Controller {
    public Button calculateButton;
    public Button resetAllButton;

    public TextArea result;
    public TextArea messageTextArea;

    public TextField dividend;
    public TextField divisor;

    public void calculateDivision() {
        setMessageTextArea("");

        try {
            double val1 = Double.parseDouble(dividend.getText());
            double val2 = Double.parseDouble(divisor.getText());
            double res = val1 / val2;
            setResult(String.valueOf(res));
        } catch (Throwable exception) {
            setResult("Divide operation failed!");
            String messageText = new String("An Exception or Error occurred:\n" + exception);
            setMessageTextArea(messageText);
            System.err.println(exception);
        }
    }

    public void isUnluckyNumber() {
        try {
            if(divisor.getText().equals("13"))
                throw new UnluckyException("Value 13 appeared in the divisor input, you are doomed!");
        } catch (UnluckyException exception) {
            System.err.println(exception);
        }
    }

    class UnluckyException extends Exception {
        public UnluckyException(String message) {
            super(message);
            setMessageTextArea(message);
        }
    }

    public void resetAppStateToInitial() {
        dividend.setText("");
        divisor.setText("");
        result.setText("");
        messageTextArea.setText("");
    }

    public void setMessageTextArea(String text) {
        messageTextArea.setText(text);
    }

    public void setResult(String text) {
        result.setText(text);
    }
}