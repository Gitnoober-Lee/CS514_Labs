package QA_Inheritance_Lab;

import java.util.ArrayList;

/**
 * @Description:
 * @Title: ChoiceQA
 * @Package lab_QA_Inheritance_Lab
 * @Author: lijunpeng@cmhi.chinamobile.com
 * @CreateTime: 9/27/23 11:38 AM
 */
public class ChoiceQA extends QA {
    ArrayList<String> choices = new ArrayList<String>();

    public ChoiceQA(String question, String answer, ArrayList<String> choices) {
        super(question, answer);
        this.choices = choices;
    }

    // override QA's display question so that we include the choices
    @Override
    public void displayQuestion() {
        super.displayQuestion();
        System.out.println(this.choices);
    }
}
