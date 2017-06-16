package org.launchcode.java.studios.quizTime;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Created by lucke on 6/1/2017.
 */
public class Checkbox extends Question{

    private ArrayList<String> mAnswerChoices;
    private ArrayList<Integer> mCorrectAnswers;

    public Checkbox(String type, String question, int points, ArrayList<String> answerChoices, ArrayList<Integer> correctAnswers) {
        super(type, question, points);
        mAnswerChoices = answerChoices;
        mCorrectAnswers = correctAnswers;
    }

    public ArrayList<String> printChoices(){
        return mAnswerChoices;
    }

    public void selectAnswer(ArrayList<Integer> answers) {
        for (Integer answer : answers) {
            if (!(mAnswerChoices.contains(answer))) {
                mResult = false;
            }
        }

        if (mResult != false) {
            mResult = true;
        }
    }

}
