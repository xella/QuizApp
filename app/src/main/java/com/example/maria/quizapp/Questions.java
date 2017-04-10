package com.example.maria.quizapp;

/**
 * Created by maria on 06/04/17.
 */

public class Questions {
    private String mQuestion;
    private String mAnswer;

    public Questions(String question, String answer) {
        mQuestion = question;
        mAnswer = answer;
    }

    public String getQuestion() {
        return mQuestion;
    }

    public String getAnswer() {
        return mAnswer;
    }

}
