package Quizz;

public class Answer {

    private String answerText;
    private boolean isCorrect;

    public Answer(String answerText, boolean isCorrect) {
        this.answerText = answerText;
        this.isCorrect = isCorrect;
    }

    public String getAnswerText() {
        return this.answerText;
    }

    public boolean isCorrect() {
        return this.isCorrect;
    }

    public void setAnswerText(String answerText) {
        this.answerText = answerText;
    }

    public void setCorrect(boolean isCorrect) {
        this.isCorrect = isCorrect;
    }

    @Override
    public String toString() {
        return this.answerText;
    }

}
