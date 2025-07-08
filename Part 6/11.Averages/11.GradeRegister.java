
import java.util.ArrayList;

public class GradeRegister {

    private ArrayList<Integer> grades;
    private ArrayList<Integer> storedPoints;

    public GradeRegister() {
        this.grades = new ArrayList<>();
        this.storedPoints = new ArrayList<>();
    }

    public void addGradeBasedOnPoints(int points) {
        this.grades.add(pointsToGrade(points));
        this.storedPoints.add(points);
    }

    public int numberOfGrades(int grade) {
        int count = 0;
        for (int received : this.grades) {
            if (received == grade) {
                count++;
            }
        }

        return count;
    }

    public static int pointsToGrade(int points) {

        int grade = 0;
        if (points < 50) {
            grade = 0;
        } else if (points < 60) {
            grade = 1;
        } else if (points < 70) {
            grade = 2;
        } else if (points < 80) {
            grade = 3;
        } else if (points < 90) {
            grade = 4;
        } else {
            grade = 5;
        }

        return grade;
    }

    public double averageOfGrades() {

        int sumOfNumbers = 0;
        int count = 0;
        for (int number : grades) {
            sumOfNumbers += number;
            count += 1;
        }

        if (this.grades.isEmpty()) {
            return - 1;
        }

        return (sumOfNumbers * 1.0) / count;
    }

    public double averageOfPoints() {

        int count = this.storedPoints.size();
        int sumOfPoints = 0;
        for (int number : storedPoints) {
            sumOfPoints += number;
        }
        if (this.grades.isEmpty()) {
            return - 1;
        }
        return (sumOfPoints * 1.0) / count;

    }
}
