package org.launchcode.java.studios.quizTime;

/**
 * Created by lucke on 6/1/2017.
 */
public abstract class Question {
    protected String mType;
    protected String mQuestion;
    protected boolean mResult;
    protected int mPoints;

    public Question(String type, String question, int points) {
        mType = type;
        mQuestion = question;
        mResult = false;
        mPoints = points;
    }

    public String askQuestion() {
        return (mQuestion);
    }

    public boolean getResult() {
        return mResult;
    }

}
