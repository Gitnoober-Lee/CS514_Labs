package QA_Inheritance_Lab;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @Description:
 * @Title: Quiz
 * @Package lab_QA_Inheritance_Lab
 * @Author: lijunpeng@cmhi.chinamobile.com
 * @CreateTime: 9/27/23 11:38 AM
 */
public class Quiz {

    private ArrayList<QA> QAList = new ArrayList();

    public void add(QA qa){
        QAList.add(qa);
    }

    public void run(){

    }

    public static void main(String args[]) {
        // create an object of superclass (QA) and use it
        // QA qa = new QA("How many states are there?", "50");
        // qa.displayQuestion();
        // // create an object of subclass and use it.
        // ArrayList<String> choices = new ArrayList<String>();
        // choices.add("a. Sacramento");
        // choices.add("b. San Francisco");
        // QA cqa = new ChoiceQA("What is the capital of California?", "a", choices);
        // cqa.displayQuestion();
        // Scanner scanner = new Scanner(System.in);
        // String answer = scanner.next();
        // if (cqa.checkAnswer(answer)) {
        //     System.out.println("correct");
        // } else {
        //     System.out.println("incorrect");
        //     cqa.displayAnswer();
        // }

        QA q = new NumberRangeQA("How old is David?", 18, 3);
        q.displayQuestion();
        Scanner scanner = new Scanner(System.in);
        String answer = scanner.next();
        if (q.checkAnswer(answer)) {
            System.out.println("correct");
        } else {
            System.out.println("incorrect");
            q.displayAnswer();
        }
    }
}

