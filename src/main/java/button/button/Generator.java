package button.button;

import java.util.ArrayList;
import java.util.Random;


public class Generator {
    private ArrayList<String> answers = new ArrayList();
    private final Random generator = new Random ();

    public Generator() {
    }

    public Generator(ArrayList<String> answers) {
        this.answers = answers;
    }

    public String getAnswer() {
        int number  = generator.nextInt(answers.size());
        return answers.get(number);
    }

    public void setAnswers(String answer) {
        answers.add(answer);
    }
}
