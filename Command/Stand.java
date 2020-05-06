package Command;

public class Stand implements Command {
    private Trainee trainee;

    public Stand(Trainee trainee) {
        this.trainee = trainee;
    }
    @Override
    public void execute() {
        trainee.setTraining("Stand");
    }
}
