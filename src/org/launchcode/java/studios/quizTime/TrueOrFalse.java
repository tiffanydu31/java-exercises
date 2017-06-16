package org.launchcode.java.studios.quizTime;

import java.util.ArrayList;

/**
 * Created by lucke on 6/1/2017.
 */
public class TrueOrFalse extends Question{

    private boolean mCorrectAnswer;

    public TrueOrFalse(String type, String question, int points, boolean correctAnswer) {
        super(type, question, points);
        mCorrectAnswer = correctAnswer;
    }

    public ArrayList<String> printChoices(){
        ArrayList<String> results = new ArrayList<>();
        results.add("true");
        results.add("false");

        return results;
    }

    public void getAnswer(boolean value){
        if (mCorrectAnswer == value) {
            mResult = true;
        } else {
            mResult = false;
        }
    }

}
