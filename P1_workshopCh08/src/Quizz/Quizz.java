package Quizz;

import java.io.FileNotFoundException;
import java.lang.reflect.Array;
import java.util.Scanner;
import java.io.File;
import java.util.ArrayList;

public class Quizz {

    public static ArrayList<Question> readQuestionFile(String filename) throws FileNotFoundException{
        // Read the questions from the file
        // Create a new question object for each question
        // Add the question to the list of questions
        Scanner fileScanner = new Scanner(new File(filename));
        ArrayList<Question> questions = new ArrayList<Question>();
        while(fileScanner.hasNextLine()){
            Scanner lineScanner = new Scanner(fileScanner.nextLine());
            lineScanner.useDelimiter(";");
            String category = lineScanner.next();
            String questionText = lineScanner.next();
            String correctAnswer = lineScanner.next();
            String wrongAnswers = lineScanner.next();
            String[] wrongAnswersArr = wrongAnswers.split(",");
            Question q = new Question(category, questionText, correctAnswer, wrongAnswersArr);
            questions.add(q);
        }
        return questions;
    }

    public static void playQuizz(String filename) {
        ArrayList<Question> questions;
        try{
            questions = readQuestionFile(filename);
        } catch(Exception e){
            System.out.println("Error reading file: " + e);
            return;
        }
        Scanner scan = new Scanner(System.in);
        for(Question q : questions){
            q.shuffleAnswers();
            q.displayQuestion();
            System.out.println("What is your answer?");
            int answer = scan.nextInt();
            System.out.println(q.checkAnswer(answer));
        }
    }

    public static void main(String[] args) {
        playQuizz("P1_workshopCh08/src/Quizz/QuizzQuestions.txt");
    }

}
