package week8.practise_problems;
import java.util.*;

public interface Question {
    double calculateScore(String correctAnswer, String studentAnswer, double points);
    String getType();
}

class MCQ implements Question {

    public double calculateScore(String correctAnswer, String studentAnswer, double points) {
        if (studentAnswer.equals(correctAnswer)) {
            return points;
        }
        return 0;
    }

    public String getType() {
        return "MCQ";
    }
}

class TF implements Question {

    public double calculateScore(String correctAnswer, String studentAnswer, double points) {
        if (studentAnswer.equals(correctAnswer)) {
            return points;
        }
        return 0;
    }

    public String getType() {
        return "TF";
    }
}

class Essay implements Question {

    public double calculateScore(String correctAnswer, String studentAnswer, double points) {

        String[] keywords = correctAnswer.split(",");
        int count = 0;

        studentAnswer = studentAnswer.toLowerCase();

        for (String keyword : keywords) {
            keyword = keyword.trim().toLowerCase();

            if (studentAnswer.contains(keyword)) {
                count++;
            }
        }

        if (count >= 2) {
            return points * 0.75;
        }
        else if (count == 1) {
            return points * 0.50;
        }
        else {
            return 0;
        }
    }

    public String getType() {
        return "ESSAY";
    }
}

class Q {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();

        double totalScore = 0;

        for (int i = 0; i < n; i++) {

            String line = sc.nextLine();

            // Split only into 5 parts
            String[] parts = line.split("\"");

            String type = parts[0].trim();

            String questionText = parts[1];
            String correctAnswer = parts[3];
            String studentAnswer = parts[5];

            String pointsPart = parts[6].trim();
            double points = Double.parseDouble(pointsPart);

            Question question;

            if (type.equals("MCQ")) {
                question = new MCQ();
            }
            else if (type.equals("TF")) {
                question = new TF();
            }
            else {
                question = new Essay();
            }

            double score = question.calculateScore(
                    correctAnswer,
                    studentAnswer,
                    points
            );

            System.out.printf("%s: %.2f%n",
                    question.getType(), score);

            totalScore += score;
        }

        System.out.printf("Total Score: %.2f%n", totalScore);
    }
}