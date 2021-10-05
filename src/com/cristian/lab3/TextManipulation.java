package com.cristian.lab3;

public class TextManipulation {
    public String text;

    public TextManipulation() {
        this.text = "";
    }

    public int getWords() {
        int count = 0;
        char[] ch = new char[this.text.length()];

        for (int i = 0; i < this.text.length(); i++) {
            ch[i] = this.text.charAt(i);
            if (((i > 0) && (ch[i] != ' ') && (ch[i - 1] == ' ')) || ((ch[0] != ' ') && (i == 0)))
                count++;
        }
        return count;
    }

    public int getSentences() {
        return this.text.split("[^.?!]+").length - 1;
    }
}
