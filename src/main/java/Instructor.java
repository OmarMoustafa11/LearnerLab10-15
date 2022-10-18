public class Instructor extends Person implements Teachable {

    public Instructor(Long id, String name) {
        super(id, name);
    }


    @Override
    public void teach(Learner learner, double numberOfHours) {
        learner.learn(numberOfHours);
    }

    @Override
    public void lecture(Learner[] learners, double numberOfHours) {
        double numberOfHoursPerLearner = numberOfHours / learners.length;
        for (Learner x : learners) {
            x.learn(numberOfHoursPerLearner);
        }
    }

    @Override
    public double getTotalStudyTime() {
        return 0;
    }
}
