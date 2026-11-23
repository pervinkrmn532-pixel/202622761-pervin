
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Student information
        String[][][] grade = new String[2][10][2];

        // Scores: Korean, English, Math
        int[][][] score = new int[2][10][3];

        // Results: Sum, Class Rank, Grade Rank
        int[][][] result = new int[2][10][3];

        // Average
        float[][] avg = new float[2][10];

        int[] count = new int[2];

        // Input student information
        for (int i = 0; i < 2; i++) {

            System.out.print((i + 1) + "반 학생 수 (최대 10명): ");
            count[i] = sc.nextInt();

            for (int j = 0; j < count[i]; j++) {

                System.out.print("학번: ");
                grade[i][j][0] = sc.next();

                System.out.print("이름: ");
                grade[i][j][1] = sc.next();

                String[] subjects = {"국어", "영어", "수학"};

                for (int k = 0; k < 3; k++) {
                    System.out.print(subjects[k] + " 점수: ");
                    score[i][j][k] = sc.nextInt();
                }

                // Calculate total and average
                result[i][j][0] =
                        score[i][j][0] +
                                score[i][j][1] +
                                score[i][j][2];

                avg[i][j] = result[i][j][0] / 3.0f;
            }
        }

        // Calculate class rank and grade rank
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < count[i]; j++) {

                int classRank = 1;
                int gradeRank = 1;

                for (int a = 0; a < 2; a++) {
                    for (int b = 0; b < count[a]; b++) {

                        if (result[a][b][0] > result[i][j][0]) {
                            gradeRank++;

                            if (a == i) {
                                classRank++;
                            }
                        }
                    }
                }

                result[i][j][1] = classRank;
                result[i][j][2] = gradeRank;
            }
        }

        // Output sorted by class rank
        for (int i = 0; i < 2; i++) {

            System.out.println("\n========== " + (i + 1) + "반 ==========");

            System.out.println(
                    "학번\t이름\t국어\t영어\t수학\t총점\t평균\t반석차\t학년석차"
            );

            for (int rank = 1; rank <= count[i]; rank++) {

                for (int j = 0; j < count[i]; j++) {

                    if (result[i][j][1] == rank) {

                        System.out.printf(
                                "%s\t%s\t%d\t%d\t%d\t%d\t%.2f\t%d\t%d\n",
                                grade[i][j][0],
                                grade[i][j][1],
                                score[i][j][0],
                                score[i][j][1],
                                score[i][j][2],
                                result[i][j][0],
                                avg[i][j],
                                result[i][j][1],
                                result[i][j][2]
                        );
                    }
                }
            }
        }

        sc.close();
    }
}
