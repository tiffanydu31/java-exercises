package org.launchcode.java.studios.quizTime;

import java.util.ArrayList;

/**
 * Created by lucke on 6/1/2017.
 */
public class MultipleChoice extends Question {

    private ArrayList<String> mAnswerChoices;
    private int mCorrectAnswer;

    public MultipleChoice(String type, String question, int points, ArrayList<String> answerChoices, int correctAnswer) {
        super(type, question, points);
        mAnswerChoices = answerChoices;
        mCorrectAnswer = correctAnswer;
    }

    public ArrayList<String> printChoices() {
        return mAnswerChoices;
    }
    public void selectAnswer(int answer) {
        if (answer == mCorrectAnswer) {
            mResult = true;
        } else {
            mResult = false;
        }
    }

}
