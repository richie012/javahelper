import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {


        Student me = new Student();
        Mark marinaMark = new Mark();

        me.setFirstName("Марина");
        me.setLastName("Алексеева");
        me.setMark(marinaMark);



        Task easy = new Task();
        Task medium = new Task();
        Task hard = new Task();
        Task[] tasks = {easy, medium, hard};

        marinaMark.setResult(tasks);
        marinaMark.setForwardEstimate(easy);

        for (int i = 0; i < tasks.length; i++) {
            boolean decision = tasks[i].getIsDone();

            if (decision && i == 0)
                easy.setTaskScore("easy");
            else if (decision && i == 1)
                medium.setTaskScore("medium");
            else hard.setTaskScore("hard");
        }
        me.ShowTheResult();

    }
}
