package Quizz;

import java.util.Scanner;

public class Question {

    private String questionText;
    private Answer[] answers;
    private Category category;

    public Question(String categoryIn, String questionTextIn,
            String correctAnswer, String ... wrongAnswers) {
                this.category = Category.valueOf(categoryIn);
                this.questionText = questionTextIn;
                this.answers = new Answer[wrongAnswers.length + 1];
                this.answers[0] = new Answer(correctAnswer, true);
                int i=1;
                for (String s : wrongAnswers) {
                    this.answers[i] = new Answer(s, false);
                    i++;
                }
                // this.answers[1] = new Answer(wrongAnswer, false);
            }
    
    public void shuffleAnswers() {
        // Fisher-Yates shuffle
        for (int i = this.answers.length - 1; i > 0; i--) {
            int j = (int) (Math.random() * (i + 1));
            Answer temp = this.answers[i];
            this.answers[i] = this.answers[j];
            this.answers[j] = temp;
        }
    }

    
    public boolean checkAnswer(int answerNum) {
        if(answerNum < 1 || answerNum >= this.answers.length + 1) {
            System.out.println("Invalid answer number!");
            return false;
        }
        return this.answers[answerNum - 1].isCorrect();        
    }

    public String getQuestionText() {
        return this.questionText;
    }

    public Answer[] getAnswers() {
        return this.answers;
    }

    public Category getCategory() {
        return this.category;
    }

    public void setQuestionText(String questionText) {
        this.questionText = questionText;
    }

    public void setAnswers(Answer[] answers) {
        this.answers = answers;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return this.questionText;
    }

    public void displayQuestion() {
        System.out.println(this.questionText);
        int i = 1;
        for (Answer a : this.answers) {
            System.out.println(i + ") " + a);
            i++;
        }
    }

    // public static void main(String[] args) {
    //     Question q = new Question("Math", "What is 2+2?", "4", "3", "5", "6");
    //     // q.displayQuestion();
    //     q.shuffleAnswers();
    //     q.displayQuestion();
    //     System.out.println("What is your answer?");
    //     Scanner scan = new Scanner(System.in);
    //     int answer = scan.nextInt();
    //     System.out.println(q.checkAnswer(answer));
    // }

}
