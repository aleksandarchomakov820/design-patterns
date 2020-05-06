package Command;

public class Lay implements Command {
    private Trainee trainee;

    public Lay(Trainee trainee) {
        this.trainee = trainee;
    }
    @Override
    public void execute() {
        trainee.setTraining("lay");
    }
}
