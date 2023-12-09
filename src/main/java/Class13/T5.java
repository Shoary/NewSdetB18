package Class13;
/*
Create  class Student that will have a method getGrade.Your method should accept the score of a student and return a grade:
score > 90 - A
score >80 - B
score >70 - C
score > 50 - D
anything else - F
 */
public class T5 {
    public static void main(String[] args) {
        // Test the getGrade method with different scores
        int score1 = 95;
        int score2 = 85;
        int score3 = 75;
        int score4 = 55;
        int score5 = 40;

        System.out.println("Score: " + score1 + ", Grade: " + getGrade(score1));
        System.out.println("Score: " + score2 + ", Grade: " + getGrade(score2));
        System.out.println("Score: " + score3 + ", Grade: " + getGrade(score3));
        System.out.println("Score: " + score4 + ", Grade: " + getGrade(score4));
        System.out.println("Score: " + score5 + ", Grade: " + getGrade(score5));
    }

    // Method to get the grade based on the student's score
    private static char getGrade(int score) {
        if (score > 90) {
            return 'A';
        } else if (score > 80) {
            return 'B';
        } else if (score > 70) {
            return 'C';
        } else if (score > 50) {
            return 'D';
        } else {
            return 'F';
        }
    }
}

