package Command;

public class Main {
    public static void main(String[] args) {
      FitnessInstructor fitnessInstructor = new FitnessInstructor();
        Trainee trainee = new Trainee();

        Viewer viewer1 = new Viewer();
        Viewer viewer2 = new Viewer();
        Viewer viewer3 = new Viewer();

        trainee.subscribe(viewer1);
        trainee.subscribe(viewer2);
        trainee.subscribe(viewer3);


        Command changeTrainingToLay = new Lay(trainee);
        Command changeTrainingToStand = new Stand(trainee);

        fitnessInstructor.setCommand(changeTrainingToLay);
       fitnessInstructor.ChangeTraining();

       fitnessInstructor.setCommand(changeTrainingToStand);
       fitnessInstructor.ChangeTraining();
    }
}
