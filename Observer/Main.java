package Observer;

public class Main {
    public static void main(String[] args) {
        Trainee trainee = new Trainee();
        FitnessInstructor instructor = new FitnessInstructor(trainee);
        IObserver viewer1 = new Viewer();
        IObserver viewer2 = new Viewer();
        IObserver viewer3 = new Viewer();


        trainee.subscribe(viewer1);
        trainee.subscribe(viewer2);
        trainee.subscribe(viewer3);

        instructor.ChangeTraining("Stand");
        System.out.println();
        instructor.ChangeTraining("Lay");



    }
}
