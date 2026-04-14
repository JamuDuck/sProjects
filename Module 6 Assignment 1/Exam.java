public class Exam extends Assessment {
    private int numQuestions;
    private int numMissed;
    private double pointsEach;

    public Exam(int questions, int missed) {
        numQuestions = questions;
        numMissed = missed;
        pointsEach = 100.0 / questions;

        double numericScore = 100.0 - (missed * pointsEach);
        setScore((int) numericScore);
    }

    // per question

    public double getPointsEach() {
        return pointsEach;
    }
}