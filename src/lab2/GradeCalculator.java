package lab2;

public class GradeCalculator{

    public static void main(String[] args) {

        int[] scores = {95, 82, 70, 55, 49};

        for (int score : scores) {

            char grade;
            String message;

            if (score >= 90) {
                grade = 'A';
                message = "Excellent!";
            } else if (score >= 80) {
                grade = 'B';
                message = "Very Good";
            } else if (score >= 70) {
                grade = 'C';
                message = "Good";
            } else if (score >= 60) {
                grade = 'D';
                message = "Needs improvement";
            } else {
                grade = 'F';
                message = "Fail";
            }

            System.out.println("Score: " + score + " -> Grade: " + grade + " (" + message + ")");
        }
    }
}